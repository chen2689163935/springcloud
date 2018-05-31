package com.example.serivcefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.example.serivcefeign.controller"})
public class SerivceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SerivceFeignApplication.class, args);
    }
}
