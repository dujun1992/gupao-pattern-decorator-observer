package com.gupao.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by DJ on 2019年08月03日 22:46
 **/
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        //业务逻辑
        System.out.println("执行 subscribe 方法,传入的参数是:" + str);
    }
}
