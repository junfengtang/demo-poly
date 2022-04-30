package com.junfeng.demomybatis.controller;


import com.junfeng.demomybatis.pojo.User;
import com.junfeng.demomybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String hello(){
        List<User> list = userService.selectList();
        return list.toString();
    }


}
