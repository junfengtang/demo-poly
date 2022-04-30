package com.junfeng.demomybatis.service;


import com.junfeng.demomybatis.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> selectList();

}
