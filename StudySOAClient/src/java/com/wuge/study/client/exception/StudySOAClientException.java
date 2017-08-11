package com.wuge.study.client.exception;

import com.wuge.api.model.exception.StudySOAException;
import com.wuge.study.client.model.Response;

/**
 * Created by sky91 on 2015-03-30.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class StudySOAClientException extends StudySOAException {
    private Response response;

    /**
     * @see ContractSOAException#ContractSOAException()
     */
    public StudySOAClientException() {
        super();
    }

    /**
     * @param response {@link Response}
     * @see ContractSOAException#ContractSOAException()
     */
    public StudySOAClientException(Response response) {
        this.response = response;
    }

    /**
     * @param response {@link Response}
     * @see ContractSOAException#ContractSOAException(String)
     */
    public StudySOAClientException(String message, Response response) {
        super(message);
        this.response = response;
    }

    /**
     * @param response {@link Response}
     * @see ContractSOAException#ContractSOAException(String, Throwable)
     */
    public StudySOAClientException(String message, Throwable cause, Response response) {
        super(message, cause);
        this.response = response;
    }

    /**
     * @param response {@link Response}
     * @see ContractSOAException#ContractSOAException(Throwable)
     */
    public StudySOAClientException(Throwable cause, Response response) {
        super(cause);
        this.response = response;
    }

    /**
     * @param response {@link Response}
     * @see ContractSOAException#ContractSOAException(String, Throwable, boolean, boolean)
     */
    public StudySOAClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Response response) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.response = response;
    }

    /**
     * @see Response
     */
    public Response getResponse() {
        return response;
    }

    @Override
    public String getMessage() {
        if(response == null) {
            return super.getMessage();
        }
        return (super.getMessage() == null ? "" : super.getMessage()) + ", response:" + response;
    }
}
