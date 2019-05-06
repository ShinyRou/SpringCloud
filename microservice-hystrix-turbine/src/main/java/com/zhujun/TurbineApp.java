package com.zhujun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * className: TurbineAp
 * create by: zhujun
 * description: TODO
 * create time: 2019/4/28 15:32
 */
@SpringBootApplication
//Turbine
@EnableTurbine
public class TurbineApp {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApp.class,args);
    }
}
