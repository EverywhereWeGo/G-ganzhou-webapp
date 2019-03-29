package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.HandleCaseVO;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryHistoryVO;
import com.bfd.webappxcdc.vo.TrajectoryNowVO;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.List;

public interface HandleCaseService {

    public List<HandleCaseVO> handleCase(String starttime, String endtime, String distance, String lat, String lon) throws ParseException;

}
