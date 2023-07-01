package com.xx.service;


import com.xx.core.CommonResult;
import com.xx.domain.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="USER-PROVIDER")
public interface UserFeignService {
    @GetMapping("/user/get/{id}")
    CommonResult<User> getById(@PathVariable("id") Integer id);
}
