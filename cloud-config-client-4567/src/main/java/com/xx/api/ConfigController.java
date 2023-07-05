package com.xx.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String info;
    @GetMapping("/fetchConfig")
    public void fetchConfig() {
        System.out.println(info);
    }
}
