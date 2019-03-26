package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.SearchInformationService;
import com.bfd.webappxcdc.c_dao.SearchInformationDao;
import com.bfd.webappxcdc.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "SearchInformationServiceImpl")
public class SearchInformationServiceImpl implements SearchInformationService {

    @Autowired
    private SearchInformationDao searchInformationDao;


    @Override
    public SearchResultVO getInfo(String type, String value, int page, int pagesize) {

        SearchResultVO srvo= new SearchResultVO();

        String counts = searchInformationDao.getCountNum(type,value);
        int pages = (Integer.parseInt(counts) +pagesize - 1) / pagesize;
        int pageIndex = (page - 1) * pagesize;
        srvo.setPages(pages);

        List<SearchInformationVO> vos = null;
        if ("name".equals(type)) {
            vos = searchInformationDao.getInfoByname(value, pageIndex, pagesize);
        }
        if ("id".equals(type)) {
             vos = searchInformationDao.getInfoByID(value, pageIndex, pagesize);
        }
        if ("card".equals(type)) {
             vos = searchInformationDao.getInfoByCard(value, pageIndex, pagesize);
        }
        if ("rfid".equals(type)) {
            vos = searchInformationDao.getInfoByRfid(value, pageIndex, pagesize);
        }
        srvo.setResultlist(vos);



        return srvo;
    }


    public List<ArchivesPeopleVO> getArchivesPeopleInfo(String id) {
        List<ArchivesPeopleVO> vo = searchInformationDao.getArchiesPeopleInfo(id);
        return vo;
    }

    @Override
    public List<ArchivesCarVO> getArchivesCarInfo(String id) {

        List<ArchivesCarVO> vo = searchInformationDao.getArchiesCarInfo(id);
        return vo;
    }

    @Override
    public List<ArchivesCarVO> getArchiesRfidInfo(String id) {
        List<ArchivesCarVO> vo = searchInformationDao.getArchiesRfidInfo(id);
        return vo;
    }

    @Override
    public List<ArchivesCaseVO> getArchivesCaseInfo(String id) {
        List<ArchivesCaseVO> vo = searchInformationDao.getArchiesCaseInfo(id);
        return vo;
    }

    @Override
    public List<ArchivesRelationVO> getArchivesRelationInfo(String id) {
        List<ArchivesRelationVO> vo = searchInformationDao.getArchiesRelationInfo(id);
        return vo;
    }


}
