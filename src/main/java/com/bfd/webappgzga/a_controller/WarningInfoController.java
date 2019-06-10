/**
 * WarningInfoController.java
 * com.bfd.webappxcdc.a_controller
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月27日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.a_controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfd.webappgzga.b_service.WarningInfoService;
import com.bfd.webappgzga.utils.ServiceResult;
import com.bfd.webappgzga.vo.WarningInfoVO;

/**
 * ClassName:WarningInfoController
 * describe
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月27日		上午9:01:55
 *
 */
@RestController
@RequestMapping(WarningInfoController.REQ_PATH)
@Api(value = "WarningInfoController的相关api", description = "预警信息结果")
public class WarningInfoController {
	public static final String REQ_PATH = "/warningInfo";
	
	@Autowired
	private WarningInfoService warningInfoService;
	
	@ApiOperation(value = "查询范围内的设备", nickname = "getWarningInfoList")
	@RequestMapping(value = "/WarningInfoList", method = RequestMethod.GET)
	public ServiceResult<List<WarningInfoVO>> getWarningInfoList() {
		return new ServiceResult<List<WarningInfoVO>>(
				warningInfoService.getWarningInfoList());
	}

}

