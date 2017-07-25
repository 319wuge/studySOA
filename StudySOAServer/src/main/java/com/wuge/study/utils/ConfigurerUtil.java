package com.wuge.study.utils;

public class ConfigurerUtil {
    /**
     * 短信推送server url
     */
    private String MS_URL;
    /***
     * 
     * 功能描述:callcenter url;
     */
    private String CALLCENTER_URL;

    /**
     *  功能描述:IW推送url;
     */
    private String IW_PUSH_URL;

    private String IW_PUSH_URL_AGENT;

    public String getMS_URL() {
        return MS_URL;
    }

    public void setMS_URL(String mS_URL) {
        MS_URL = mS_URL;
    }

    public String getCALLCENTER_URL() {
        return CALLCENTER_URL;
    }

    public void setCALLCENTER_URL(String cALLCENTER_URL) {
        CALLCENTER_URL = cALLCENTER_URL;
    }

    public String getIW_PUSH_URL() {
        return IW_PUSH_URL;
    }

    public void setIW_PUSH_URL(String iW_PUSH_URL) {
        IW_PUSH_URL = iW_PUSH_URL;
    }

    public String getIW_PUSH_URL_AGENT() {
        return IW_PUSH_URL_AGENT;
    }

    public void setIW_PUSH_URL_AGENT(String iW_PUSH_URL_AGENT) {
        IW_PUSH_URL_AGENT = iW_PUSH_URL_AGENT;
    }

}