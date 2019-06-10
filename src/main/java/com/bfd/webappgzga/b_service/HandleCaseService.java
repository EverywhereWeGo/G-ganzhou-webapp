package com.bfd.webappgzga.b_service;

import com.bfd.webappgzga.vo.HandleCaseVO;

import java.text.ParseException;
import java.util.List;

public interface HandleCaseService {

    public List<HandleCaseVO> handleCase(String starttime, String endtime, String distance, String lat, String lon) throws ParseException;

}
