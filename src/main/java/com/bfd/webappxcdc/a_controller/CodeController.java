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

package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.utils.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
@RequestMapping(CodeController.REQ_PATH)
@Api(value = "CodeController的相关api", description = "获取资产字典")
public class CodeController {
	public static final String REQ_PATH = "/gettype";

	
	@ApiOperation(value = "根据code返回值", nickname = "retcode")
	@RequestMapping(value = "/bycode", method = RequestMethod.GET)
	public ServiceResult<Map> retcode() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("B","二轮车");
        map.put("C","过车");
        map.put("N","网吧");
        map.put("H","旅馆");
        map.put("T","火车");
        map.put("P","民航");
        return new ServiceResult<Map>(map);
    }
}

