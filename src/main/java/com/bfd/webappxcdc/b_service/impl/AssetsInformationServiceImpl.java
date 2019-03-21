package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.AssetsInformationService;
import com.bfd.webappxcdc.c_dao.AssetsInformationDao;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;
import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "AssetsInformationService")
public class AssetsInformationServiceImpl implements AssetsInformationService {
    @Autowired
    private AssetsInformationDao assetsInformationDao;

  
    @Override
    public List<AssetsInformationNumVO> getNumByType() {

    	 List<AssetsInformationNumVO> vos = assetsInformationDao.getNumByType();
         return vos;
    }

    @Override
    public List<AssetsInformationDetailVO> getAssetsdetail(String type) {
        List<AssetsInformationDetailVO> vos = assetsInformationDao.getAssetsdetail(type);
        return vos;
    }

}
