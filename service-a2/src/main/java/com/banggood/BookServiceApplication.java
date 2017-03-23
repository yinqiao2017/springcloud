package com.banggood;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/3/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BookServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BookServiceApplication.class).web(true).run(args);
    }
}
