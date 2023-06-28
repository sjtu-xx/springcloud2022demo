package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUser8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUser8001.class, args);
    }
}
