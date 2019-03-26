package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class ArchivesCaseVO {
    @ApiModelProperty(value = "身份证", required = true)
    private String sfzh;

    @ApiModelProperty(value = "编码", required = true)
    private String code;

    @ApiModelProperty(value = "开始时间", required = true)
    private String start;
    @ApiModelProperty(value = "结束时间", required = true)
    private String end;
    @ApiModelProperty(value = "类型", required = true)
    private String type;


    @ApiModelProperty(value = "状态", required = true)
    private String state;

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
