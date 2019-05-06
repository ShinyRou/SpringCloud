package com.zhujun.feign;

import com.zhujun.config.FeignConfiguration;
import com.zhujun.entity.User;
import com.zhujun.feign.fallback.UserFeignClientFallback;
import com.zhujun.feign.fallback.UserFeignClientFallbackFactory;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * className: UserFeignClient
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/27 13:55
 */
@FeignClient(name="microservice-provider-user",configuration = FeignConfiguration.class,fallbackFactory = UserFeignClientFallbackFactory.class)//服务名
//@FeignClient(name="microservice-provider-user",url="http://localhost:8081")
public interface UserFeignClient {

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    //@RequestLine("GET /{id}")
    public User findById(@PathVariable("id") Long id);

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public String manyParams(@RequestParam Long id,@RequestParam String username);

    @RequestMapping(value="/get2",method = RequestMethod.GET)
    public String manyParams2(@RequestParam Map<String,Object> map);

    @RequestMapping(value="/post",method = RequestMethod.POST)
    public String manyParams3(@RequestBody User user);
}
