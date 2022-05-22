package com.junfeng.demojooq.service.impl;

import com.junfeng.demojooq.pojo.UserPojo;
import com.junfeng.demojooq.service.IUserService;
import com.junfeng.demojooq.tables.User;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junfeng
 * @Classname UserService
 * @Description 用户实现类
 * @Date 2022-05-22
 * @Version V1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    DSLContext dslContext;

    User user = User.USER.as("user");

    @Override
    public UserPojo getUser(String name) {
        return dslContext.select()
                .from(user)
                .where(user.USERNAME.eq(name)).fetchAny(r -> r.into(UserPojo.class));
    }


}
