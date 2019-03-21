package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssetsInformationDao {
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
