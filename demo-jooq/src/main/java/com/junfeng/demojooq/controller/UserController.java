package com.junfeng.demojooq.controller;

import com.junfeng.demojooq.pojo.UserPojo;
import com.junfeng.demojooq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author junfeng
 * @Classname UserController
 * @Description 用户控制器
 * @Date 2022-05-22
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public UserPojo getUser() {
        UserPojo user = userService.getUser("junfeng");
        return user;
    }


}
