package com.zhujun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * className: EurekaApp
 * create by: zhujun
 * description: Start
 * create time: 2019/3/6 16:43
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApp extends WebSecurityConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class,args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }

}
