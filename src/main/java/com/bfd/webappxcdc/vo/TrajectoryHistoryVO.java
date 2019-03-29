package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class TrajectoryHistoryVO {

    @ApiModelProperty(value = "身份证号", required = true)
    private String id;

    @ApiModelProperty(value = "纬度", required = true)
    private String latitude;

    @ApiModelProperty(value = "经度", required = true)
    private String longitude;

    @ApiModelProperty(value = "时间", required = true)
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
