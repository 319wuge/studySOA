package com.wuge.study.mqueue;

import com.manyi.mqservice.client.AbstractHandler;
import com.manyi.mqservice.model.MqMessage;

import java.net.SocketAddress;

/**
 * Created by zouwanlong on 2015/9/21.
 */
public class TradeMqHandler extends AbstractHandler {

  //  private Logger logger = Logger.getLogger(getClass());
//    @Value("${mqueue.handler.hostname}")
//    private String mqueueHandlerHostname;
//    @Autowired
//    private ContractServerService contractServerService;
//	@Autowired
//	private BillUserServerService billUserServerService;
//	@Autowired
//	private BillService billService;
//	@Autowired
//	private RentOutAccountService rentOutAccountService;
    @Override
    public void processMessage(MqMessage mqMessage, SocketAddress socketAddress) {
//        if(StringUtils.isNotBlank(IpUtils.getHostName()) && StringUtils.isNotBlank(mqueueHandlerHostname) && IpUtils.getHostName().trim().equals(mqueueHandlerHostname.trim())) {
//			long objectId = mqMessage.getObjectId();
//			String msgType = mqMessage.getMsgType();
//			if(objectId > 0){
//				if("success".equals(msgType)) { //交易成功
//					UpdateTransferStateParam param = new UpdateTransferStateParam();
//					param.setTradeNo(objectId);
//					//佣金
//					billUserServerService.updateTransferState(param);
//					//租金
//					billUserServerService.syncCollectBill(objectId);
//					//租金退款
//					billUserServerService.syncCollectBillRefund(objectId);
//					//佣金退款
//					rentOutAccountService.rentOutAccountOnlineOut(objectId);
//				}
//				else if("fail".equals(msgType)){
//					//佣金退款失败
//					rentOutAccountService.rentOutAccountOnlineOut(objectId);
//				}else if("withdrawSuccess".equals(msgType)){//出款成功
//					billUserServerService.syncCollectBillWithdrawSuccess(objectId);
//				}else if("withdrawFail".equals(msgType)){//出款失败
//					billUserServerService.syncCollectBillWithdrawFail(objectId);
//				} else if ("carryover".equals(msgType)) {
//                    logger.info("carryover state update RentBillTransfer!");
//					//结转成功
//					UpdateRbTransferParam updateRbTransferParam = new UpdateRbTransferParam();
//					updateRbTransferParam.setTradeNo(objectId);
//					billService.updateRbTransfer(updateRbTransferParam);
//				}
//			}
//
//        }else {
//            logger.info("mqHandler pass, IpUtils.getHostName():" + IpUtils.getHostName());
//            logger.info("mqHandler pass, mqueueHandlerHostname:" + mqueueHandlerHostname);
//            logger.info("mqHandler pass, mqid:" + mqMessage.getId());
//        }

    }
}
