package com.zhujun.filter;

import com.netflix.client.http.HttpRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * className: MyPreFilter
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/9 14:56
 */
@Slf4j
public class MyPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
        //过滤器类型 pre、route、post、error
    }

    @Override
    public int filterOrder() {
        return 1;
        //执行顺序 不可重复
    }

    @Override
    public boolean shouldFilter() {
        return true;
        //是否执行
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request =ctx.getRequest();
        log.info("Zuul Pre Filter:"+request.getMethod()+request.getRequestURL());
        System.out.println("Zuul Pre Filter:"+request.getMethod()+request.getRequestURL());
        return null;
        //执行的操作
    }
}
