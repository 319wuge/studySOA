package com.wuge.study.model;

/**
 * Created by sky91 on 2015-03-30.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class Response<T> {
    private long errorCode;
    private String message;
    private T data;

    public long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{errorCode:" + errorCode + ", message:" + message + "}";
    }
}
