package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerHystrixUser80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixUser80.class, args);
    }
}
