package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZkUser80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZkUser80.class, args);
    }
}
