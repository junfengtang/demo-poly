package com.junfeng.rabbit.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: junfeng
 * @CreateTime: 2022/04/28
 * @Description: 消费者
 */
@Component
public class ConsumerService {

    @RabbitHandler
    @RabbitListener(queues = "myDirectQueue")
    public void process(String msg){
        System.out.println("消费者收到消息："+msg);
    }

}
