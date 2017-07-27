package com.wuge.study.mqueue;

import com.manyi.mqservice.client.AbstractHandler;
import com.manyi.mqservice.model.MqMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.net.SocketAddress;

/**
 * Created by Administrator on 2016/4/5.
 */
public class OrderTradeMQHandler extends AbstractHandler {
//       @Value("${mqueue.handler.hostname}")
//    private String mqueueHandlerHostname;
//
//    @Autowired
//    private TradeService tradeService;
//    @Autowired
//    private SaleContractMemCacheService memCacheService;
//
//    @Autowired
//    private OutAccountService outAccountService;
//
//
//    @Autowired
//    private TradeSOAProxyNew tradeSOAProxyNew;
//
//    private Logger logger = Logger.getLogger(getClass());

    @Override
    public void processMessage(MqMessage mqMessage, SocketAddress socketAddress) {
        // 判断处理的服务器
//        if(StringUtils.isNotBlank(IpUtils.getHostName())
//                && StringUtils.isNotBlank(mqueueHandlerHostname)
//                && IpUtils.getHostName().trim().equals(mqueueHandlerHostname.trim())) {
//            Long tradeId = mqMessage.getObjectId();
//            Integer tradeWay = getTradeWay(tradeId);
//            if(tradeWay.intValue() == TradeWay.vfinanceRefund.getCode()) {
//                // 如果是退款成功，则记录出款所退还的手续费。
//                if("success".equals(mqMessage.getMsgType())) {
//                    try {
//                        AutoCompleteBackMoneyParam autoCompleteBackMoneyParam = new AutoCompleteBackMoneyParam();
//                        autoCompleteBackMoneyParam.setTradeSerialNumber(tradeId);
//                        logger.info("接收消息，退款成功 tradeSerialNumber : " + tradeId);
//                        outAccountService.autoOutAccountBackMoney(autoCompleteBackMoneyParam);
//                    } catch (ContractSOAException e) {
//                        logger.error("mq exception-->mq obj id = " + mqMessage.getObjectId(), e);
//                    }
//                } else if("fail".equals(mqMessage.getMsgType())) {
//                    try {
//                        AutoRejectBackMoneyParam autoRejectBackMoneyParam = new AutoRejectBackMoneyParam();
//                        autoRejectBackMoneyParam.setTradeSerialNumber(tradeId);
//                        logger.info("接收消息，退款失败 tradeSerialNumber : " + tradeId);
//                        outAccountService.antuRejectBackMoney(autoRejectBackMoneyParam);
//                    } catch (ContractSOAException e) {
//                        logger.error("mq exception-->mq obj id = " + mqMessage.getObjectId(), e);
//                    }
//
//                }
//            } else {
//                if("success".equals(mqMessage.getMsgType())) {
//                    //缓存MQ消息的任务记录  key_userId_oldAgentId_newAgentId
//                    String key = SaleGlobalConstants.SALE_ORDER_MQ_MEM_KEY + mqMessage.getMsgUID();
//                    String content = memCacheService.getString(key);
//                    if (StringUtils.isNotBlank(content)) {
//                        logger.info("job had already done!key=" + key);
//                        return;
//                    }
//                    try {
//                        TradeAutoCompleteParam param = new TradeAutoCompleteParam();
//                        param.setTradeSerialNumber(mqMessage.getObjectId());
//                        tradeService.tradeAutoComplete(param);
//                        //设置缓存
//                        memCacheService.setString(key, mqMessage.getMsgUID(), SaleGlobalConstants.SALE_ORDER_MQ_CACHE_EXP);
//                    } catch (ContractSOAException e) {
//                        logger.error("mq exception-->mq obj id = " + mqMessage.getObjectId(), e);
//                    } catch(Exception e) {
//                        logger.error("has error ----------------- " + e.getMessage());
//                    }
//                } else if ("carryover".equals(mqMessage.getMsgType())) {
//                    //结转成功
//                    Long tradeSerialNumber = mqMessage.getObjectId();
//                    UpdateVfTransferInfoParam updateVfTransferInfoParam = new UpdateVfTransferInfoParam();
//                    updateVfTransferInfoParam.setTradeSerialNumber(tradeSerialNumber);
//                    tradeService.updateVfTransferInfo(updateVfTransferInfoParam);
//                }
//            }
//
//
//        } else {
//            logger.info("mqHandler pass, IpUtils.getHostName():" + IpUtils.getHostName());
//            logger.info("mqHandler pass, mqueueHandlerHostname:" + mqueueHandlerHostname);
//            logger.info("mqHandler pass, mqid:" + mqMessage.getId());
//        }
    }

    private Integer getTradeWay(Long tradeId) {
//        GetTradeParam param = new GetTradeParam();
//        List<Long> tradeIdList = new ArrayList<>();
//        tradeIdList.add(tradeId);
//        param.setTradeIdList(tradeIdList);
//        GetTradeResult tradeResult = tradeSOAProxyNew.getTrade(param);
//        Map<Long, TradeDetail> tradeDetailMap = tradeResult.getTradeDetailMap();
//        TradeDetail tradeDetail = tradeDetailMap.get(tradeId);
//        Integer tradeWay = tradeDetail.getWay();
//        return tradeWay;
        return null;
    }


    


}
