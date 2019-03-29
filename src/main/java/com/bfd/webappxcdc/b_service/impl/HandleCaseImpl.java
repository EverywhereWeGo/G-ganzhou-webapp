package com.bfd.webappxcdc.b_service.impl;

import com.bfd.webappxcdc.vo.TrajectoryHistoryVO;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.GeoDistanceQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.GeoDistanceSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;


public class HandleCaseImpl {
    @Autowired
    private Client client;

    public List<TrajectoryHistoryVO> getTrajectnHistory(String lon, String lan, String starttime, String endtime, String distance) {
        GeoPoint geoPoint = new GeoPoint(Double.parseDouble(lon), Double.parseDouble(lan));

        SearchSourceBuilder srb = new SearchSourceBuilder();
        QueryBuilder qb = QueryBuilders.geoDistanceQuery("dev_id")
                .point(geoPoint)
                .distance(distance, DistanceUnit.KILOMETERS);
        srb.query(qb);
        GeoDistanceSortBuilder sort = SortBuilders.geoDistanceSort("dev_id", geoPoint)
                .order(SortOrder.ASC)
                .unit(DistanceUnit.KILOMETERS);
        srb.sort(sort);

        System.out.println(srb.toString());


        return null;


    }

    public void testGetNearbyPeople2(String indexName, String indexType, double lat, double lon) {

        Settings settings = Settings.builder().put("cluster.name", "archive").build();

        TransportClient client = new PreBuiltTransportClient(settings);
        try {
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.24.4.58"), 9300));
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }


        SearchRequestBuilder srb = client.prepareSearch(indexName).setTypes(indexType);
        srb.setFrom(0).setSize(1000);// 1000人

//        QueryBuilder qb = geoDistanceQuery("pin.location")
//                .point(40, -70)
//                .distance(200, DistanceUnit.KILOMETERS);

//
//        srb.setQuery(QueryBuilders.matchQuery("ZJHM", id))
//                .setFetchSource(new String[]{"ZJHM", "JD", "WD", "CJSJ"}, null)
//                .setPostFilter(QueryBuilders.rangeQuery("CJSJ").from(stime).to(etime))
//                .addSort("CJSJ", SortOrder.DESC)
//                .setFrom(0).setSize(1000)
//                .get();


        GeoDistanceQueryBuilder location1 = QueryBuilders.geoDistanceQuery("location").point(lat, lon).distance(1000, DistanceUnit.MILES);
        srb.setPostFilter(location1);

        //srb.setQuery(QueryBuilders.boolQuery().filter(location1));

//        // 获取距离多少公里 这个才是获取点与点之间的距离的
//        GeoDistanceSortBuilder sort = SortBuilders.geoDistanceSort("location", lat, lon);
//        sort.unit(DistanceUnit.MILES);
//        sort.order(SortOrder.ASC);
//        sort.point(lat, lon);
//        srb.addSort(sort);

        System.out.println(srb.toString());


        SearchResponse searchResponse = srb.execute().actionGet();

        // System.out.println(srb.toString());

        SearchHits hits = searchResponse.getHits();
        SearchHit[] searchHists = hits.getHits();
        // 搜索耗时
        for (SearchHit hit : searchHists) {
            String name = (String) hit.getSource().get("name");
            Object location = hit.getSource().get("location");
            // 获取距离值，并保留两位小数点
            BigDecimal geoDis = new BigDecimal((Double) hit.getSortValues()[0]);
            Map<String, Object> hitMap = hit.getSource();
            hitMap.put("geoDistance", geoDis.setScale(0, BigDecimal.ROUND_HALF_DOWN));
            System.out.println(name + "的坐标：" + location + "他距离坐标" + hit.getSource().get("geoDistance")
                    + DistanceUnit.METERS.toString());
        }

    }

    public void testGetNearbyPeople3(String indexName, String indexType, double lat, double lon) {
        Settings settings = Settings.builder().put("cluster.name", "archive").build();

        TransportClient client = new PreBuiltTransportClient(settings);
        try {
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.24.4.58"), 9300));
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }


        SearchRequestBuilder srb = client.prepareSearch(indexName).setTypes(indexType);
        srb.setFrom(0).setSize(1000);// 1000人


        srb.setQuery(QueryBuilders.boolQuery()
//                .must(QueryBuilders.rangeQuery("dev_time").gte("2018-05-26 06:31:33").lte("2018-05-27 06:31:33"))
                .must(QueryBuilders.rangeQuery("CJSJ").gte("2").lte("4"))

                .must(QueryBuilders.geoDistanceQuery("location").point(lat, lon).distance(1000, DistanceUnit.MILES)));


        srb.addAggregation(AggregationBuilders.terms("groups").field("ZJHM"));


        System.out.println(srb.toString());

        SearchResponse searchResponse = srb.execute().actionGet();
      var l =   searchResponse.getAggregations();

        SearchHit[] searchHists = searchResponse.getHits().getHits();
        for (SearchHit hit : searchHists) {
            String a = hit.getSourceAsString();

            System.out.println("asdf:" + a);
        }


    }


    public static void main(String[] args) {
        HandleCaseImpl a = new HandleCaseImpl();
//        a.getTrajectnHistory("39", "105", "1", "2", "3");
//        a.testGetNearbyPeople3("gz_personnel_data_20190331", "personnel_data", 33.91667, 113.41667);
        a.testGetNearbyPeople3("gz_personnel_data_20190331", "personnel_data_test", 30.91667, 110.41667);
    }
}


