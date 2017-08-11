package com.wuge.study.client;

import com.wuge.study.client.sale.ContractClientService;
import com.wuge.study.client.sale.OrderClientService;

/**
 * SOA服务统一接口
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public abstract class StudySOAClient extends BaseSOAClient implements ContractClientService,
        OrderClientService {
    public StudySOAClient(String serverURL) {
        super(standardizeUrl(serverURL));
    }

    public StudySOAClient(String serverURL, int soTimeout) {
        super(standardizeUrl(serverURL), soTimeout);
    }

    public static String standardizeUrl(String url) {
        while (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        return url;
    }
}
