package com.wuge.study.soa;

import com.wuge.study.soa.service.sale.OrderServiceImpl;
import com.wuge.study.soa.sale.IOrderService;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @org.junit.Test
    public void testLogger() {
        IOrderService service = new OrderServiceImpl();
        service.testLogger();
    }
}
