package com.wuge.study.client.sale;

import com.wuge.api.sale.IOrderService;
import com.wuge.study.client.internal.SOAServerRequest;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
@SOAServerRequest(url = "order")
public interface OrderClientService extends IOrderService{

    @SOAServerRequest(url = "testLogger1")
    @Override
    public void testLogger() ;

    @SOAServerRequest(url = "testLogger2")
    @Override
    public void testLogger2();
}
