package com.bfd.webappgzga.c_dao;

import com.bfd.webappgzga.vo.PersonInformationDetailVO;
import com.bfd.webappgzga.vo.PersonInformationNumVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonInformationDao {
	List<PersonInformationNumVO> getPersonNum();

    List<PersonInformationDetailVO> getPersonDetail(String type);
}
