package com.wuge.study.service.sale;

import com.wuge.study.sale.IContractService;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public class ContractServiceImpl implements IContractService {

    public Logger logger = Logger.getLogger(getClass());
    @Override
    public void testContract() {
        logger.info("测试合同业务！");
    }
}
