package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchInformationService {

    List<SearchInformationVO> getInfo(String type, String name, int pageindex);
    List<ArchivesPeopleVO> getArchivesPeopleInfo(@Param("id") String value);
    List<ArchivesCarVO> getArchivesCarInfo(@Param("id") String value);
    List<ArchivesCaseVO> getArchivesCaseInfo(@Param("id") String value);
    List<ArchivesRelationVO> getArchivesRelationInfo(@Param("id") String value);
}
