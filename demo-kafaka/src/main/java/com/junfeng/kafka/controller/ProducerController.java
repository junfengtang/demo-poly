package com.junfeng.kafka.controller;

import com.junfeng.kafka.service.IMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author junfeng
 * @Classname ProducerController
 * @Description 测试
 * @Date 2022-04-29
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/producer")
public class ProducerController {

    @Autowired
    private IMessageProducer messageProducer;

    @GetMapping("directSendMsg")
    public String directSendMsg(){
        String message = "发送成功，时间为："+ new Date();
        messageProducer.send(message);
        return "ok,发送成功";
    }


}
