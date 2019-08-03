package com.gupao.decorator;

/**
 * Created by DJ on 2019年08月03日 21:59
 **/
public class Test {
    public static void main(String[] args) {
        Battercake battercake;

        battercake = new BaseBattercake();

        battercake = new EggDecorator(battercake);

        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);


        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());
    }
}
