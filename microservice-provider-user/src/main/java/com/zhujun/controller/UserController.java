package com.zhujun.controller;

import com.zhujun.entity.User;
import com.zhujun.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * className: UserController
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 15:28
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id, HttpSession session){
        log.info("findById被调用");
       return  userRepository.findById(id).orElse(null);
    }

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public String manyParams(@RequestParam Long id,@RequestParam String username){

        return id+username;
    }

    @RequestMapping(value="/get2",method = RequestMethod.GET)
    public String manyParams2(@RequestParam Map<String,Object> map){

        return (String) map.get("username");
    }

    @RequestMapping(value="/post",method = RequestMethod.POST)
    public String manyParams3(@RequestBody User user){

        return user.getUsername();
    }
}
