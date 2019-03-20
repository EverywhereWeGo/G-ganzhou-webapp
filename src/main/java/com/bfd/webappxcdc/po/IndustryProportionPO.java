package com.bfd.webappxcdc.po;

import io.swagger.annotations.ApiModelProperty;

/**
 * 业态占比实体类.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 19:13
 */
public class IndustryProportionPO {

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 业态
     */
    @ApiModelProperty(value = "业态", required = true)
    private String industryName;

    /**
     * 业态面积
     */
    @ApiModelProperty(value = "业态面积", required = true)
    private Double industryArea;

    /**
     * 统计年份
     */
    @ApiModelProperty(value = "统计年份", required = true)
    private String statisticYear;

    /**
     * 获取id
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取业态名
     * @return
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * 设置业态名
     * @param industryName
     */
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    /**
     * 获取业态面积
     * @return
     */
    public Double getIndustryArea() {
        return industryArea;
    }

    /**
     * 设置业态面积
     * @param industryArea
     */
    public void setIndustryArea(Double industryArea) {
        this.industryArea = industryArea;
    }

    /**
     * 获取统计年份
     * @return
     */
    public String getStatisticYear() {
        return statisticYear;
    }

    /**
     * 设置统计年份
     * @param statisticYear
     */
    public void setStatisticYear(String statisticYear) {
        this.statisticYear = statisticYear;
    }
}
