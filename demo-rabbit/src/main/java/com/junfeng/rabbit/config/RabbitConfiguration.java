package com.junfeng.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: junfeng
 * @CreateTime: 2022/04/28
 * @Description: rabbit配置
 */
@Configuration
public class RabbitConfiguration {


    public static final String EXCHANGE = "myDirectExchange";//交换空间

    public static final String ROUTINGKEY = "myDirectRoutingKey";//路由key

    public static final String QUEUE = "myDirectQueue";//队列名称

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EXCHANGE, true, false);
    }

    @Bean
    Queue queue() {
        return new Queue(QUEUE, true, false, false);
    }


    @Bean
    Binding binding() {
        // 队列 -> 交换机 -> 路由键
        return BindingBuilder.bind(queue()).to(exchange()).with(ROUTINGKEY);
    }


}
