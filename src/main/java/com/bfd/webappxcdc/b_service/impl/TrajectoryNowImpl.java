package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.TrajectoryService;
import com.bfd.webappxcdc.c_dao.TrajectoryNowDao;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.SearchInformationVO;
import com.bfd.webappxcdc.vo.TrajectoryNowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "TrajectoryService")
public class TrajectoryNowImpl implements TrajectoryService {
    @Autowired
    private TrajectoryNowDao trajectoryNowDao;

  
    @Override
    public List<TrajectoryNowVO> getHistorytrajectory(String id) {
        String  iskey = trajectoryNowDao.isKeyPerson(id);
        List<TrajectoryNowVO> vo = trajectoryNowDao.getTrajectnNow(id);
        for (TrajectoryNowVO t : vo) {
            if("".equals(iskey)){
                t.setKey("否");
            }else{
                t.setKey("是");
            }
        }
        return vo;

    }



    @Override
    public List<PersonThermodynamicChartVO> getChartNum(String hm) {
        return trajectoryNowDao.getChartNum(hm);

    }


}
