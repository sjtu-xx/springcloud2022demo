package com.xx.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {
    public String userOk(Integer id) {
        return "线程" + Thread.currentThread().getName() + " id : " + id;
    }

    public String userTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "线程" + Thread.currentThread().getName() + " id : " + id + " 耗时5秒";
    }
}
