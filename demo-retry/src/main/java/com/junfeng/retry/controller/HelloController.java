package com.junfeng.retry.controller;

import com.junfeng.retry.service.TestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author junfeng
 * @Classname HelloController
 * @Description 测试控制器
 * @Date 2022-05-05
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/hello")
public class HelloController {

    @Autowired
    private TestSevice testSevice;

    @GetMapping
    public String hello() {
        List<Integer> result = testSevice.getData1();
        return result.toString();
    }




}
