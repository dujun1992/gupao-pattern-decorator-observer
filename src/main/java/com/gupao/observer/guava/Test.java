package com.gupao.observer.guava;

import com.google.common.eventbus.EventBus;
import com.gupao.observer.jdk.Question;

/**
 * Created by DJ on 2019年08月03日 22:46
 **/
public class Test {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        //GuavaEvent guavaEvent = new GuavaEvent();
        //eventbus.register(guavaEvent);
        //eventbus.post("Tom");

        GuavaGper guavaGper = GuavaGper.getInstance();
        eventbus.register(guavaGper);
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        eventbus.post(question);
    }
}
