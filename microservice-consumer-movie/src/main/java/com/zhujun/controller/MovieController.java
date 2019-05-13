package com.zhujun.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhujun.config.FeignConfiguration;
import com.zhujun.entity.User;
import com.zhujun.feign.UserFeignClient;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * className: controller
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 16:03
 */
@Slf4j
//@Import(FeignClientsConfiguration.class)
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient feignClient;

   /* public MovieController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.feignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .target(UserFeignClient.class, "http://microservice-provider-user/");

    }
*/


    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public String manyParams(@RequestParam Long id,@RequestParam String username){

        return feignClient.manyParams(id, username);
    }

    @RequestMapping(value="/get2",method = RequestMethod.GET)
    public String manyParams2(@RequestParam Map<String,Object> map){

        return feignClient.manyParams2(map);
    }

    @RequestMapping(value="/post",method = RequestMethod.POST)
    public String manyParams3(@RequestBody User user){

        return feignClient.manyParams3(user);
    }

    @HystrixCommand(fallbackMethod ="findUserFallback")
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id")Long id){
        return restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
    }


    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id")Long id){
        return feignClient.findById(id);
    }

    public User findUserFallback(Long id){
        User user = new User();
        user.setAge(10);
        user.setName("默认用户");
        user.setUsername("default user");
        return  user;

    }

    //测试调用非JVM的服务
    @HystrixCommand(fallbackMethod ="testSidecarFallback")
    @GetMapping("/testSidecar")
    public String testNoJVMService(){
        return restTemplate.getForObject("http://microservice-sidecar/health",String.class);
    }


    public String testSidecarFallback(){
        return "consumer movie 调用 sidecar 集成的服务失败";
    }



}

