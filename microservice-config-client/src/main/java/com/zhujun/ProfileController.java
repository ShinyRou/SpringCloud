package com.zhujun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: ProfileController
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/15 14:24
 */
@RestController
public class ProfileController {

    @Value("${profile}")
    private String profile;


    @RequestMapping("/getProfile")
    public String getProfile(){
        return profile;
    }
}
