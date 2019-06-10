/**
 * WarningInfoVO.java
 * com.bfd.webappxcdc.vo
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月27日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.vo;

/**
 * ClassName:WarningInfoVO
 * describe:预警结果信息
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月27日		上午8:54:32
 *
 */
public class WarningInfoVO {
	
	private String id;
	
	private String modelId;
	
	private String modelResult;
	
	private String modelName;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelResult() {
		return modelResult;
	}

	public void setModelResult(String modelResult) {
		this.modelResult = modelResult;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	

}

