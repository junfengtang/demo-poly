package com.junfeng.retry.service.impl;

import com.junfeng.retry.service.TestSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author junfeng
 * @Classname TestSeviceImpl
 * @Description 测试实现类
 * @Date 2022-05-05
 * @Version V1.0
 */
@Service
@Slf4j
public class TestSeviceImpl implements TestSevice {


    @Override
    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000,multiplier = 1.5))
    public void getData1() {
        log.info("--------------------------------getdata1-------------------------------");
        log.info(String.valueOf(1/0));
    }



    @Override
    @Recover
    public void getData2() {
        log.info("--------------------------------getdata1-------------------------------");
    }

}
