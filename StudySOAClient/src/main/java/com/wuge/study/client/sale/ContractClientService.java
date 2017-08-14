package com.wuge.study.client.sale;

import com.wuge.api.model.vo.LoggerResult;
import com.wuge.api.sale.IContractService;
import com.wuge.study.client.internal.SOAServerRequest;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
@SOAServerRequest(url = "/contract")
public interface ContractClientService extends IContractService {

    @SOAServerRequest(url = "/testContract")
    @Override
    public LoggerResult testContract(String param);
}
