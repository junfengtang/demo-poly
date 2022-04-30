package com.junfeng.kafka.service.impl;

import com.junfeng.kafka.service.IMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junfeng
 * @Classname MessageProducerImpl
 * @Description 生产者实现
 * @Date 2022-04-29
 * @Version V1.0
 */
@Service
public class MessageProducerImpl implements IMessageProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void send(String msg) {
        kafkaTemplate.sendDefault("demo",msg);
    }


}
