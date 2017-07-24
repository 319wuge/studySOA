package com.wuge.study;

import com.wuge.study.sale.IContractService;
import com.wuge.study.service.sale.ContractServiceImpl;
import com.wuge.study.service.sale.OrderServiceImpl;
import com.wuge.study.sale.IOrderService;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testLogger() {
        IOrderService service = new OrderServiceImpl();
        service.testLogger2();
    }

    @Test
    public void testContractLogger() {
        IContractService service = new ContractServiceImpl();
        service.testContract();
    }
}
