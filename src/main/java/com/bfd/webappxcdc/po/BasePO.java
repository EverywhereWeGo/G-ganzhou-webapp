package com.bfd.webappxcdc.po;

import java.util.Date;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * 持久化对象基类.
 *
 * @author wangzhongcheng
 * @Date 2018-12-3 14:51:15
 */
public class BasePO {

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", required = false)
    private String createUser;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人", required = false)
    private String updateUser;

    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    protected Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(hidden = true)
    protected Date updateTime;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    @ApiModelProperty(hidden = true)
    protected Integer isDelete;

    /**
     * 获取创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 设置更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 创建更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除状态
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置删除状态
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
