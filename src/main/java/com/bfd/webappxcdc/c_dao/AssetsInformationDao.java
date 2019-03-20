package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 日常销售额Dao.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:30
 */
@Mapper
public interface AssetsInformationDao {
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
