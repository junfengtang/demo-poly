package com.junfeng.jpa.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
