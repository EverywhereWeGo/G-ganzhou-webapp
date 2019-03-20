package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.b_service.PersonInformationService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 资产信息控制器层.
 *
 * @author wanghchong
 * @Date 2019/03/19 17:50
 */
@RestController
@RequestMapping(PersonInformationController.REQ_PATH)
@Api(value = "PersonInformationController", description = "人员信息")
public class PersonInformationController {
    public static final String REQ_PATH = "/personinfo";
    @Autowired
    private PersonInformationService personInformationService;

    @ApiOperation(value = "查询设备的数量", nickname = "getPersonNum")
    @RequestMapping(value = "/personnum", method = RequestMethod.GET)
    public ServiceResult<List<PersonInformationNumVO>> getPersonNum() {
        return new ServiceResult<List<PersonInformationNumVO>>(personInformationService.getPersonNum());
    }

    @ApiOperation(value = "查询设备详情", nickname = "getPersondetail")
    @RequestMapping(value = "/persondetail", method = RequestMethod.GET)
    public ServiceResult<List<PersonInformationDetailVO>> getPersondetail(@RequestParam(name = "type", required = false) String type) {
        return new ServiceResult<List<PersonInformationDetailVO>>(personInformationService.getPersonDetail(type));
    }

}
