/**
 * CarActivityVO.java
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
 * ClassName:CarActivityVO
 * describe
 *
 * @author   lenovo
 * @version  车辆活跃度
 * @since    Ver 1.1
 * @Date	 2019年3月20日		下午2:50:32
 *
 */
public class CarActivityVO {
	
	private String rq;//日期
	
	private String cnum;//机动车数量
	
	private String bnum;//两轮车数量

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public String getCnum() {
		return cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public String getBnum() {
		return bnum;
	}

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	
	
	

}

