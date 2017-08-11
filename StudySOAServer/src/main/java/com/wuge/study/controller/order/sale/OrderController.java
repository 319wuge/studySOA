package com.wuge.study.controller.order.sale;

import com.wuge.api.sale.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
@Controller
@RequestMapping(value = "/sale/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/testLogger.rest")
    @ResponseBody
    public void testLogger() {
        orderService.testLogger();
    }
}
