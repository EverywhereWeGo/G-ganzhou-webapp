/**
 * PersonActivityVO.java
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
 * ClassName:PersonActivityVO
 * describe：重点人员活跃度
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月20日		下午5:01:13
 *
 */
public class PersonActivityVO {
	

	
	private String tjrq;//统计日期
	
	private String num;//活跃次数

	

	public String getTjrq() {
		return tjrq;
	}

	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	

}

