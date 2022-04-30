package com.junfeng.kafka.service;

/**
 * @author junfeng
 * @Classname IMessageProducer
 * @Description 生产者
 * @Date 2022-04-29
 * @Version V1.0
 */
public interface IMessageProducer {

    public void send(String msg);
}
