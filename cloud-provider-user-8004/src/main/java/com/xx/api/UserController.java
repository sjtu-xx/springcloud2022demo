package com.xx.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xuexuan
 * @since 2023-06-02
 */
@RestController
public class UserController {
    private final DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    public UserController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/user/zk")
    public String userZk() {
        return "spring cloud with zookeeper" + port + "\t" + UUID.randomUUID().toString();
    }
}
