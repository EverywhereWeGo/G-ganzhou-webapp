package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.b_service.AssetsInformationService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;
import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(HandleCaseController.REQ_PATH)
@Api(value = "HandleCaseController", description = "辅助办案")
public class HandleCaseController {
    public static final String REQ_PATH = "/handlecase";
    @Autowired
    private AssetsInformationService assetsInformationService;

    @ApiOperation(value = "查询设备的数量", nickname = "getNumByType")
    @RequestMapping(value = "/assetsnum", method = RequestMethod.GET)
    public ServiceResult<List<AssetsInformationNumVO>> getAssetsnum(String local,String starttime,String endtime,String distance ) {
        return new ServiceResult<List<AssetsInformationNumVO>>(assetsInformationService.getNumByType());
    }


}
