package com.wuge.study.interceptor;

import com.wuge.study.exception.BusinessException;
import com.wuge.study.exception.ExceptionKey;
import com.manyi.iw.trade.soa.client.exception.TradeSOAClientException;
import com.wuge.study.model.Response;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hays on 14/11/13.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    protected Logger logger = Logger.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response<Void> handle(Exception ex) {

        Response<Void> result = new Response<Void>();
        if(ex instanceof BusinessException) {
            String errorCode = ((BusinessException) ex).getErrorCode();
            result.setErrorCode(Integer.parseInt(errorCode));
            result.setMessage(((BusinessException) ex).getMessage());
            logger.warn(((BusinessException) ex).getDetailMessage());
        } else if(ex instanceof TradeSOAClientException){
            result.setErrorCode(Integer.parseInt(ExceptionKey.DEFAULT_KEY));
            result.setMessage(((TradeSOAClientException) ex).getResponse().getMessage());
            logger.warn(ex.getMessage());
        }else {
            result.setErrorCode(Integer.parseInt(ExceptionKey.DEFAULT_KEY));
            result.setMessage(ExceptionKey.DEFAULT_MSG);
            logger.error(ExceptionKey.DEFAULT_KEY, ex);
        }
        return result;
    }
}
