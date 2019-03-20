package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class PersonInformationDetailVO {

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "性别", required = true)
    private String sex;


	@ApiModelProperty(value = "生日", required = true)
	private String birthday;

	@ApiModelProperty(value = "身份证", required = true)
	private String id;

    @ApiModelProperty(value = "经度", required = true)
    private String longitude;


    @ApiModelProperty(value = "纬度", required = true)
    private String latitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
