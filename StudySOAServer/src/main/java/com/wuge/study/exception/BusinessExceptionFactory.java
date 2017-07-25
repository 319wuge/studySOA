package com.wuge.study.exception;

import com.wuge.study.utils.PropertiesFileParser;
import org.apache.commons.lang3.StringUtils;

/**
 * 异常信息生成工厂，生成BusinessException。
 * <p/>
 * 类读取异常消息properties文件
 *
 * @author whz
 */
public class BusinessExceptionFactory {
    private PropertiesFileParser exceptionMsgReader = null;

    /**
     * 创建code为exceptionKey的异常，并使用exceptionKey去读取parser中保存的对应message
     * <p/>
     * 如果exceptionKey在parser中没有对应，则尝试使用{@link ExceptionKey}
     */
    public BusinessException createBusinessException(String exceptionKey) {
        return createBusinessException(exceptionKey, null);
    }

    public BusinessException createBusinessException(String exceptionKey, String[] args, String paramStr) {
        BusinessException exception = createBusinessException(exceptionKey, args);
        exception.setContextMessage(paramStr);
        return exception;
    }

    /**
     * 创建code为exceptionKey的异常，并使用exceptionKey去读取parser中保存的对应message，
     * 用args来替换message中对应的占位符
     * <p/>
     * 如果exceptionKey在parser中没有对应，则尝试使用{@link ExceptionKey}
     */
    public BusinessException createBusinessException(String exceptionKey, String[] args) {
        BusinessException businessException = new BusinessException(exceptionKey);
        String message = exceptionMsgReader.getString(exceptionKey);
        if(StringUtils.isBlank(message)) {
            message = exceptionMsgReader.getString(ExceptionKey.DEFAULT_KEY);
        }
        businessException.setMessage(message);
        if(args == null || args.length == 0) {
            return businessException;
        }
        for(String argValue : args) {
            businessException.putArgument(argValue);
        }
        return businessException;
    }

    public void setExceptionMsgFile(String fileLocation) {
        exceptionMsgReader = new PropertiesFileParser(fileLocation);
    }

    public void setExceptionMsgParser(PropertiesFileParser parser) {
        exceptionMsgReader = parser;
    }

    public void ifThenThrow(boolean condition, String exceptionKey) throws BusinessException {
        if(condition) {
            throw createBusinessException(exceptionKey);
        }
    }

    public void ifThenThrow(boolean condition, String exceptionKey, String[] args) throws BusinessException {
        if(condition) {
            throw createBusinessException(exceptionKey, args);
        }
    }
}