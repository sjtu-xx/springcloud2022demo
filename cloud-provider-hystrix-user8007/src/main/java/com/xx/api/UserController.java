package com.xx.api;

import com.xx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/user/ok/{id}")
    public String userOk(@PathVariable Integer id) {
        String result = userService.userOk(id);
        System.out.println(result);
        return result;
    }

    @GetMapping("/user/timeout/{id}")
    public String userTimeout(@PathVariable Integer id) {
        String result = userService.userTimeout(id);
        System.out.println(result);
        return result;
    }

}
