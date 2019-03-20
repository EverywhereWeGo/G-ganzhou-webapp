package com.bfd.webappxcdc.po;

import io.swagger.annotations.ApiModelProperty;

/**
 * 日常销售额PO.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 14:58
 */
public class DailySaleVolumePO extends BasePO {

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 销售区域
     */
    @ApiModelProperty(value = "销售区域", required = true)
    private String saleArea;

    /**
     * 销售金额
     */
    @ApiModelProperty(value = "销售金额", required = true)
    private Double saleAmount;

    /**
     * 统计时间点
     */
    @ApiModelProperty(value = "统计时间点", required = true)
    private String queryTime;

    /**
     * 获取id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取销售区域
     */
    public String getSaleArea() {
        return saleArea;
    }

    /**
     * 设置销售区域
     */
    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }

    /**
     * 获取销售金额
     */
    public Double getSaleAmount() {
        return saleAmount;
    }

    /**
     * 设置销售金额
     */
    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    /**
     * 获取统计时间点
     */
    public String getQueryTime() {
        return queryTime;
    }

    /**
     * 设置统计时间点
     */
    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }
}
