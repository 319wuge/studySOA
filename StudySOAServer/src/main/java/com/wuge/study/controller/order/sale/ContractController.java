package com.wuge.study.controller.order.sale;

import com.wuge.api.model.vo.LoggerResult;
import com.wuge.api.sale.IContractService;
import com.wuge.study.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
@RequestMapping(value = "/contract")
public class ContractController {

    @Autowired
    private IContractService contractService;

    @RequestMapping(value = "/testContract.rest")
    @ResponseBody
    public Response<LoggerResult> testLogger(String param) {
        Response<LoggerResult> resultResponse = new Response<>();
        resultResponse.setData(contractService.testContract(param));
        return resultResponse;
    }
}
