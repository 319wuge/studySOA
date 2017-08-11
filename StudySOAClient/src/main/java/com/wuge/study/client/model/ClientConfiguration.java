package com.wuge.study.client.model;

/**
 * Created by sky91 on 2015-03-29.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class ClientConfiguration {
    /**
     * SOA服务器地址
     */
    private String serverUrl;
    /**
     * 使用SOAClient的应用名称
     */
    private String app;
    /**
     * 访问超时
     */
    private Integer soTimeout;
    /**
     * SOA服务器地址url后缀
     */
    private String actionSuffix;

    /**
     * @see #serverUrl
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * @see #serverUrl
     */
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * @see #app
     */
    public String getApp() {
        return app;
    }

    /**
     * @see #app
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * @see #soTimeout
     */
    public Integer getSoTimeout() {
        return soTimeout;
    }

    /**
     * @see #soTimeout
     */
    public void setSoTimeout(Integer soTimeout) {
        this.soTimeout = soTimeout;
    }

    /**
     * @see #actionSuffix
     */
    public String getActionSuffix() {
        return actionSuffix;
    }

    /**
     * @see #actionSuffix
     */
    public void setActionSuffix(String actionSuffix) {
        this.actionSuffix = actionSuffix;
    }
}
