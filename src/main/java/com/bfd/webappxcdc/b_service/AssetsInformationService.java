package com.bfd.webappxcdc.b_service;

import java.util.List;

import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;

public interface AssetsInformationService {
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
