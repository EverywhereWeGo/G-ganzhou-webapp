package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TrajectoryDao {
    List<PersonThermodynamicChartVO> getChartNum(String hm);
}
