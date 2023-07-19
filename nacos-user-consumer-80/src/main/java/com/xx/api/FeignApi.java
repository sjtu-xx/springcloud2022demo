package com.xx.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-user-provider")
public interface FeignApi {
    @GetMapping("/user/get")
    String get();
}
