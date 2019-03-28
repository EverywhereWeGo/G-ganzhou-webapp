package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrajectoryService {

    List<TrajectoryNowVO> getTrajectnNow(@Param("id") String id);
    List<TrajectoryHistoryVO> getTrajectnHistory(String id , String starttime, String endtime);
    List<PersonThermodynamicChartVO> getChartNum(String hm);
}
