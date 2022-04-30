package com.junfeng.demoswagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "1 示例api")
@RestController
@RequestMapping("v1/hello")
public class HelloController {


    @GetMapping()
    @ApiOperation(value = "demo")
    public String hello() {
       return "hello world";
    }

}
