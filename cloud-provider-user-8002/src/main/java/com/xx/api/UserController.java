package com.xx.api;

import com.xx.core.CommonResult;
import com.xx.domain.entity.User;
import com.xx.service.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xuexuan
 * @since 2023-06-02
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;
    private final DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    public UserController(IUserService userService, DiscoveryClient discoveryClient) {
        this.userService = userService;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/listAll")
    public List<User> listAll() {
        return userService.list();
    }

    @GetMapping("/get/{id}")
    public CommonResult<User> getById(@PathVariable("id") Integer id) {
        return CommonResult.from(200, "查询成功，port：" + port, userService.getById(id));
    }

    @PostMapping("/create")
    public CommonResult<Boolean> create(@RequestBody User user) {
        return CommonResult.from(200, "创建成功，port：" + port, userService.save(user));
    }

    @GetMapping("/user/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("USER-PROVIDER");
        instances.forEach(instance -> {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        });
        return this.discoveryClient;
    }
}
