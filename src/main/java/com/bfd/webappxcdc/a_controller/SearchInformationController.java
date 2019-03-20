package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.b_service.SearchInformationService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.SearchInformationVO;
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
@RequestMapping(SearchInformationController.REQ_PATH)
@Api(value = "SearchInformationController", description = "信息检索")
public class SearchInformationController {
    public static final String REQ_PATH = "/search";
    @Autowired
    private SearchInformationService searchInformationService;

    @ApiOperation(value = "查询设备的数量", nickname = "getInfoByType")
    @RequestMapping(value = "/peopleinfo", method = RequestMethod.GET)
    public ServiceResult<List<SearchInformationVO>> getAssetsnum(
            @RequestParam(name = "type", required = false) String type,
            @RequestParam(name = "value", required = false) String value,
            @RequestParam(name = "page", required = false) int page) {
        return new ServiceResult<List<SearchInformationVO>>(searchInformationService.getInfo(type,value,page));
    }


}



