package com.junfeng.demomybatis.service.impl;

import com.junfeng.demomybatis.mapper.UserMapper;
import com.junfeng.demomybatis.pojo.User;
import com.junfeng.demomybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList(null);
    }
}
