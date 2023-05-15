package com.implemica.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFirstApplication.class, args);
    }

}
