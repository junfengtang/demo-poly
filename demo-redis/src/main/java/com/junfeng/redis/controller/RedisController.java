package com.junfeng.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junfeng
 * @Classname RedisController
 * @Description demo
 * @Date 2022-04-30
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/hello")
public class RedisController {

    @Autowired
    private RedisTemplate<String ,String > redisTemplate;

    @GetMapping()
    public String hello() {
        redisTemplate.opsForValue().set("spring-redis","hello world");
        return "hello world";
    }
}
