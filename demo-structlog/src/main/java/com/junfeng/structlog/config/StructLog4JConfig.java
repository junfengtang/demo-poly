package com.junfeng.structlog.config;

import com.github.structlog4j.StructLog4J;
import com.github.structlog4j.json.JsonFormatter;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author junfeng
 * @Classname StructLog4JConfig
 * @Description StructLog4J配置
 * @Date 2022-05-03
 * @Version V1.0
 */
@Configuration
public class StructLog4JConfig {

    @PostConstruct
    public void init() {
        // init structured logging
        StructLog4J.setFormatter(JsonFormatter.getInstance());

        // global log fields setting
        StructLog4J.setMandatoryContextSupplier(() -> new Object[]{
                "env", "test",
                "service", "StructLog4J appName"});
    }


}
