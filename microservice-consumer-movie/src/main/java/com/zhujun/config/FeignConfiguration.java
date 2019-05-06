package com.zhujun.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * className: FeignConfiguration
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/27 14:55
 */

@Configuration
public class FeignConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


}
