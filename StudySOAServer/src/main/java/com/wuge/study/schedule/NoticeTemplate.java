package com.wuge.study.schedule;

/**
 * Created by yzy on 2016/4/12.
 * 消息模版
 */
public class NoticeTemplate {

    protected final static String FIELD_INDEX_STR = "##";

    protected final static String LINK_REGEX_STR = "&&";

    protected final static String APP_PUSH_ORDER_BILL  = "爱屋吉屋已收到您的######元，点击'查看详情'，交易账目一键掌握！";

    protected final static String APP_PUSH_ALERT_ORDER_MSG = "爱屋吉屋已收到您的######元，点击查看账单详情";

    protected final static String NOTICE_ORDER_BILL_SMS = "爱屋吉屋已收到您的######元。点击链接&&，交易账目一键掌握！如您尚未安装爱屋吉屋app，请先下载并用本手机号登录。";

    protected final static String NOTICE_APPOINTMENT_SMS = "亲爱的##先生/小姐，" +
            "爱屋吉屋已经为您预约好接下来##行程。" +
            "时间：##。" +
            "地点：##。" +
            "请务必携带以下材料：##。" +
            "##" +
            "顾问：##，" +
            "交易服务专员：## 竭诚为您服务，" +
            "如有疑问请及时咨询您的顾问，退订回复TD。";

    public final static String APP_ORDER_DETAIL_PARAM_URL = "?_type=signorder&orderid=##&ordertype=##&uid=##";

    public final static String APP_PUSH_M_SIGN_INTERVENING_TITLE = "恭喜您已签订房屋居间合同";

    public final static String APP_PUSH_M_SIGN_INTERVENING_MESSAGE = "感谢您对爱屋吉屋的信任，您的下一步操作是网签。后续交易环节提醒及注意事项点击下方'查看详情'";

    public final static String APP_PUSH_M_SIGN_INTERVENING_ALERT = "订单更新：签订房屋居间合同。点击追踪交易进度";

    public final static String M_SIGN_INTERVENING_SMS = "［爱屋吉屋交易提醒］恭喜，您已签订房屋居间合同，下一个交易环节是网签。爱屋吉屋为您提供交易全流程记录与办理注意事项提醒。使用本手机号登录爱屋吉屋app查看“我的－我的订单”，实时掌握交易进度。app下载点击：##，退订回复TD";

    public final static String APP_PUSH_Y_SIGN_INTERVENING_TITLE = "恭喜您已签订房屋居间合同";

    public final static String APP_PUSH_Y_SIGN_INTERVENING_MESSAGE = "感谢您对爱屋吉屋的信任，您的下一步操作是网签。后续交易环节提醒及注意事项点击下方'查看详情'，实时追踪交易进度";

    public final static String APP_PUSH_Y_SIGN_INTERVENING_ALERT = "订单更新：签订房屋居间合同。点击追踪交易进度";

    public final static String Y_SIGN_INTERVENING_SMS = "［爱屋吉屋交易提醒］恭喜，您已签订房屋居间合同，下一个交易环节是网签。爱屋吉屋为您提供交易全流程记录与办理注意事项提醒。使用本手机号登录爱屋吉屋app查看'我的－我的订单'，实时掌握交易进度。app下载点击：##，退订回复TD";

    public final static String SECURITY_SMS = "[重要提示]为了您的资金安全，爱屋吉屋建议您在支付佣金时登录爱屋吉屋app在线支付或pos机刷卡支付，比现金更有保障！app下载点击：##，退订回复TD[爱屋吉屋]";


    public final static String APP_PUSH_M_NET_SIGN_TITLE = "恭喜您已完成网签";

    public final static String APP_PUSH_M_NET_SIGN_MESSAGE = "您的下一步操作是过户准备。后续交易环节提醒及注意事项点击下方'查看详情'";

    public final static String APP_PUSH_M_NET_SIGN_ALERT = "订单更新：完成网签。点击追踪交易进度";

    public final static String M_NET_SIGN_SMS = "［爱屋吉屋交易提醒］恭喜，您已完成网签，下一个交易环节是过户准备。爱屋吉屋为您提供交易全流程记录与办理注意事项提醒。使用本手机号登录爱屋吉屋app查看'我的－我的订单'，实时掌握交易进度。app下载点击：##，退订回复TD";

