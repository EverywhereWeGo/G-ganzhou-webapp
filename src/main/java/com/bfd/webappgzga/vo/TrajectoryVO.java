package com.bfd.webappgzga.vo;

import io.swagger.annotations.ApiModelProperty;

public class TrajectoryVO {

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "数据来源", required = true)
    private String datasource;


    @ApiModelProperty(value = "身份证号", required = true)
    private String id;

    @ApiModelProperty(value = "纬度", required = true)
    private String longitude;

    @ApiModelProperty(value = "经度", required = true)
    private String latitude;

    @ApiModelProperty(value = "时间", required = true)
    private long time;

    @ApiModelProperty(value = "是否重点人", required = true)
    private String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "TrajectoryVO{" +
                "name='" + name + '\'' +
                ", datasource='" + datasource + '\'' +
                ", id='" + id + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", time=" + time +
                ", key='" + key + '\'' +
                '}';
    }
}
