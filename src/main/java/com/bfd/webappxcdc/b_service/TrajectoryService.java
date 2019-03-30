package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryVO;

import java.text.ParseException;
import java.util.List;

public interface TrajectoryService {

    List<PersonThermodynamicChartVO> getChartNum(String hm);

    List<TrajectoryVO> getTrajectnNow(String id) throws ParseException;

    List<TrajectoryVO> getTrajectnHistory(String id, String starttime, String endtime) throws ParseException;

}
