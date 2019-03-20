/**
 * PersonThermodynamicDao.java
 * com.bfd.webappxcdc.c_dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月20日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappxcdc.c_dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bfd.webappxcdc.vo.CarActivityVO;
import com.bfd.webappxcdc.vo.PersonActivityVO;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;

/**
 * ClassName:PersonThermodynamicDao
 * describe
 *
 * @author   zhujinyu
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月20日		上午10:11:14
 *
 */
@Mapper
public interface PersonThermodynamicDao {
	/**
	 * 
	 * getChartNum:(根据证件号码获取人员热力分布)
	 * 
	 * @param  @param hm  证件号码
	 * @param  @return    List
	 * @return List<PersonThermodynamicChart>    DOM对象
	 */
	List<PersonThermodynamicChartVO> getChartNum(String hm);
	/**
	 * 
	 * getCarActivity:(獲取24小時內的車輛活躍度)
	 * TODO
	 *
	 * @param  @return    设定文件
	 * @return List<CarActivityVO>    DOM对象
	 */
	List<CarActivityVO> getCarActivity();
	/**
	 * 
	 * getPersonActivity:(获取最近10天的重点人员活跃度)
	 * 
	 *
	 * @param  @return    设定文件
	 * @return List<PersonActivityVO>    DOM对象
	 */
	List<PersonActivityVO> getPersonActivity();
	
	

}

