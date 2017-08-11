package com.wuge.api.model.exception;

/**
 * Created by sky91 on 2015-03-26.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class StudySOAException extends Exception {
    /**
     * @see Exception#Exception()
     */
    public StudySOAException() {
    }

    /**
     * @see Exception#Exception(String)
     */
    public StudySOAException(String message) {
        super(message);
    }

    /**
     * @see Exception#Exception(String, Throwable)
     */
    public StudySOAException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @see Exception#Exception(Throwable)
     */
    public StudySOAException(Throwable cause) {
        super(cause);
    }

    /**
     * @see Exception#Exception(String, Throwable, boolean, boolean)
     */
    public StudySOAException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
