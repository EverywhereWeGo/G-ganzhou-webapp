package com.bfd.webappgzga.c_dao;

import com.bfd.webappgzga.vo.PersonThermodynamicChartVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrajectoryDao {
    List<PersonThermodynamicChartVO> getChartNum(String hm);
}
