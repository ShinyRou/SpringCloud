package com.zhujun.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * className: Config
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 16:12
 */

@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate( ) {
        // Do any additional configuration here
        return new RestTemplate();
    }
}
