package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.SearchInformationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 获取人员数量Dao.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:30
 */
@Mapper
public interface SearchInformationDao {
	List<SearchInformationVO> getInfoByname(String value,int pageIndex);
}
