package com.bfd.webappxcdc.b_service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfd.webappxcdc.b_service.PersonThermodynamicService;
import com.bfd.webappxcdc.c_dao.PersonThermodynamicDao;
import com.bfd.webappxcdc.vo.CarActivityVO;
import com.bfd.webappxcdc.vo.PersonActivityVO;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;

/**
 * ClassName:PersonThermodynamicServiceImpl describe
 *
 * @author lenovo
 * @version
 * @since Ver 1.1
 * @Date 2019年3月20日 上午10:20:17
 *
 */
@Service(value = "PersonThermodynamicService")
public class PersonThermodynamicServiceImpl implements
		PersonThermodynamicService {
	@Autowired
	private PersonThermodynamicDao personThermodynamicDao;

	@Override
	public List<PersonThermodynamicChartVO> getChartNum(String hm) {

		return personThermodynamicDao.getChartNum(hm);

	}

	@Override
	public List<CarActivityVO> getCarActivity() {
		
		return personThermodynamicDao.getCarActivity();
		
	}

	@Override
	public List<PersonActivityVO> getPersonActivity() {
		
		return personThermodynamicDao.getPersonActivity();
		
	}

}
