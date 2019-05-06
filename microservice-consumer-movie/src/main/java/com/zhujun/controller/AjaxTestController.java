package com.zhujun.controller;

import com.zhujun.entity.AjaxEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * className: AjaxTestController
 * create by: zhujun
 * description: Ajax各种形式传参到SpringMVC接受测试
 * create time: 2019/4/26 10:26
 */

@Controller
@RequestMapping("/ajax")
public class AjaxTestController {

    /**
     * get请求 发送参数拼接Url
     */
    @RequestMapping(value = "getUrl",method = RequestMethod.GET)
    public void  getUrl(String a,String b){
        System.out.println(a+b);
    }

    /**
     * get请求 发送参数拼接Url 使用RequestParam
     */
    @RequestMapping(value="getUrl2",method = RequestMethod.GET)
    public void  getUrl2(@RequestParam("a") String a,@RequestParam("b")String b){
        System.out.println(a+b);
    }

    /**
     *form表单 get提交
     */
    @RequestMapping(value="getForm",method = RequestMethod.GET)
    public void  getForm(@RequestParam("a") String a,@RequestParam("b")String b){
        System.out.println(a+b);
    }

    /**
     *form表单 post提交
     */
    @RequestMapping(value="postForm",method = RequestMethod.POST)
    public void  postForm(@RequestParam("a") String a,@RequestParam("b")String b){
        System.out.println(a+b);
    }

    /**
     *form表单 post提交 to Map
     */
    @RequestMapping(value="postForm2Map")
    public void  postForm2Map(Map<String,String> map){
        System.out.println(map);
    }

    @RequestMapping(value="postForm2Object")
    public void  postForm2Map(AjaxEntity ajaxEntity){
        System.out.println(ajaxEntity);
    }


    @RequestMapping(value="postForm2Object2")
    public void  postForm2Map2(@RequestBody  AjaxEntity ajaxEntity){
        System.out.println(ajaxEntity);
    }

    /**
     * post json字符串 contentType=application/json
     * @RequestBody
     */
    @RequestMapping(value="postJSONObject",method = RequestMethod.POST)
    public void  postJSONObject(@RequestBody AjaxEntity ajaxEntity){
        System.out.println(ajaxEntity);
    }

    /**
     * post json对象
     */
    @RequestMapping(value="postJSONString",method = RequestMethod.POST)
    public void  postJSONString(String a,String b){
        System.out.println(a+b);
    }

}
