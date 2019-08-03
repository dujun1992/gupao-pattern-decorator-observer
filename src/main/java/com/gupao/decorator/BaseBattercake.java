package com.gupao.decorator;

/**
 * Created by DJ on 2019年08月03日 21:37
 **/
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼果子";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
