package xx.controller;

import com.xx.core.CommonResult;
import com.xx.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xx.service.UserFeignService;

@RestController
public class UserController {
    private final UserFeignService userFeignService;

    public UserController(UserFeignService userFeignService) {
        this.userFeignService = userFeignService;
    }

    @GetMapping("/consumer/user/get/{id}")
    public CommonResult<User> getUser(@PathVariable("id") Integer id) {
        return userFeignService.getById(id);
    }
}
