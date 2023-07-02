package com.xx.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {
    public String userOk(Integer id) {
        return "线程" + Thread.currentThread().getName() + " id : " + id;
    }

    @HystrixCommand(fallbackMethod = "userTimeoutHandler",
    commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String userTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "线程" + Thread.currentThread().getName() + " id : " + id + " 耗时5秒";
    }

    public String userTimeoutHandler(Integer id) {
        return "线程" + Thread.currentThread().getName() + " id : " + id + " fallback";
    }
}
