package com.wuge.study.controller.order.sale;

import com.wuge.api.sale.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
@RequestMapping(value = "contract")
public class ContractController {

    @Autowired
    private IContractService contractService;

    @RequestMapping(value = "testContract")
    public void testLogger() {
        contractService.testContract();
    }
}
