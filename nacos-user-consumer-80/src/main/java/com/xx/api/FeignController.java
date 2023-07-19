package com.xx.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignApi feignApi;

    @GetMapping("/user/get2")
    public String get2() {
        return feignApi.get();
    }
}
