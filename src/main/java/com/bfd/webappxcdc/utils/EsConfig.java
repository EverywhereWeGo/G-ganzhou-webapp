package com.bfd.webappxcdc.utils;


import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class EsConfig {
    @Bean
    public Client client() {
        Settings settings = Settings.builder().put("cluster.name", "te_index").build();

        TransportClient client = new PreBuiltTransportClient(settings);
        try {
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.56"), 9300))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.57"), 9300))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.138.85.58"), 9300));
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }
        return client;
    }


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





}