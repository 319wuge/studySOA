package com.wuge.study.mqueue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manyi.mqservice.client.AbstractHandler;
import com.manyi.mqservice.model.MqMessage;
import com.wuge.study.utils.IpUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.net.SocketAddress;

/**
 * Created by whz on 15-7-29.
 */
@Deprecated
public class AgentUserMqHandler extends AbstractHandler {
   // private Logger logger = Logger.getLogger(getClass());
    @Value("${mqueue.handler.hostname}")
    private String mqueueHandlerHostname;
//    @Autowired
//    private OrderService orderService;
//    @Autowired
//    private SaleContractMemCacheService memCacheService;
    @Override
    public void processMessage(MqMessage mqMessage, SocketAddress socketAddress) {
//        // 判断处理的服务器
//        if(StringUtils.isNotBlank(IpUtils.getHostName())
//                && StringUtils.isNotBlank(mqueueHandlerHostname)
//                    && IpUtils.getHostName().trim().equals(mqueueHandlerHostname.trim())) {
//
//            if("fenliu".equals(mqMessage.getMsgType())) {
//                // 分流消息
//                if(StringUtils.isBlank(mqMessage.getMemo())) {
//                  //  logger.info("mqHandler pass memo is null, mqid:" + mqMessage.getId());
//                    return;
//                }
//                try {
//                    ObjectMapper objectMapper = new ObjectMapper();
//                    MessageContent mc = objectMapper.readValue(mqMessage.getMemo(), MessageContent.class);
//                    if(mc == null) {
//                        //logger.info("mqHandler pass mc is null, mqid:" + mqMessage.getId());
//                        return;
//                    }
//                    //缓存MQ消息的任务记录  key_userId_oldAgentId_newAgentId
//                 //   String key = SaleGlobalConstants.SALE_ORDER_MQ_MEM_KEY + mqMessage.getMsgUID();
//                    //String content = memCacheService.getString(key);
////                    if (StringUtils.isNotBlank(content)) {
////                        //logger.info("job had already done!key=" + key);
////                        return;
////                    }
////                    AddOrderFlowAgentParam param = new AddOrderFlowAgentParam();
////                    List<Long> userIds = new ArrayList<>();
////                    userIds.add(mc.getUserId());
////                    param.setUserIdList(userIds);
////                    param.setAgentId(mc.getOldAgentId());
////                    param.setFlowAgentId(mc.getNewAgentId());
//                    //设置缓存
//              //      memCacheService.setString(key, objectMapper.writeValueAsString(mc), SaleGlobalConstants.SALE_ORDER_MQ_CACHE_EXP);
//                } catch(Exception e) {
//                 //   logger.error("has error ----------------- " + e.getMessage());
//                }
//            }
//        } else {
////            logger.info("mqHandler pass, IpUtils.getHostName():" + IpUtils.getHostName());
////            logger.info("mqHandler pass, mqueueHandlerHostname:" + mqueueHandlerHostname);
////            logger.info("mqHandler pass, mqid:" + mqMessage.getId());
//        }
    }

    public static class MessageContent {
        private Long userId;
        private Long oldAgentId;
        private Long newAgentId;

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getOldAgentId() {
            return oldAgentId;
        }

        public void setOldAgentId(Long oldAgentId) {
            this.oldAgentId = oldAgentId;
        }

        public Long getNewAgentId() {
            return newAgentId;
        }

        public void setNewAgentId(Long newAgentId) {
            this.newAgentId = newAgentId;
        }
    }
}
