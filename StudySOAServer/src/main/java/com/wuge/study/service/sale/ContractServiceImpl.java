package com.wuge.study.service.sale;

import com.wuge.api.sale.IContractService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
@Service
public class ContractServiceImpl implements IContractService {

    public Logger logger = Logger.getLogger(getClass());
    @Override
    public void testContract() {
        logger.info("我是SOA里面的测试合同业务！");
    }
}
