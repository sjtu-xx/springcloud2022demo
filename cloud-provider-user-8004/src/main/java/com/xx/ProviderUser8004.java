package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUser8004 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUser8004.class, args);
    }
}
