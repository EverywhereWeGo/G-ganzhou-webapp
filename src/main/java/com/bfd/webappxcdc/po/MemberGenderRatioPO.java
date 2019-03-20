package com.bfd.webappxcdc.po;

import io.swagger.annotations.ApiModelProperty;

/**
 * 会员男女比例实体类.
 *
 * @author wangzhongcheng
 * @Date 2018/12/5 9:41
 */
public class MemberGenderRatioPO {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别", required = true)
    private String mGender;

    /**
     * 性别占比
     */
    @ApiModelProperty(value = "性别占比", required = true)
    private Double genderRatio;

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
     * 获取性别
     */
    public String getmGender() {
        return mGender;
    }

    /**
     * 设置性别
     */
    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    /**
     * 获取性别比例
     */
    public Double getGenderRatio() {
        return genderRatio;
    }

    /**
     * 设置性别比例
     */
    public void setGenderRatio(Double genderRatio) {
        this.genderRatio = genderRatio;
    }
}
