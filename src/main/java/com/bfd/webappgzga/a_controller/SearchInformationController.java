package com.bfd.webappgzga.a_controller;

import com.bfd.webappgzga.b_service.SearchInformationService;
import com.bfd.webappgzga.utils.ServiceResult;
import com.bfd.webappgzga.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(SearchInformationController.REQ_PATH)
@Api(value = "SearchInformationController", description = "信息检索")
public class SearchInformationController {
    public static final String REQ_PATH = "/search";
    @Autowired
    private SearchInformationService searchInformationService;

    @ApiOperation(value = "根据类型搜索信息", nickname = "getInfoByType")
    @RequestMapping(value = "/peopleinfo", method = RequestMethod.GET)
    public ServiceResult<SearchResultVO> getAssetsnum(
            @RequestParam(name = "type", required = false) String type,
            @RequestParam(name = "value", required = false) String value,
            @RequestParam(name = "pagesize", required = false) int pagesize,
            @RequestParam(name = "page", required = false) int page) {
        return new ServiceResult<SearchResultVO>(searchInformationService.getInfo(type, value, page, pagesize));
    }

    @ApiOperation(value = "查询档案信息_人员", nickname = "getArchivesPeopleInfo")
    @RequestMapping(value = "/archiespeopleinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesPeopleVO>> getArchivesPeopleInfo(
            @RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<ArchivesPeopleVO>>(searchInformationService.getArchivesPeopleInfo(id));
    }

    @ApiOperation(value = "查询档案信息_车辆", nickname = "getArchivesCarInfo")
    @RequestMapping(value = "/archiescarinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesCarVO>> getArchivesCarInfo(
            @RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<ArchivesCarVO>>(searchInformationService.getArchivesCarInfo(id));
    }
    @ApiOperation(value = "查询档案信息_二轮车", nickname = "getArchivesCarInfo")
    @RequestMapping(value = "/archiesrfidinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesCarVO>> getArchivesRfidInfo(
            @RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<ArchivesCarVO>>(searchInformationService.getArchiesRfidInfo(id));
    }

    @ApiOperation(value = "查询档案信息_案件", nickname = "getArchivesCaseInfo")
    @RequestMapping(value = "/archiescaseinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesCaseVO>> getArchivesCaseInfo(
            @RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<ArchivesCaseVO>>(searchInformationService.getArchivesCaseInfo(id));
    }

    @ApiOperation(value = "查询档案信息_关系", nickname = "getArchivesRelationInfo")
    @RequestMapping(value = "/archiesrelationinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesRelationVO>> getArchivesRelationInfo(
            @RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<ArchivesRelationVO>>(searchInformationService.getArchivesRelationInfo(id));
    }


}



