package com.bfd.webappxcdc.exception;


import com.bfd.webappxcdc.enums.BizExceptionEnum;

/**
 * 业务异常
 *
 * @author zhanyong
 * @Date 2017-12-19 21:11:57
 */
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    public BizException(Integer errorCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(BizExceptionEnum bizExceptionEnum){
        super(bizExceptionEnum.getErrordesc());
        this.errorCode = bizExceptionEnum.getErrorCode();
        this.errorMsg = bizExceptionEnum.getErrordesc();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
