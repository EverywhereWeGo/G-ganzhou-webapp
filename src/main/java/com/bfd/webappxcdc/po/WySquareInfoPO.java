package com.bfd.webappxcdc.po;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * 吾悦广场信息.
 *
 * @author wangzhongcheng
 * @Date 2018/12/3 15:07
 */
public class WySquareInfoPO extends BasePO {

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 广场名称
     */
    @ApiModelProperty(value = "广场名称", required = true)
    @NotNull
    private String squareName;

    /**
     * 分区名
     */
    @ApiModelProperty(value = "分区名", required = true)
    @NotNull
    private String partitionName;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 开业日期
     */
    @ApiModelProperty(value = "开业日期", required = true)
    private String openingDate;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String dateComment = "无";

    /**
     * 获取id.
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
     * 获取广场名
     */
    public String getSquareName() {
        return squareName;
    }

    /**
     * 设置广场名
     */
    public void setSquareName(String squareName) {
        this.squareName = squareName;
    }

    /**
     * 获取分区名
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * 设置分区名
     */
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    /**
     * 获取开业日期
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * 设置开业日期
     */
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * 获取备注
     */
    public String getDateComment() {
        return dateComment;
    }

    /**
     * 设置备注
     */
    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
