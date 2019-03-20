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

package com.bfd.webappxcdc.vo;

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

	private String idcard;// 身份证号

	// private String platenum;

	private String roadcode;// 车牌号

	private String jd;// 精度

	private String wd;// 維度

	private String passnum;// 通過次數

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getRoadcode() {
		return roadcode;
	}

	public void setRoadcode(String roadcode) {
		this.roadcode = roadcode;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getWd() {
		return wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	public String getPassnum() {
		return passnum;
	}

	public void setPassnum(String passnum) {
		this.passnum = passnum;
	}

}
