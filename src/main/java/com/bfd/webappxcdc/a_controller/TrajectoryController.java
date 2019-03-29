package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.b_service.TrajectoryService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryHistoryVO;
import com.bfd.webappxcdc.vo.TrajectoryNowVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping(TrajectoryController.REQ_PATH)
@Api(value = "TrajectoryController的相关api", description = "轨迹信息")
public class TrajectoryController {
    public static final String REQ_PATH = "/trajectory";
    @Autowired
    private TrajectoryService trajectoryService;

    @ApiOperation(value = "查询当前位置", nickname = "getTrajectnNow")
    @RequestMapping(value = "/now", method = RequestMethod.GET)
    public ServiceResult<List<TrajectoryNowVO>> getTrajectnNow(@RequestParam(name = "id", required = false) String id) {
        return new ServiceResult<List<TrajectoryNowVO>>(trajectoryService.getTrajectnNow(id));
    }

    @ApiOperation(value = "查询历史轨迹", nickname = "getTrajectnHistory")
    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public ServiceResult<List<TrajectoryHistoryVO>> getTrajectnHistory(@RequestParam(name = "id", required = false) String id,
                                   @RequestParam(name = "starttime", required = false) String starttime,
                                   @RequestParam(name = "endtime", required = false) String endtime) throws ParseException {
        return new ServiceResult<List<TrajectoryHistoryVO>>(trajectoryService.getTrajectnHistory(id, starttime, endtime));
    }


    @ApiOperation(value = "查询热力图数据", nickname = "getChartNum")
    @RequestMapping(value = "/persionThermodynamic", method = RequestMethod.GET)
    public ServiceResult<List<PersonThermodynamicChartVO>> getChartNum(@RequestParam(name = "hm", required = false) String hm) {
        return new ServiceResult<List<PersonThermodynamicChartVO>>(trajectoryService.getChartNum(hm));

    }

}
