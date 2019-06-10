package com.bfd.webappgzga.b_service;

import java.util.List;

import com.bfd.webappgzga.vo.AssetsInformationNumVO;
import com.bfd.webappgzga.vo.AssetsInformationDetailVO;

public interface AssetsInformationService {
	List<AssetsInformationNumVO> getNumByType();
    List<AssetsInformationDetailVO> getAssetsdetail(String type);
}
