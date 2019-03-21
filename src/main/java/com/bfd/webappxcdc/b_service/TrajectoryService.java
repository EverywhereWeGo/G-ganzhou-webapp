package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrajectoryService {

    List<TrajectoryNowVO> getHistorytrajectory(@Param("id") String id);
    List<PersonThermodynamicChartVO> getChartNum(String hm);
}
