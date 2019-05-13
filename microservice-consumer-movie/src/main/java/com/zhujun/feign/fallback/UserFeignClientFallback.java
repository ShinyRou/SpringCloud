package com.zhujun.feign.fallback;

import com.zhujun.entity.User;
import com.zhujun.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * className: UserFeignClientFallback
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/28 14:19
 */

public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setName("default user");
        user.setUsername("default user");
        return user;
    }

    @Override
    public String manyParams(Long id, String username) {
        return null;
    }

    @Override
    public String manyParams2(Map<String, Object> map) {
        return null;
    }

    @Override
    public String manyParams3(User user) {
        return null;
    }
}
