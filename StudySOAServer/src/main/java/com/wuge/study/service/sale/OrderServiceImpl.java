package com.wuge.study.service.sale;


import com.wuge.study.sale.IOrderService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
@Service
public class OrderServiceImpl implements IOrderService{

    protected Logger logger = Logger.getLogger(getClass());

    public void testLogger() {
        logger.info("sssssssssssssss");
        System.out.println("测试一下");
    }

    public void testLogger2() {
        logger.info("sssssssssssssss");
        System.out.println("测试一下2");
    }
}
