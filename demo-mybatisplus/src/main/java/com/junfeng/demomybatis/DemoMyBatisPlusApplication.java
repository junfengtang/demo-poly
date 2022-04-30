package com.junfeng.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.junfeng.demomybatis.mapper")
public class DemoMyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMyBatisPlusApplication.class, args);
    }

}
