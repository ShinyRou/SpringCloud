package com.zhujun.controller;

import com.zhujun.entity.HealthState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: NoJVMController
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/13 10:00
 */
@RestController
public class NoJVMController {

    @RequestMapping("/index")
    public String index(){
        return "welcome to no jvm service";
    }

    @RequestMapping("/health")
    public HealthState health(){
        return new HealthState("UP");
    }
}
