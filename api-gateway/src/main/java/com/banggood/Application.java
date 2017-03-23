package com.banggood;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/3/21.
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}