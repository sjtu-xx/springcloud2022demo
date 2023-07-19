package com.xx.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserConsumer {
    @Value("${service-url.nacos-user-provider}")
    private String userServiceUrl;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String getUser() {
        return restTemplate.getForObject(userServiceUrl + "/user/get", String.class);
    }
}
