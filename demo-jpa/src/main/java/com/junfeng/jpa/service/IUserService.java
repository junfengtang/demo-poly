package com.junfeng.jpa.service;

import com.junfeng.jpa.pojo.User;

import java.util.List;

/**
 * @author junfeng
 * @Classname IUserService
 * @Description user
 * @Date 2022-05-01
 * @Version V1.0
 */
public interface IUserService {
    List<User> getAll();
}
