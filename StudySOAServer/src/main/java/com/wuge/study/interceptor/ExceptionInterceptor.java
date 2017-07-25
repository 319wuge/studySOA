package com.wuge.study.interceptor;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.manyi.iw.trade.soa.client.exception.TradeSOAClientException;
import com.manyi.json.FasterJsonTool;
import com.wuge.study.exception.BusinessException;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

/**
 * Created by kehui on 2015/12/24.
 */
public class ExceptionInterceptor implements MethodInterceptor {

    protected Logger logger = Logger.getLogger(getClass());

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long s = System.currentTimeMillis();
        String methodName = methodInvocation.getMethod().getName();
        String className = methodInvocation.getThis().getClass().getSimpleName();
        Object[] arguments = methodInvocation.getArguments();
        String id = "[" + s + "] ";
        //打印参数信息
        StringBuffer param = new StringBuffer(id + className + "." + methodName + " start.param=");
        try {
            param.append((arguments == null || arguments.length == 0) ? "NOPARAM" : FasterJsonTool.writeValueAsString(arguments));
        } catch(Exception e) {

        }
        try {
            Object object = methodInvocation.proceed();
//            logger.info(id + className + "." + methodName
//                    + " excute result=" + FasterJsonTool.writeValueAsString(object));
            return object;
        } catch (Exception e) {
            //内部异常不打印行号
            boolean localException = (e instanceof BusinessException);
            boolean tradeException = (e instanceof TradeSOAClientException);
            if (!localException && !tradeException) {
                logger.warn(param);
                logger.warn(id + "occur A unknown ERROR.msg=" + e.getMessage() + ". details are as follow.");
                StackTraceElement[] stackTrace = e.getStackTrace();
                for (int i = 0; i < stackTrace.length; i++) {
                    if (i > 5)
                        continue;
                    StackTraceElement ele = stackTrace[i];
                    logger.warn(id + "index=" + ele.getClassName() + "."
                            + ele.getMethodName() + ",LineNumber=" + ele.getLineNumber());
                }
            } else {
                logger.warn(param);
                if (localException) {
                    logger.warn(id + " occur A exsits local Exception.msg=" + e.getMessage());
                } else {
                    TradeSOAClientException tradeSOAClientException = (TradeSOAClientException) e;
                    logger.warn(id + " occur A exsits trade Exception.msg=" + tradeSOAClientException.getResponse().getMessage());
                }
            }
            throw e;
        } finally {
            long end = System.currentTimeMillis();
            long inteval = end - s;
            if (inteval > 1500l) {
                logger.warn(id + className + "." + methodName
                        + " execution time " + (end - s) + " ms" + "/" + (end - s) / 1000 + "s");
            }
        }
    }


    public Object old(MethodInvocation methodInvocation) throws Throwable {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            long s = System.currentTimeMillis();
            Object obj = methodInvocation.proceed();
            long end = System.currentTimeMillis();
            long remain = end - s;
            if (remain >= 1000) {
                logger.warn(methodInvocation.getMethod().getName() + " take time " + remain + " ms");
                logger.warn(methodInvocation.getMethod().getName() + "params-->" + objectMapper.writeValueAsString(methodInvocation.getArguments()));
            }
            return obj;
        } catch (Exception e) {
            Object[] arguments = methodInvocation.getArguments();
            if(e instanceof BusinessException || e instanceof TradeSOAClientException) {
                logger.warn("----------------------interceptor warn log start " + methodInvocation.getMethod().getName() + "'s param json array start------------------");
                if (null != arguments && arguments.length > 0) {
                    logger.warn("----------------------interceptor warn log params -->" + objectMapper.writeValueAsString(arguments));
                } else {
                    logger.warn("----------------------interceptor warn log params. method named " + methodInvocation.getMethod().getName() + " has no arguments!");
                }
                logger.warn("----------------------interceptor warn log end " + methodInvocation.getMethod().getName() + "'s param json array end------------------");
            } else {
                logger.error("----------------------interceptor error log start " + methodInvocation.getMethod().getName() + "'s param json array start------------------");
                if (null != arguments && arguments.length > 0) {
                    logger.error("----------------------interceptor error log params -->" + objectMapper.writeValueAsString(arguments));
                } else {
                    logger.error("----------------------interceptor error log params. method named " + methodInvocation.getMethod().getName() + " has no arguments!");
                }
                logger.error("----------------------interceptor error log end " + methodInvocation.getMethod().getName() + "'s param json array end------------------", e);
            }
            throw e;
        }
    }
}
