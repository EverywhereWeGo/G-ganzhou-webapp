package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class HandleCaseVO {
    @ApiModelProperty(value = "身份证", required = true)
    private String id;
    @ApiModelProperty(value = "出现次数", required = true)
    private String num;
    @ApiModelProperty(value = "类型出现次数", required = true)
    private Map typenum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Map getTypenum() {
        return typenum;
    }

    public void setTypenum(Map typenum) {
        this.typenum = typenum;
    }
}
