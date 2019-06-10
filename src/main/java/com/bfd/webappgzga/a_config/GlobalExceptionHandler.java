package com.bfd.webappgzga.a_config;



import com.bfd.webappgzga.enums.BizExceptionEnum;
import com.bfd.webappgzga.exception.BizException;
import com.bfd.webappgzga.utils.ServiceResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

/**
 * 全局异常处理
 *
 * @author zhanyong
 * @Date 2017-12-19 21:11:57
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截捕捉自定义异常 BizException.class
     */
    @ResponseBody
    @ExceptionHandler(value = BizException.class)
    public ServiceResult errorHandler(BizException e) {
        logger.error("业务异常 errorMsg={}", e.getErrorMsg());
        logger.error("错误信息", e);
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(e.getErrorMsg());
        serviceResult.setCode(e.getErrorCode());
        return serviceResult;
    }

    /**
     * 拦截捕捉异常 Exception.class
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ServiceResult errorHandler(Exception e) {
        logger.error("业务异常 errorMsg={}", e.toString());
        logger.error("错误信息", e);
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(e.getMessage());
        serviceResult.setCode(BizExceptionEnum.SYS_EXCEPTION.getErrorCode());
        return serviceResult;
    }

    /**
     * 拦截捕捉异常 ParseException.class
     */
    @ResponseBody
    @ExceptionHandler(value = ParseException.class)
    public ServiceResult errorHandler(ParseException e) {
        logger.error("业务异常 errorMsg={}", e.toString());
        logger.error("错误信息", e);
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg("日期转换错误");
        serviceResult.setCode(BizExceptionEnum.SYS_EXCEPTION.getErrorCode());
        return serviceResult;
    }


}
