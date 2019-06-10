package com.bfd.webappgzga.b_service.impl;

import com.bfd.webappgzga.b_service.AssetsInformationService;
import com.bfd.webappgzga.c_dao.AssetsInformationDao;
import com.bfd.webappgzga.vo.AssetsInformationDetailVO;
import com.bfd.webappgzga.vo.AssetsInformationNumVO;
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
