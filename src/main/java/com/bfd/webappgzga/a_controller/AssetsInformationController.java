package com.bfd.webappgzga.a_controller;

import com.bfd.webappgzga.b_service.AssetsInformationService;
import com.bfd.webappgzga.utils.ServiceResult;
import com.bfd.webappgzga.vo.AssetsInformationDetailVO;
import com.bfd.webappgzga.vo.AssetsInformationNumVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(AssetsInformationController.REQ_PATH)
@Api(value = "AssetsInformationController的相关api", description = "资产信息")
public class AssetsInformationController {
    public static final String REQ_PATH = "/assetsinfo";
    @Autowired
    private AssetsInformationService assetsInformationService;

    @ApiOperation(value = "查询设备的数量", nickname = "getNumByType")
    @RequestMapping(value = "/assetsnum", method = RequestMethod.GET)
    public ServiceResult<List<AssetsInformationNumVO>> getAssetsnum() {
        return new ServiceResult<List<AssetsInformationNumVO>>(assetsInformationService.getNumByType());
    }

    @ApiOperation(value = "查询设备详情", nickname = "getAssetsdetail")
    @RequestMapping(value = "/assetsdetail", method = RequestMethod.GET)
    public ServiceResult<List<AssetsInformationDetailVO>> getAssetsdetail(@RequestParam(name = "type", required = false) String type) {
        return new ServiceResult<List<AssetsInformationDetailVO>>(assetsInformationService.getAssetsdetail(type));
    }

}
