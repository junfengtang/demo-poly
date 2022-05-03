package com.junfeng.structlog.controller;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import com.github.structlog4j.StructLog4J;
import com.github.structlog4j.json.JsonFormatter;
import com.junfeng.structlog.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junfeng
 * @Classname HelloController
 * @Description 测试类
 * @Date 2022-05-03
 * @Version V1.0
 */

@RestController
@RequestMapping("v1/hello")
public class HelloController {

    private ILogger log = SLoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String hello() {
       // StructLog4J.setFormatter(JsonFormatter.getInstance());
        log.info("Starting processing",
                "user", "1111",
                "tenanId","222");
        User user = new User("1","test",28);
        log.error("222",user);
        return "ok";
    }
}
