/**
 * PersonThermodynamicChart.java
 * com.bfd.webappxcdc.vo
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月20日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
 */

package com.bfd.webappgzga.vo;

/**
 * ClassName:PersonThermodynamicChart describe:人员位置分布热力图
 *
 * @author zhujinyu
 * @version
 * @since Ver 1.1
 * @Date 2019年3月20日 上午10:09:37
 *
 */

public class PersonThermodynamicChartVO {

	private String passnum;


	private String sfzh;

	private String sbbh;

	private String longitude;

	private String latitude;


    public String getPassnum() {
        return passnum;
    }

    public void setPassnum(String passnum) {
        this.passnum = passnum;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh;
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
