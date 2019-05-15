package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * className: ConfigClientApp
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/15 14:20
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class,args);
    }
}
