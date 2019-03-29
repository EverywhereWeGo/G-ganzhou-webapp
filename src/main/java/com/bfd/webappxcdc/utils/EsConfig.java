package com.bfd.webappxcdc.utils;


import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class EsConfig {
//    @Bean
//    public Client client() {
//        Settings settings = Settings.builder().put("cluster.name", "te_index").build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//        try {
//            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.56"), 9300))
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.57"), 9300))
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.58"), 9300));
//        } catch (UnknownHostException e1) {
//            e1.printStackTrace();
//        }
//        return client;
//    }


//    @Bean
//    public Client client() {
//        Settings settings = Settings.builder().put("cluster.name", "archive").build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//        try {
//            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.24.4.58"), 9300));
//        } catch (UnknownHostException e1) {
//            e1.printStackTrace();
//        }
//
//        return client;
//    }


    @Value("${elasticsearch.cluster-nodes}")
    private String clusterNodes;

    @Value("${elasticsearch.cluster-name}")
    private String clusterName;

    @Bean
    public Client client() {
        Settings settings = Settings.builder().put("cluster.name", clusterName).build();

        TransportClient client = new PreBuiltTransportClient(settings);
        try {
            if (clusterNodes != null && !"".equals(clusterNodes)) {
                for (String node : clusterNodes.split(",")) {
                    String[] nodeInfo = node.split(":");
                    client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(nodeInfo[0]), Integer.parseInt(nodeInfo[1])));
                }
            }
        } catch (UnknownHostException e) {
        }

        return client;
    }

}