package com.bfd.webappxcdc.c_dao;

import com.bfd.webappxcdc.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 获取人员数量Dao.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:30
 */
@Mapper
public interface SearchInformationDao {
    List<SearchInformationVO> getInfoByname(@Param("value") String value, @Param("pageIndex") int pageIndex);

    List<SearchInformationVO> getInfoByID(@Param("value") String value, @Param("pageIndex") int pageIndex);

    List<SearchInformationVO> getInfoByCard(@Param("value") String value, @Param("pageIndex") int pageIndex);

    List<ArchivesPeopleVO> getArchiesPeopleInfo(@Param("id") String value);

    List<ArchivesCarVO> getArchiesCarInfo(@Param("id") String value);

    List<ArchivesCaseVO> getArchiesCaseInfo(@Param("id") String value);

    List<ArchivesRelationVO> getArchiesRelationInfo(@Param("id") String value);


}
