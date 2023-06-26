package com.xx.controller;

import com.xx.core.CommonResult;
import com.xx.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    public static final String USER_URL = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/user/create")
    public CommonResult<User> create(User user) {
        return restTemplate.postForObject(USER_URL + "/user/create", user, CommonResult.class);
    }

    @GetMapping("/consumer/user/get/{id}")
    public CommonResult<User> getUser(@PathVariable("id") Long id) {
        return restTemplate.getForObject(USER_URL + "/user/get/" + id, CommonResult.class);
    }
}
