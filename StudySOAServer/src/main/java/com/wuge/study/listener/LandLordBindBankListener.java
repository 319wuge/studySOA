package com.wuge.study.listener;

import com.netfinworks.mq.handler.notify.AbstractNotifyMessageHandler;
import org.apache.log4j.Logger;

/**
 *
 */
public class LandLordBindBankListener extends AbstractNotifyMessageHandler {
    private Logger logger = Logger.getLogger(getClass());

//    @Autowired
//    private MBFinClient mbFinClient;
//    @Autowired
//    private AgentContractReadDao agentContractReadDao;
//    @Autowired
//    private AgentContractWriteDao agentContractWriteDao;
//    @Autowired
//    private AgentContractBillWriteDao agentContractBillWriteDao;
//    @Autowired
//    private AgentContractBillReadDao agentContractBillReadDao;
//    @Autowired
//    private BillServerService billServerService;
//    @Autowired
//    private AgentContractCollectBillReadDao agentContractCollectBillReadDao;
//    @Autowired
//    private AgentContractCollectBillWriteDao agentContractCollectBillWriteDao;
//    @Autowired
//    private Cryptor cryptor;


    @Override
    public void handleMessage(Object request) throws Exception {
        // 2017-02-16 email:remove rent contract create bill for alc
//        String userId = (String) request;//房东绑卡的用户Id
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("identity_no", userId);
//        paramMap.put("identity_type", "UID");
//        QueryVerifyResponse response = mbFinClient.queryVerify(paramMap);
//        if (null != response) {
//            String id_card_no = response.getId_card_no();//房东绑卡的身份证号
//            AgentContractExample contractExample = new AgentContractExample();
//            Date nowDate = new Date();
//            contractExample.or().andLandlordIdNoEqualTo(cryptor.encodeIdNo(id_card_no)).andContractTimeGreaterThanOrEqualTo(DateUtil.getDateByAmount(nowDate, -2)).andContractTimeLessThanOrEqualTo(nowDate);
//            List<AgentContract> agentContracts = agentContractReadDao.selectByExample(contractExample);
//            if (null != agentContracts && agentContracts.size() > 0) {
//                for (AgentContract contract : agentContracts) {
//                    contract.setLandlordUserId(Long.valueOf(userId));
//                    //更新出租合同中的房东ID
//                    agentContractWriteDao.updateByPrimaryKey(contract);
//                    AgentContractCollectBillExample collectBillExample = new AgentContractCollectBillExample();
//                    collectBillExample.or().andContractIdEqualTo(contract.getId());
//                    int collectBillNum = agentContractCollectBillReadDao.countByExample(collectBillExample);
//                    if (collectBillNum == 0) {
//                        CreateCollectBillParam collectBillParam = new CreateCollectBillParam();
//                        collectBillParam.setRent(contract.getRent());
//                        collectBillParam.setContractId(contract.getId());
//                        collectBillParam.setLandlordId(Long.valueOf(userId));
//                        collectBillParam.setTenantId(contract.getUserId());
//                        collectBillParam.setLeaseStart(contract.getLeaseStart());
//                        collectBillParam.setLeaseEnd(contract.getLeaseEnd());
//                        billServerService.createCollectBill(collectBillParam);
//                    } else {
//                        AgentContractCollectBillExample collectBillExample1 = new AgentContractCollectBillExample();
//                        collectBillExample1.or().andContractIdEqualTo(contract.getId());
//                        agentContractCollectBillWriteDao.updateCollectBillByContractId(contract.getId(), Long.valueOf(userId));
//                    }
//                    //更新佣金账单房东userId
//                    AgentContractBillExample contractBillExample = new AgentContractBillExample();
//                    AgentContractBillExample.Criteria criteria = contractBillExample.or();
//                    criteria.andTypeEqualTo(1);
//                    criteria.andContractIdEqualTo(contract.getId());
//                    List<AgentContractBill> contractBills = agentContractBillReadDao.selectByExample(contractBillExample);
//                    if (null != contractBills && contractBills.size() > 0) {
//                        for (AgentContractBill contractBill : contractBills) {
//                            contractBill.setUserId(Long.valueOf(userId));
//                            agentContractBillWriteDao.updateByPrimaryKey(contractBill);
//                        }
//                    }
//                }
//            } else {
//                logger.info("48小时内合同系统中不存在身份证号：" + id_card_no + "的出租合同！");
//            }
//        } else {
//            logger.info("调用mbFinClient.queryVerify接口异常！");
//        }
    }
}
