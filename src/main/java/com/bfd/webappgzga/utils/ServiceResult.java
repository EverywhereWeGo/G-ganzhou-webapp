package com.bfd.webappgzga.utils;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 通用返回值.
 *
 * @author wangzhongcheng
 * @Date 2018-12-04 16:20
 */
@ApiModel(value = "ServiceResult")
public class ServiceResult<T> implements Serializable {

    /**
     * 成功状态码
     */
    private static Integer SUCCESS_CODE = 200;

    /**
     * 成功信息
     */
    private static String SUCCESS_MSG = "success";

    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码")
    private Integer code = ServiceResult.SUCCESS_CODE;

    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息")
    private String msg = ServiceResult.SUCCESS_MSG;

    /**
     * 实体对象
     */
    @ApiModelProperty(value = "实体对象")
    private T data;

    /**
     * 无参构造方法
     */
    public ServiceResult() {
        super();
    }


    /**
     * 带实体对象参数的有参构造
     */
    public ServiceResult(T data) {
        this.data = data;
    }

    /**
     * 只设置了实体对象,其余为null值的静态方法
     *
     * @return ServiceResult对象
     */
    public static ServiceResult serviceSuccessResult(Object data) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.data = data;
        serviceResult.msg = null;
        serviceResult.code = null;
        return serviceResult;
    }

    /**
     * 属性皆设置为空值的静态方法
     *
     * @return ServiceResult对象
     */
    public static ServiceResult serviceSuccessResult() {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.data = null;
        serviceResult.msg = null;
        serviceResult.code = null;
        return serviceResult;
    }


    /**
     * 实体对象设为null值的静态方法
     *
     * @return ServiceResult对象
     */
    public static ServiceResult serviceFailResult(String msg, Integer code) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.data = null;
        serviceResult.msg = msg;
        serviceResult.code = code;
        return serviceResult;
    }


    /**
     * 除返回信息外设置为null值
     *
     * @return ServiceResult对象
     */
    public static ServiceResult serviceFailResult(String msg) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.data = null;
        serviceResult.msg = msg;
        serviceResult.code = null;
        return serviceResult;
    }


    /**
     * 获取实体对象
     */
    public T getdata() {
        return data;
    }

    /**
     * 设置实体对象
     */
    public void setdata(T data) {
        this.data = data;
    }

    /**
     * 获取信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取状态码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置状态码
     */
    public void setCode(Integer code) {
        this.code = code;
    }
}