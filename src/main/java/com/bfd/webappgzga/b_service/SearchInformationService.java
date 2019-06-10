package com.bfd.webappgzga.b_service;

import com.bfd.webappgzga.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchInformationService {

    public SearchResultVO getInfo(String type, String name, int pageindex, int pagesize);

    public List<ArchivesPeopleVO> getArchivesPeopleInfo(@Param("id") String value);

    public List<ArchivesCarVO> getArchivesCarInfo(@Param("id") String value);

    public List<ArchivesCarVO> getArchiesRfidInfo(@Param("id") String value);

    public List<ArchivesCaseVO> getArchivesCaseInfo(@Param("id") String value);

    public List<ArchivesRelationVO> getArchivesRelationInfo(@Param("id") String value);

}
