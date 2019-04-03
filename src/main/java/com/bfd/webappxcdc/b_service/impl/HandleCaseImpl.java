package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.b_service.HandleCaseService;
import com.bfd.webappxcdc.vo.HandleCaseVO;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.metrics.tophits.TopHits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Service(value = "HandleCaseService")
public class HandleCaseImpl implements HandleCaseService {
    @Autowired
    private Client client;

    public List<HandleCaseVO> handleCase(String starttime, String endtime, String distance, String lat, String lon) throws ParseException {
        List<HandleCaseVO> thvolist = new LinkedList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stime = String.valueOf(sdf.parse(starttime).getTime());
        String etime = String.valueOf(sdf.parse(endtime).getTime());

        SearchRequestBuilder srb = client.prepareSearch("gz_personnel_data_*").setTypes("personnel_data").setFrom(0).setSize(1000);

        srb.setQuery(QueryBuilders.boolQuery()
                .must(QueryBuilders.matchQuery("RYLX", "重点"))
                .must(QueryBuilders.rangeQuery("CJSJ").gte(stime).lte(etime))
                .must(QueryBuilders.geoDistanceQuery("LOCATION").point(Double.parseDouble(lat), Double.parseDouble(lon))
                        .distance(distance,DistanceUnit.METERS)));

//        srb.addAggregation(AggregationBuilders.terms("groups").field("ZJHM")
//                .subAggregation(AggregationBuilders.terms("types").field("SJLY")
//                        .subAggregation(AggregationBuilders.topHits("detail").size(1))));

        srb.addAggregation(AggregationBuilders.terms("groups").field("ZJHM")
                .subAggregation(AggregationBuilders.terms("types").field("SJLY"))
                .subAggregation(AggregationBuilders.topHits("detail").size(1).fetchSource("RYXM", null)));

        SearchResponse searchResponse = srb.execute().actionGet();

        System.out.println(srb.toString());

        Aggregations aggregations = searchResponse.getAggregations();


        Terms groups = searchResponse.getAggregations().get("groups");
        for (Terms.Bucket term : groups.getBuckets()) {
            HandleCaseVO hcvo = new HandleCaseVO();
            //处理第一个聚合条件
            Terms types = term.getAggregations().get("types");
            Map map = new HashMap();
            for (Terms.Bucket tb : types.getBuckets()) {
                String a = tb.getKeyAsString();
                String b = String.valueOf(tb.getDocCount());
                map.put(a, b);
            }
            String key = term.getKeyAsString();
            String cou = String.valueOf(term.getDocCount());

            //处理第二个聚合条件
            String RYLX = "";
            TopHits detail = term.getAggregations().get("detail");
            SearchHit[] hits = detail.getHits().getHits();
            for (SearchHit hit : hits) {
                Map<String, Object> hitmap = hit.getSource();
                if (hitmap.containsKey("RYXM")) {
                    RYLX = hitmap.get("RYXM").toString();
                }
            }

            hcvo.setName(RYLX);
            hcvo.setId(key);
            hcvo.setNum(cou);
            hcvo.setTypenum(map);
            thvolist.add(hcvo);
        }
        System.out.println(thvolist.size());
        return thvolist;
    }

//    public static void main(String[] args) throws ParseException {
//        HandleCaseImpl a = new HandleCaseImpl();
//        Settings settings = Settings.builder().put("cluster.name", "archive").build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//        try {
//            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.24.4.58"), 9300));
//        } catch (UnknownHostException e1) {
//            e1.printStackTrace();
//        }
//        a.client = client;
//        a.handleCase("2019-3-27 15:53:28", "2020-01-01 01:00:00", "1000", "35.91667", "115.41667");
//
//    }
}


