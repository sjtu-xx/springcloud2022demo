package com.xx.api;

import com.xx.core.CommonResult;
import com.xx.domain.entity.User;
import com.xx.service.IUserService;
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

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/listAll")
    public List<User> listAll() {
        return userService.list();
    }

    @GetMapping("/get/{id}")
    public CommonResult<User> getById(@PathVariable("id") Integer id) {
        return CommonResult.successReturn(userService.getById(id));
    }
    
    @PostMapping("/create")
    public CommonResult<Boolean> create(@RequestBody User user) {
        return CommonResult.successReturn(userService.save(user));
    }
}
