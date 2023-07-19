package com.xx.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @Value("${server.port}")
    private String port;


    @GetMapping("/user/get")
    public String get() {
        return "查询成功，port：" + port;
    }

}
