package com.xx.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PROVIDER-USER")
public interface UserService {
    @GetMapping("/user/ok/{id}")
    String userOk(@PathVariable("id") Integer id);

    @GetMapping("/user/timeout/{id}")
    String userTimeout(@PathVariable("id") Integer id);
}
