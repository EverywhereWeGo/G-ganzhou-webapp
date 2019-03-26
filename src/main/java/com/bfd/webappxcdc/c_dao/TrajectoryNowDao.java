package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryNowVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TrajectoryNowDao {
	List<TrajectoryNowVO> getTrajectnNow(@Param("id") String id);
    String isKeyPerson(@Param("id") String id);
    List<PersonThermodynamicChartVO> getChartNum(String hm);
}
