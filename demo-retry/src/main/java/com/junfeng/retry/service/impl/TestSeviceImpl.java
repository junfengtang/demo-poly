package com.junfeng.retry.service.impl;

import com.junfeng.retry.service.TestSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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


    private int i = 0;
    @Override
    @Retryable(recover = "testService3",maxAttempts = 7,backoff = @Backoff(delay = 3000,maxDelay = 3))
    public List<Integer> getData1(){
        log.info("--------------------------------getdata1-------------------------------");
        log.info(String.valueOf(1/0));
        return null;
    }

    @Recover
    public List<Integer> testService3(Exception e) {
        log.info("--------------------------------getdata2------------------------------");
        log.info("失败原因：{}",e.getMessage());
        return Collections.singletonList(2);
    }



}
