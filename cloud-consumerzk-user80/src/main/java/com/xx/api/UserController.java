package com.xx.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    public static final String INVOKE_URL= "http://user-provider";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/user/zk")
    public String userZk() {
        String result = restTemplate.getForObject(INVOKE_URL + "/user/zk", String.class);
        return result;
    }
}
