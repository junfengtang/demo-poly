package com.junfeng.rabbit.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: junfeng
 * @CreateTime: 2022/04/28
 * @Description: 生成者接口
 */
@RestController
@RequestMapping("v1/product")
public class ProduceController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("directSendMsg")
    public String directSendMsg(){
        String message = "发送成功，时间为："+ new Date();
        rabbitTemplate.convertAndSend("myDirectExchange","myDirectRoutingKey",message);
        return "ok,发送成功";
    }


}
