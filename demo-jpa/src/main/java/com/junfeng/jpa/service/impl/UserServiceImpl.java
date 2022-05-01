package com.junfeng.jpa.service.impl;

import com.junfeng.jpa.dao.UserRepository;
import com.junfeng.jpa.pojo.User;
import com.junfeng.jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junfeng
 * @Classname UserServiceImpl
 * @Description user service
 * @Date 2022-05-01
 * @Version V1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        List<User> list = userRepository.findAll();
        return list;
    }
}
