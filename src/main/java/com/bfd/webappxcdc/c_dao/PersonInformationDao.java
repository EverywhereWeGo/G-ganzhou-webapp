package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 获取人员数量Dao.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:30
 */
@Mapper
public interface PersonInformationDao {
	List<PersonInformationNumVO> getPersonNum();

    List<PersonInformationDetailVO> getPersonDetail(String type);
}
