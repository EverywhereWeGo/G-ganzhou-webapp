package com.bfd.webappgzga.a_controller;

import com.bfd.webappgzga.b_service.HandleCaseService;
import com.bfd.webappgzga.utils.ServiceResult;
import com.bfd.webappgzga.vo.HandleCaseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping(HandleCaseController.REQ_PATH)
@Api(value = "HandleCaseController", description = "辅助办案")
public class HandleCaseController {
    public static final String REQ_PATH = "/handlecase";
    @Autowired
    private HandleCaseService handleCaseService;

    @ApiOperation(value = "辅助办案", nickname = "handleCase")
    @RequestMapping(value = "/handlecase", method = RequestMethod.GET)
    public ServiceResult<List<HandleCaseVO>> handleCase(String starttime,String endtime,String distance,String latitude,String longitude) throws ParseException {
        return new ServiceResult<List<HandleCaseVO>>(handleCaseService.handleCase(starttime,endtime,distance,latitude,longitude));
    }


}
