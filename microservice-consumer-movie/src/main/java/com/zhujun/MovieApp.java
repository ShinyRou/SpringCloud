package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * className: MovieApp
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 16:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
//@EnableCircuitBreaker
public class MovieApp {
    public static void main(String[] args) {
        SpringApplication.run(MovieApp.class,args);
    }
}
