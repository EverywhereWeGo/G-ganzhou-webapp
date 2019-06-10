/**
 * WarningInfoServiceImpl.java
 * com.bfd.webappxcdc.b_service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月27日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.b_service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfd.webappgzga.b_service.WarningInfoService;
import com.bfd.webappgzga.c_dao.WarningInfoDao;
import com.bfd.webappgzga.vo.WarningInfoVO;

/**
 * ClassName:WarningInfoServiceImpl
 * describe
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月27日		上午8:59:35
 *
 */
@Service(value = "WarningInfoService")
public class WarningInfoServiceImpl implements WarningInfoService {
	
	@Autowired
	private WarningInfoDao warningInfoDao;

	@Override
	public List<WarningInfoVO> getWarningInfoList() {
		
		return warningInfoDao.getWarningInfoList();
		
	}

}

