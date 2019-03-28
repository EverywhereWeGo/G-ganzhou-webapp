package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class PersonInformationDetailVO {

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "身份证", required = true)
    private String id;


	@ApiModelProperty(value = "地址", required = true)
	private String address;



    @ApiModelProperty(value = "维度", required = true)
    private String latitude;

    @ApiModelProperty(value = "经度", required = true)
    private String longitude;

    @ApiModelProperty(value = "时间", required = true)
    private String lasttime;

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @ApiModelProperty(value = "是否重点人", required = true)
    private String key;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
