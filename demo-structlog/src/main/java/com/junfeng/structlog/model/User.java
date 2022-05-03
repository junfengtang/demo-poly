package com.junfeng.structlog.model;

import com.github.structlog4j.IToLog;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author junfeng
 * @Classname User
 * @Description 用户类
 * @Date 2022-05-03
 * @Version V1.0
 */
@Data
@AllArgsConstructor
public class User implements IToLog {

    private String id;

    private String username;

    private Integer age;

    @Override
    public Object[] toLog() {
        return new Object[]{"id", getId(), "username", getUsername(), "age", getAge()};
    }
}
