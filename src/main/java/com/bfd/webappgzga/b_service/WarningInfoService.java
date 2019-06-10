/**
 * WarningInfoService.java
 * com.bfd.webappxcdc.b_service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月27日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.b_service;

import java.util.List;

import com.bfd.webappgzga.vo.WarningInfoVO;

/**
 * ClassName:WarningInfoService
 * describe
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月27日		上午8:58:56
 *
 */
public interface WarningInfoService {
	List<WarningInfoVO> getWarningInfoList();

}

