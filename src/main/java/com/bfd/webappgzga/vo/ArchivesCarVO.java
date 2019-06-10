package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class ArchivesCarVO {
    @ApiModelProperty(value = "车牌号", required = true)
    private String platelicense;

    @ApiModelProperty(value = "型号", required = true)
    private String model;

	@ApiModelProperty(value = "颜色", required = true)
	private String colors;

    public String getPlatelicense() {
        return platelicense;
    }

    public void setPlatelicense(String platelicense) {
        this.platelicense = platelicense;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
}
