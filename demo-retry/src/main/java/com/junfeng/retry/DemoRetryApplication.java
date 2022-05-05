package com.junfeng.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class DemoRetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRetryApplication.class, args);
    }

}
