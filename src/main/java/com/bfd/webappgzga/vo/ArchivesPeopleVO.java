package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class ArchivesPeopleVO {
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "身份证", required = true)
    private String sfzh;

    @ApiModelProperty(value = "住址", required = true)
    private String address;


    @ApiModelProperty(value = "性别", required = true)
    private String sex;


    @ApiModelProperty(value = "出生日期", required = true)
    private String csrq;
    @ApiModelProperty(value = "民族", required = true)
    private String mz;

    @ApiModelProperty(value = "重点人员细类", required = true)
    private String zdryxl;


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getZdryxl() {
        return zdryxl;
    }

    public void setZdryxl(String zdryxl) {
        this.zdryxl = zdryxl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
