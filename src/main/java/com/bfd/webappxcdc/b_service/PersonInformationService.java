package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;

import java.util.List;

public interface PersonInformationService {

	List<PersonInformationNumVO> getPersonNum();
    List<PersonInformationDetailVO> getPersonDetail(String type);
}
