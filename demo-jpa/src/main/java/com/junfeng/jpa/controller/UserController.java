package com.junfeng.jpa.controller;

import com.junfeng.jpa.pojo.User;
import com.junfeng.jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author junfeng
 * @Classname UserController
 * @Description demo
 * @Date 2022-05-01
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping()
    public String getAll() {
        List<User> list = userService.getAll();
        return list.toString();
    }
}
