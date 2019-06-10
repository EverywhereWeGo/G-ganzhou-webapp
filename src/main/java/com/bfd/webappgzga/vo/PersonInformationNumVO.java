package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class PersonInformationNumVO {
    @ApiModelProperty(value = "名称", required = true)
    private String name;

	@ApiModelProperty(value = "类型", required = true)
	private String type;

	@ApiModelProperty(value = "数量", required = true)
	private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
