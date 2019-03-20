package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.SearchInformationService;
import com.bfd.webappxcdc.c_dao.SearchInformationDao;
import com.bfd.webappxcdc.vo.SearchInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SearchInformationServiceImpl.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:55
 */
@Service(value = "SearchInformationServiceImpl")
public class SearchInformationServiceImpl implements SearchInformationService {

    @Autowired
    private SearchInformationDao searchInformationDao;


    @Override
    public List<SearchInformationVO> getInfo(String type, String value, int page) {
        int pageIndex = (page - 1) * 10;
        if ("name".equals(type)) {
            List<SearchInformationVO> vos = searchInformationDao.getInfoByname(value, pageIndex);
            return vos;
        }
        if ("id".equals(type)) {
            List<SearchInformationVO> vos = searchInformationDao.getInfoByID(value, pageIndex);
            return vos;
        }
        if("card".equals(type)){
            List<SearchInformationVO> vos = searchInformationDao.getInfoByCard(value, pageIndex);
            return vos;

        }
        return null;
    }

}
