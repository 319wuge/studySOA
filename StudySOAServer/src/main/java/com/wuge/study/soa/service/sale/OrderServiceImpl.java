package com.wuge.study.soa.service.sale;


import com.wuge.study.soa.sale.IOrderService;
import org.apache.log4j.Logger;
/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class OrderServiceImpl implements IOrderService{

    protected Logger logger = Logger.getLogger(getClass());

    public void testLogger() {
        logger.info("sssssssssssssss");
        System.out.println("测试一下");
    }
}
