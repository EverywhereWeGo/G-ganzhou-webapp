package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class SearchInformationVO {
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "身份证", required = true)
    private String sfzh;

	@ApiModelProperty(value = "车牌号", required = true)
	private String cph;

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

    public String getCph() {
        return cph;
    }

    public void setCph(String cph) {
        this.cph = cph;
    }
}