    public final static String APP_PUSH_Y_NET_SIGN_TITLE = "恭喜您已完成网签";

    public final static String APP_PUSH_Y_NET_SIGN_MESSAGE = "您的下一步操作是过户准备。后续交易环节提醒及注意事项点击下方'查看详情'";

    public final static String APP_PUSH_Y_NET_SIGN_ALERT = "订单更新：完成网签。点击追踪交易进度";

    public final static String Y_NET_SIGN_SMS = "［爱屋吉屋交易提醒］恭喜，您已完成网签，下一个交易环节是过户准备。爱屋吉屋为您提供交易全流程记录与办理注意事项提醒。使用本手机号登录爱屋吉屋app查看'我的－我的订单'，实时掌握交易进度。app下载点击：##，退订回复TD";


    public final static String APP_PUSH_M_TRANSFER_TITLE = "恭喜您已成功过户";

    public final static String APP_PUSH_M_TRANSFER_MESSAGE = "感谢您对爱屋吉屋的信任，预计20个工作日后您可领取产证。点击'查看详情'";

    public final static String APP_PUSH_M_TRANSFER_ALERT = "订单更新：过户成功。点击追踪交易进度";

    public final static String APP_PUSH_Y_TRANSFER_TITLE = "您已成功过户";

    public final static String APP_PUSH_Y_TRANSFER_MESSAGE = "感谢您对爱屋吉屋的信任，您已完成过户。点击'查看详情'";

    public final static String APP_PUSH_Y_TRANSFER_ALERT = "订单更新：过户成功。点击追踪交易进度";


    public final static String APP_PUSH_M_LOAN_INSTALLMENT_LOAN_TITLE = "恭喜您的贷款申请银行已审批";

    public final static String APP_PUSH_M_LOAN_INSTALLMENT_LOAN_MESSAGE = "请提前整理准备好相关材料准备过户。后续交易环节提醒及注意事项点击下方'查看详情'";

    public final static String APP_PUSH_M_LOAN_INSTALLMENT_LOAN_ALERT = "订单更新：银行已批贷。点击追踪交易进度";

    public final static String M_LOAN_INSTALLMENT_LOAN_SMS = "［爱屋吉屋交易提醒］恭喜，您的贷款申请银行已审批。请提前整理准备好相关材料准备过户，材料清单我司会有短信通知。使用本手机号登录爱屋吉屋app查看'我的－我的订单'，实时追踪交易进度。app下载点击：##，退订回复TD";



    //获取推送app二手房账单消息通知文本
    public static String getSaleOrderBillNoticeContent(String num,String payType,String payMoney){
        return convert(APP_PUSH_ORDER_BILL,num,payType,payMoney);
    }

    //获取推送app二手房账单提示信息
    public static String getSaleOrderBillAlertMsg(String num,String payType,String payMoney){
        return convert(APP_PUSH_ALERT_ORDER_MSG,num,payType,payMoney);
    }

    //获取二手房账单短信信息
    public static String getOrderBillSms(String num,String payTyppe,String payMoney,String linkUrl){
        return convertLink(convert(NOTICE_ORDER_BILL_SMS,num,payTyppe,payMoney),linkUrl);
    }

    //获取预约短信
    public static String getAppointmentSms(String userName,String steps,String appointTime,String appointAddr,
                                           String appointmentData,String appointmentSup,String agentName,String oprationName){
        return convert(NOTICE_APPOINTMENT_SMS,"",steps,appointTime,appointAddr,appointmentData,appointmentSup,agentName,oprationName);
    }


    public static String convert(String source,Object... fields){
        if(source.indexOf(FIELD_INDEX_STR) == -1)
            return source;
        for(Object field : fields){
            source = source.replaceFirst(FIELD_INDEX_STR,String.valueOf(field));
        }
        return source;
    }

    public static String convertLink(String source,String... hrefs){
        if(source.indexOf(LINK_REGEX_STR) == -1)
            return source;
        for(String href : hrefs){
            source = source.replaceFirst(LINK_REGEX_STR,href);
        }
        return source;
    }

    public static void main(String[] args) {
        System.out.println(getOrderBillSms("第3笔","佣金","888888","http://www.baidu.com"));
    }
}
