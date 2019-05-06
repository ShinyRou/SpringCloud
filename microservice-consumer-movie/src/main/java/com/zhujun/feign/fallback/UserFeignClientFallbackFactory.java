package com.zhujun.feign.fallback;

import com.zhujun.entity.User;
import com.zhujun.feign.UserFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * className: UserFeignClientFallbackFactory
 * create by: zhujun
 * description: TODO
 * create time: 2019/4/25 14:06
 */

@Component
public class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                System.out.println("FallBack cause by " +
                        throwable);
                return new User();
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
        };
    }
}
