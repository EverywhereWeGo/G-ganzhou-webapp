package com.bfd.webappgzga.c_dao;

import com.bfd.webappgzga.vo.AssetsInformationNumVO;
import com.bfd.webappgzga.vo.AssetsInformationDetailVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssetsInformationDao {
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
