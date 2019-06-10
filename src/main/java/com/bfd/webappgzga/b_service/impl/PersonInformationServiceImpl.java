package com.bfd.webappgzga.b_service.impl;

import com.bfd.webappgzga.b_service.PersonInformationService;
import com.bfd.webappgzga.c_dao.PersonInformationDao;
import com.bfd.webappgzga.vo.PersonInformationDetailVO;
import com.bfd.webappgzga.vo.PersonInformationNumVO;
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
