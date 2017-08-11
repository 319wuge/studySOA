package com.wuge.study.client;

import com.wuge.study.client.internal.ObjectMapperFactory;
import com.wuge.study.client.internal.ServerAccessor;
import com.wuge.study.client.model.ClientConfiguration;
import net.sf.cglib.proxy.Enhancer;

/**
 * 合同SOA服务工厂类，只能用工厂方法{@link #create()}产生服务实例
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class StudySOAClientFactory {
    private static final ServerAccessor SERVER_ACCESSOR = new ServerAccessor(ObjectMapperFactory.create());
    private final ClientConfiguration clientConfiguration;

    /**
     * @param clientConfiguration 参数{@link ClientConfiguration}
     */
    public StudySOAClientFactory(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
    }

    /**
     * 工厂方法，产生服务实例
     *
     * @return {@link StudySOAClient}
     */
    public StudySOAClient create() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(StudySOAClient.class);
        enhancer.setCallback(SERVER_ACCESSOR);
        StudySOAClient client;
        if(clientConfiguration.getSoTimeout() == null) {
            client = (StudySOAClient) enhancer.create(new Class[]{String.class}, new Object[]{clientConfiguration.getServerUrl()});
        } else {
            client = (StudySOAClient) enhancer.create(new Class[]{String.class, int.class},
                                                         new Object[]{clientConfiguration.getServerUrl(), clientConfiguration.getSoTimeout()});
        }
        client.setActionSuffix(clientConfiguration.getActionSuffix());
        client.setApp(clientConfiguration.getApp());
        return client;
    }

}
