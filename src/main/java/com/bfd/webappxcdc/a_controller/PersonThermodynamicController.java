package com.bfd.webappxcdc.a_controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfd.webappxcdc.b_service.PersonThermodynamicService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import com.bfd.webappxcdc.vo.CarActivityVO;
import com.bfd.webappxcdc.vo.PersonActivityVO;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;

/**
 * ClassName:PersonThermodynamicController describe
 *
 * @author lenovo
 * @version
 * @since Ver 1.1
 * @Date 2019年3月20日 上午10:25:46
 *
 */
@RestController
@RequestMapping(PersonThermodynamicController.REQ_PATH)
@Api(value = "PersonThermodynamicController的相关api", description = "人员历史轨迹热力分布")
public class PersonThermodynamicController {
	public static final String REQ_PATH = "/persionTrajectory";

	@Autowired
	private PersonThermodynamicService personThermodynamicService;
	
	@ApiOperation(value = "查询热力图数据", nickname = "getChartNum")
    @RequestMapping(value = "/persionThermodynamic", method = RequestMethod.GET)
    public ServiceResult<List<PersonThermodynamicChartVO>> getChartNum(@RequestParam(name = "hm", required = false) String hm){
		return new ServiceResult<List<PersonThermodynamicChartVO>>( personThermodynamicService.getChartNum(hm));
		
	}
	
	@ApiOperation(value = "查询车辆活跃度", nickname = "getCarActivity")
    @RequestMapping(value = "/CarActivity", method = RequestMethod.GET)
    public ServiceResult<List<CarActivityVO>> getCarActivity(){
		return new ServiceResult<List<CarActivityVO>>( personThermodynamicService.getCarActivity());
		
	}
	
	@ApiOperation(value = "查询重点人员活跃度", nickname = "getPersonActivity")
    @RequestMapping(value = "/PersonActivity", method = RequestMethod.GET)
    public ServiceResult<List<PersonActivityVO>> getPersonActivity(){
		return new ServiceResult<List<PersonActivityVO>>( personThermodynamicService.getPersonActivity());
		
	}
	
	

}
