package com.example.consuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsuldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsuldemoApplication.class, args);
    }

}
