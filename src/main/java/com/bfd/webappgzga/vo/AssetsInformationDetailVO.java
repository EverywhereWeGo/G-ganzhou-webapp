package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class AssetsInformationDetailVO {
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "维度", required = true)
    private String latitude;

    @ApiModelProperty(value = "经度", required = true)
    private String longitude;

    @ApiModelProperty(value = "地址", required = true)
    private String address;

    @ApiModelProperty(value = "类型", required = true)
    private String type;

    @ApiModelProperty(value = "状态", required = true)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
