/**
 * WarningInfoDao.java
 * com.bfd.webappxcdc.c_dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月27日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.c_dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bfd.webappgzga.vo.WarningInfoVO;

/**
 * ClassName:WarningInfoDao
 * describe
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月27日		上午8:57:14
 *
 */
@Mapper
public interface WarningInfoDao {
	
	List<WarningInfoVO> getWarningInfoList();

}

