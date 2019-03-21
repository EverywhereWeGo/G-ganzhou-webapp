package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonInformationDao {
	List<PersonInformationNumVO> getPersonNum();

    List<PersonInformationDetailVO> getPersonDetail(String type);
}
