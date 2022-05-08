package com.junfeng.demojwt.controller;

import com.junfeng.demojwt.model.User;
import com.junfeng.demojwt.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junfeng
 * @Classname UserLoginController
 * @Description user控制器
 * @Date 2022-05-08
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/user")
public class UserLoginController {
    @Value("${Login.username}")
    private String realUsername;

    @Value("${Login.password}")
    private String realPassword;

    @GetMapping("login")
    public String login(String username, String password) {
        if (username.equals(realUsername) && password.equals(realPassword)) {
            User u = new User();
            u.setPassword(password);
            u.setUsername(username);
            return JWTUtils.getToken(u);
        }
        return "登录失败！账号或者密码不对！";
    }

    @GetMapping("test")
    public String test()  {
        return "访问test - API";
    }

}
