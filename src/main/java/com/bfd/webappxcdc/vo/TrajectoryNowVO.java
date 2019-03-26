package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class TrajectoryNowVO {

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

	@ApiModelProperty(value = "身份证号", required = true)
	private String id;

    @ApiModelProperty(value = "纬度", required = true)
    private String longitude;

    @ApiModelProperty(value = "经度", required = true)
    private String latitude;

    @ApiModelProperty(value = "时间", required = true)
    private String time;

    @ApiModelProperty(value = "是否重点人", required = true)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
