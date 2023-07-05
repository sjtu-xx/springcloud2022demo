package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3456 {
    // 配置路径：http://localhost:3456/main/config-dev.yml
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3456.class, args);
    }
}
