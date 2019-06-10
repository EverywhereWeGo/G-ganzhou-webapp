package com.bfd.webappgzga.b_service;

import com.bfd.webappgzga.vo.PersonThermodynamicChartVO;
import com.bfd.webappgzga.vo.TrajectoryVO;

import java.text.ParseException;
import java.util.List;

public interface TrajectoryService {

    List<PersonThermodynamicChartVO> getChartNum(String hm);

    List<TrajectoryVO> getTrajectnNow(String id) throws ParseException;

    List<TrajectoryVO> getTrajectnHistory(String id, String starttime, String endtime) throws ParseException;

}
