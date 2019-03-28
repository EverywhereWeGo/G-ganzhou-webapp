package com.bfd.webappxcdc;

import com.bfd.webappxcdc.filter.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 应用启动类.
 *
 * @author wangzhongcheng
 * @date 2018/12/3 16:24
 */
@SpringBootApplication
@ComponentScan("com.bfd")
@EnableSwagger2
public class WebappXcdcApplication {

    @Bean
    public FilterRegistrationBean CorsFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CorsFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("corsFilter");
        registration.setOrder(1);
        return registration;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebappXcdcApplication.class, args);
    }
}
