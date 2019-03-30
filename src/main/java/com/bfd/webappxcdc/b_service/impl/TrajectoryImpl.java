package com.bfd.webappxcdc.b_service.impl;


import com.bfd.webappxcdc.b_service.TrajectoryService;
import com.bfd.webappxcdc.c_dao.TrajectoryDao;
import com.bfd.webappxcdc.vo.PersonThermodynamicChartVO;
import com.bfd.webappxcdc.vo.TrajectoryVO;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Service(value = "TrajectoryService")
public class TrajectoryImpl implements TrajectoryService {
    @Autowired
    private TrajectoryDao trajectoryDao;
    @Autowired
    private Client client;

    @Override
    public List<PersonThermodynamicChartVO> getChartNum(String hm) {
        return trajectoryDao.getChartNum(hm);
    }


    @Override
    public List<TrajectoryVO> getTrajectnNow(String id) throws ParseException {
        return getDateFromEs(id, "1970-01-01 08:00:00", "2970-01-01 08:00:00", "1");
    }


    @Override
    public List<TrajectoryVO> getTrajectnHistory(String id, String starttime, String endtime) throws ParseException {
        return getDateFromEs(id, starttime, endtime, "1000");
    }


    private List<TrajectoryVO> getDateFromEs(String id, String starttime, String endtime, String size) throws ParseException {
        List<TrajectoryVO> thvolist = new LinkedList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stime = String.valueOf(sdf.parse(starttime).getTime());
        String etime = String.valueOf(sdf.parse(endtime).getTime());

        System.out.println(stime);
        System.out.println(etime);


        SearchRequestBuilder srb = client.prepareSearch("gz_personnel_data_*")
                .setTypes("personnel_data")
                .setQuery(QueryBuilders.matchQuery("ZJHM", id))
                .setFetchSource(new String[]{"ZJHM", "JD", "WD", "CJSJ", "RYLX"}, null)
                .setPostFilter(QueryBuilders.rangeQuery("CJSJ").from(stime).to(etime))
                .addSort("CJSJ", SortOrder.DESC)
                .setFrom(0).setSize(Integer.parseInt(size));

        System.out.println(srb.toString());


        SearchResponse response = srb.execute().actionGet();


        Map<String, Object> hitmap = null;
        String RYXM = "";
        String ZJHM = "";
        String JD = "";
        String WD = "";
        String CJSJ = "";
        String RYLX = "";

        SearchHit[] modelLogEntity = response.getHits().getHits();
        for (SearchHit hit : modelLogEntity) {
            TrajectoryVO thvo = new TrajectoryVO();
            hitmap = hit.getSource();
            if (hitmap.containsKey("RYXM")) {
                RYXM = hitmap.get("RYXM").toString();
            }
            if (hitmap.containsKey("ZJHM")) {
                ZJHM = hitmap.get("ZJHM").toString();
            }
            if (hitmap.containsKey("JD")) {
                JD = hitmap.get("JD").toString();
            }
            if (hitmap.containsKey("WD")) {
                WD = hitmap.get("WD").toString();
            }
            if (hitmap.containsKey("CJSJ")) {
                CJSJ = hitmap.get("CJSJ").toString();
            }
            if (hitmap.containsKey("RYLX")) {
                RYLX = hitmap.get("RYLX").toString();
            }
            thvo.setName(RYXM);
            thvo.setId(ZJHM);
            thvo.setLongitude(JD);
            thvo.setLatitude(WD);
            thvo.setTime(CJSJ);
            thvo.setKey(RYLX);
            System.out.println(thvo.toString());
            thvolist.add(thvo);
        }
        return thvolist;

    }


//    public static void main(String[] args) throws ParseException {
//        TrajectoryImpl a = new TrajectoryImpl();
//        Settings settings = Settings.builder().put("cluster.name", "archive").build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//        try {
//            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.24.4.58"), 9300));
//        } catch (UnknownHostException e1) {
//            e1.printStackTrace();
//        }
//        a.client = client;
//        a.getTrajectnNow("123456789012345601");
//        a.getTrajectnHistory("123456789012345601", "2019-03-27 15:53:22", "2020-03-29 15:53:22");
//
//
//    }


}




