package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.AssetsInformationService;
import com.bfd.webappxcdc.c_dao.AssetsInformationDao;
import com.bfd.webappxcdc.vo.AssetsInformationDetailVO;
import com.bfd.webappxcdc.vo.AssetsInformationNumVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DailySalesVolumeService的实现类.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:55
 */
@Service(value = "AssetsInformationService")
public class AssetsInformationServiceImpl implements AssetsInformationService {

    /**
     * 自动注入Dao对象
     */
    @Autowired
    private AssetsInformationDao assetsInformationDao;

  
    /**
     * 获取最新更新数据的时间.
     *
     * @return 返回时间字符串
     */
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
