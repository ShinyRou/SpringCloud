package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * className: UserApp
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 15:21
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
        System.out.println("master-update");
    }
}
