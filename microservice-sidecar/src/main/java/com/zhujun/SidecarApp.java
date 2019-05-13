package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * className: com.zhujun.SidecarApp
 * create by: zhujun
 * description: 使用Sidecar整合非JVM服务
 * create time: 2019/5/13 9:45
 */
@SpringBootApplication
@EnableSidecar
//包含以下两个
//@EnableCircuitBreaker
//@EnableZuulProxy
public class SidecarApp {
    public static void main(String[] args) {
        SpringApplication.run(SidecarApp.class,args);
    }
}
