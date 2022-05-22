package com.junfeng.demojooq.pojo;

import lombok.Data;

/**
 * @author junfeng
 * @Classname User
 * @Description 用户pojo
 * @Date 2022-05-22
 * @Version V1.0
 */
@Data
public class UserPojo {

    private Integer id;

    private String username;

    private Integer age;

    private String email;
}
