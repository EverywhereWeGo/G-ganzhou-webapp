package com.bfd.webappgzga.b_service;

import com.bfd.webappgzga.vo.PersonInformationDetailVO;
import com.bfd.webappgzga.vo.PersonInformationNumVO;

import java.util.List;

public interface PersonInformationService {

	List<PersonInformationNumVO> getPersonNum();
    List<PersonInformationDetailVO> getPersonDetail(String type);
}
