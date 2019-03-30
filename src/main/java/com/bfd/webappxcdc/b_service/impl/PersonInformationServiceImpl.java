package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.PersonInformationService;
import com.bfd.webappxcdc.c_dao.PersonInformationDao;
import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import com.bfd.webappxcdc.vo.SearchInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "PersonInformationServiceImpl")
public class PersonInformationServiceImpl implements PersonInformationService {

    @Autowired
    private PersonInformationDao prsonInformationDao;


    @Override
    public List<PersonInformationNumVO> getPersonNum() {
        List<PersonInformationNumVO> vos = prsonInformationDao.getPersonNum();
        return vos;
    }

    @Override
    public List<PersonInformationDetailVO> getPersonDetail(String type) {
        List<PersonInformationDetailVO> vos = prsonInformationDao.getPersonDetail(type);
        return vos;
    }


}
