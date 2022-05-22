package com.junfeng.demojooq.service;

import com.junfeng.demojooq.pojo.UserPojo;

import java.util.List;

/**
 * @author junfeng
 * @Classname IUserService
 * @Description 用户service
 * @Date 2022-05-22
 * @Version V1.0
 */
public interface IUserService {


    UserPojo getUser(String name);

}
