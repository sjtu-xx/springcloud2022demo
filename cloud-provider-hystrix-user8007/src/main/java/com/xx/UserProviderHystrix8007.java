package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
public class UserProviderHystrix8007 {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderHystrix8007.class, args);
    }
}
