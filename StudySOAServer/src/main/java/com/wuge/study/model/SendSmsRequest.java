package com.wuge.study.model;

/**
 * Class Package:com.manyi.iw.agentcall.soa.server.shared.model
 * <p/>
 * Created for project: IWAgentCallSOA
 * <p/>
 * Created by QiaoYu on 2015/5/4 0004
 * <p/>
 * Description:短信发送请求数据对象
 */

public class SendSmsRequest {

    /**
     * 短信发送类型
     */
    private Integer smsType;

    /**
     * 短信接收手机号码
     */
    private String mobile;

    /**
     * 短信正文内容
     */
    private String content;

    /**
     * 短信请求来源
     *
     * 1为房源宝
     * 2为爱屋App
     * 3为经纪人PC
     * 5为用户推广短信
     * 6为房东微信验证码
     * 7为经纪人首次登录获取密码
     * 8为经纪人的手机登录校验码
     */
    private Integer msgSource;

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMsgSource() {
        return msgSource;
    }

    public void setMsgSource(Integer msgSource) {
        this.msgSource = msgSource;
    }
}