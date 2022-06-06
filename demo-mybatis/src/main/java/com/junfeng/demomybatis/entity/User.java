package com.junfeng.demomybatis.entity;

import lombok.Data;

/**
 * @author junfeng
 * @Classname UserMapper
 * @Description 用户
 * @Date 2022-06-06
 * @Version V1.0
 */
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String email;

}
