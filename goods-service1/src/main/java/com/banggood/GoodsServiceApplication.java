package com.banggood;

import com.banggood.common.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2017/3/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
@Import({DynamicDataSourceRegister.class})
public class GoodsServiceApplication {

        public static void main(String[] args) {
            SpringApplication.run(GoodsServiceApplication.class, args);
        }
}
