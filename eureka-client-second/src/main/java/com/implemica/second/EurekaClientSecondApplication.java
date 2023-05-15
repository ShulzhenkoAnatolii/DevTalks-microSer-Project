package com.implemica.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSecondApplication.class, args);
    }

}
