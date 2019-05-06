package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * className: ZuulApplication
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/6 17:40
 */
@SpringBootApplication
/*
   使用Zuul代理注解,整合了Ribbon来获取注册到Eureka Server
   的服务，整合了Hystrix所有的请求都会使用HystrixCommand
 */
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
