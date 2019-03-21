package com.bfd.webappxcdc.b_service;

import java.util.List;

import com.bfd.webappxcdc.vo.CarActivityVO;
import com.bfd.webappxcdc.vo.PersonActivityVO;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;

/**
 * ClassName:PersonThermodynamicService
 * describe
 *
 * @author   lenovo
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月20日		上午10:16:52
 *
 */

public interface PersonThermodynamicService {
	

	
	List<CarActivityVO> getCarActivity();
	
	List<PersonActivityVO> getPersonActivity();

}

