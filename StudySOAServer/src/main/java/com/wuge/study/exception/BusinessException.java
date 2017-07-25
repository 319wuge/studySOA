package com.wuge.study.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky91 on 2015-03-30.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class BusinessException extends RuntimeException {
    private static final String ArgKey = "#VAR#";
    /**
     * 异常代码
     */
    private String errorCode;
    /**
     * 异常消息
     */
    private String message;
    //异常信息 的 上下文信息，（接口参数）
    private String contextMessage;
    /**
     * 异常消息参数
     */
    private List<String> args = new ArrayList<String>();

    public BusinessException() {
    }

    public BusinessException(String errorCode) {
        this.errorCode = errorCode;
    }

    public BusinessException(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        if(args == null || args.size() == 0) {
            return this.message;
        }
        String messageTemp = message;
        for(String argValue : args) {
            if(argValue == null) {
                messageTemp = messageTemp.replaceFirst(ArgKey, "null");
            } else {
                messageTemp = messageTemp.replaceFirst(ArgKey, argValue);
            }
        }
        return messageTemp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void putArgument(String arg) {
        args.add(arg);
    }

    public String getArgument(int index) {
        if(index <= args.size() - 1 && index >= 0) {
            return args.get(index);
        } else {
            return null;
        }
    }

    public int getArgsCount() {
        return args.size();
    }

    public String getContextMessage() {
        return contextMessage;
    }

    public void setContextMessage(String contextMessage) {
        this.contextMessage = contextMessage;
    }

    /**
     * 获取详细异常信息
     * @return
     */
    public String getDetailMessage() {
        if(null == this.contextMessage){
            return this.getMessage();
        } else {
            return this.getMessage() + "context:"+this.contextMessage;
        }
    }

}
