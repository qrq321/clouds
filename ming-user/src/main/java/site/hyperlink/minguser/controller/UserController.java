package site.hyperlink.minguser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 11:23
 * @Description: {}
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${param.config}")
    private String config;
    
    @GetMapping("/helloUser")
    public String helloUser() {

        return "hello User ,param.config = " + config;

    }
}
