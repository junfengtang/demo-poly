package com.junfeng.demomail.controller;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author junfeng
 * @Classname MailController
 * @Description demo
 * @Date 2022-04-30
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/mail")
public class MailController {

    @Resource
    private JavaMailSender javaMailSender;

    @GetMapping
    public String mail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1033110136@qq.com");
        message.setTo("269110068@qq.com");
        message.setSubject("这是一封测试邮件主题");
        message.setText("hello world");
        javaMailSender.send(message);
        return "ok";
    }


}
