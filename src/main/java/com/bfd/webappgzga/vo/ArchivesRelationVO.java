package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class ArchivesRelationVO {
    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "关系人姓名", required = true)
    private String relname;

    @ApiModelProperty(value = "关系人id", required = true)
    private String relid;

	@ApiModelProperty(value = "关系类型", required = true)
	private String type;

	@ApiModelProperty(value = "次数", required = true)
    private String times;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public String getRelid() {
        return relid;
    }

    public void setRelid(String relid) {
        this.relid = relid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
