package com.zhujun.rxjava;


import com.zhujun.entity.User;
import lombok.extern.slf4j.Slf4j;
import rx.Observable;
import rx.Observer;

import java.util.HashMap;

/**
 * className: RxJavaDemo
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/13 15:51
 */
@Slf4j
public class RxJavaDemo {
    public static void main(String[] args) {


        Observable<User> ob = Observable.create(observer -> {
            // 请求用户微服务的/{id}端点
            User user = new User();
            user.setName("RxJava User Demo");
            observer.onNext(user);
            observer.onCompleted();
        });

        Observer<User> reader = new Observer<User>() {
            @Override
            public void onCompleted() {
                log.info("onCompleted");
            }

            @Override
            public void onError(Throwable throwable) {
                log.info("onError");
            }

            @Override
            public void onNext(User user) {
                log.info(user.toString());
            }
        };



        ob.subscribe(reader);
    }
}
