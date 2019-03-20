package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.PersonInformationService;
import com.bfd.webappxcdc.c_dao.PersonInformationDao;
import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PersonInformationServiceImpl的实现类.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:55
 */
@Service(value = "PersonInformationServiceImpl")
public class PersonInformationServiceImpl implements PersonInformationService {

    /**
     * 自动注入Dao对象
     */
    @Autowired
    private PersonInformationDao prsonInformationDao;


    /**
     * 获取最新更新数据的时间.
     *
     * @return 返回时间字符串
     */
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
