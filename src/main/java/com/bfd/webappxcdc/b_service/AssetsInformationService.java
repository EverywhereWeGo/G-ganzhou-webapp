package com.bfd.webappxcdc.b_service;

import java.util.List;

import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;

/**
 * 日常销售额service层接口.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:54
 */
public interface AssetsInformationService {

    /**
     * 获取最新更新数据的时间.
     *
     * @return 返回时间字符串
     */
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
