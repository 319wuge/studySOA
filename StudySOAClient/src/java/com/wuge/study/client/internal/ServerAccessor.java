package com.wuge.study.client.internal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuge.study.client.BaseSOAClient;
import com.wuge.study.client.exception.StudySOAClientException;
import com.wuge.study.client.model.Response;
import net.sf.cglib.asm.ClassWriter;
import net.sf.cglib.asm.MethodVisitor;
import net.sf.cglib.asm.Opcodes;
import net.sf.cglib.asm.Type;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 拦截SOA的网络访问方法的MethodInterceptor，执行实际网络访问
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class ServerAccessor extends ClassLoader implements MethodInterceptor {
    public static final String HTTP_REQUEST_PARAM_KEY = "param";
    private final ObjectMapper objectMapper;

    public ServerAccessor(ObjectMapper objectMapper) {
        super(ServerAccessor.class.getClassLoader());
        this.objectMapper = objectMapper;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        SOAServerRequest methodAnnotation = method.getAnnotation(SOAServerRequest.class);
        if(methodAnnotation == null) {
            return methodProxy.invokeSuper(o, objects);
        }
        SOAServerRequest classAnnotation = method.getDeclaringClass().getAnnotation(SOAServerRequest.class);
        BaseSOAClient client = (BaseSOAClient) o;
        HashMap<String, Object> map = new HashMap<>(2);
        map.put(HTTP_REQUEST_PARAM_KEY, objectMapper.writeValueAsString(objects[0]));
        Response response;
        try {
            String responseString = client.httpPost(map, classAnnotation.url() + methodAnnotation.url());
            response = objectMapper.reader(getResponseTypeReference(method.getReturnType())).readValue(responseString);
        } catch(Exception e) {
            response = new Response<>();
            response.setErrorCode(-1);
            response.setMessage("Exception");
            throw new StudySOAClientException(e, response);
        }
        if(response.getErrorCode() != 0) {
            throw new StudySOAClientException(response);
        }
        return response.getData();
    }

    private TypeReference getResponseTypeReference(Class responseGenericType) {
        try {
            return (TypeReference) loadTypeReference(responseGenericType).newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Class loadTypeReference(Class responseGenericType) {
        String className = String.valueOf(getClass()) + "$TypeReference" + responseGenericType.getSimpleName() + "$" + responseGenericType.hashCode();
        try {
            return loadClass(className);
        } catch(ClassNotFoundException e) {
            String internalClassName = className.replaceAll("\\.", "/");
            String internalSuperClassName = Type.getInternalName(TypeReference.class);
            String genericSignature = "L" + internalSuperClassName + "<L" + Type.getInternalName(Response.class) + "<L" + Type.getInternalName(
                    responseGenericType) + ";>;>;";
            ClassWriter classWriter = new ClassWriter(0);
            classWriter.visit(Opcodes.V1_7, Opcodes.ACC_PUBLIC, internalClassName, genericSignature, internalSuperClassName, null);
            MethodVisitor mv = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "com/fasterxml/jackson/core/type/TypeReference", "<init>", "()V");
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
            classWriter.visitEnd();
            byte[] byteCode = classWriter.toByteArray();
            return defineClass(className, byteCode, 0, byteCode.length);
        }
    }
}
