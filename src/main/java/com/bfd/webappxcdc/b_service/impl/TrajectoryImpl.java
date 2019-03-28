package com.bfd.webappxcdc.b_service.impl;


import com.alibaba.fastjson.JSONObject;
import com.bfd.webappxcdc.b_service.TrajectoryService;
import com.bfd.webappxcdc.c_dao.TrajectoryNowDao;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryHistoryVO;
import com.bfd.webappxcdc.vo.TrajectoryNowVO;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.elasticsearch.client.Client;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Service(value = "TrajectoryService")
public class TrajectoryImpl implements TrajectoryService {
    @Autowired
    private TrajectoryNowDao trajectoryNowDao;
    @Autowired
    private Client client;


    @Override
    public List<TrajectoryNowVO> getTrajectnNow(String id) {
        String iskey = trajectoryNowDao.isKeyPerson(id);
        List<TrajectoryNowVO> vo = trajectoryNowDao.getTrajectnNow(id);
        for (TrajectoryNowVO t : vo) {
            if ("" .equals(iskey)) {
                t.setKey("否");
            } else {
                t.setKey("是");
            }
        }
        return vo;

    }


    @Override
    public List<PersonThermodynamicChartVO> getChartNum(String hm) {
        return trajectoryNowDao.getChartNum(hm);
    }

    @Override
    public List<TrajectoryHistoryVO> getTrajectnHistory(String id, String starttime, String endtime) {
        SearchResponse response = client.prepareSearch("gz_personnel_data_*")
                .setTypes("personnel_data")
                .setQuery(QueryBuilders.matchQuery("ZJHM", id))
                .setFetchSource(new String[]{"ZJHM", "JD", "WD","CJSJ"}, null)
                .setPostFilter(QueryBuilders.rangeQuery("CJSJ").from(starttime).to(endtime))
                .addSort("CJSJ", SortOrder.DESC)
                .setFrom(0).setSize(1000)
                .get();

//        SearchResponse response = client.prepareSearch("personnel_data_20180526")
//                .setTypes("personnel_data")
//                .setQuery(QueryBuilders.matchQuery("person_id", "未知"))
//                .setFetchSource(new String[]{"person_id", "location", "dev_time"}, null)
//                .setPostFilter(QueryBuilders.rangeQuery("dev_time").from("2018-05-26 06:31:33").to("2018-05-26 07:31:33"))
//                .addSort("dev_time", SortOrder.DESC)
//                .setFrom(0).setSize(100)
//                .get();




        List<TrajectoryHistoryVO> thvolist = new LinkedList<>();
        TrajectoryHistoryVO thvo = new TrajectoryHistoryVO();
        Map<String,Object> hitmap = null;
        String ZJHM="";
        String JD="";
        String WD="";
        String CJSJ="";

        SearchHit[] modelLogEntity = response.getHits().getHits();
        for (SearchHit hit : modelLogEntity) {
            hitmap = hit.getSource();

            if(hitmap.containsKey("ZJHM")){
                ZJHM = hitmap.get("ZJHM").toString();
            }
            if(hitmap.containsKey("JD")){
                JD = hitmap.get("JD").toString();
            }
            if(hitmap.containsKey("WD")){
                WD = hitmap.get("WD").toString();
            }
            if(hitmap.containsKey("CJSJ")){
                CJSJ = hitmap.get("CJSJ").toString();
            }


            thvo.setId(ZJHM);
            thvo.setLongitude(JD);
            thvo.setLatitude(WD);
            thvo.setTime(CJSJ);
            thvolist.add(thvo);

        }


        return thvolist;


    }


}




