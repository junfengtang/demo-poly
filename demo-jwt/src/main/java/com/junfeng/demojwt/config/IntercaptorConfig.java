package com.junfeng.demojwt.config;

import com.junfeng.demojwt.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author junfeng
 * @Classname IntercaptorConfig
 * @Description 接口拦截器
 * @Date 2022-05-08
 * @Version V1.0
 */
@Configuration
public class IntercaptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                //拦截的路径
                .addPathPatterns("/**")
                //排除登录接口
                .excludePathPatterns("/v1/user/login");
    }
}