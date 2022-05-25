package com.junfeng.demowebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;

/**
 * @author junfeng
 * @Classname HelloController
 * @Description 测试
 * @Date 2022-05-25
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/hello")
public class HelloController {


    @GetMapping
    public Mono<HashMap<String, Object>> hello() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("key1","v1");
        map.put("key2","v2");
        return Mono.just(map);
    }


}
