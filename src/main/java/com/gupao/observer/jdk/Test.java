package com.gupao.observer.jdk;

/**
 * Created by DJ on 2019年08月03日 22:16
 **/
public class Test {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher tom = new Teacher("Tom");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(tom);
        gper.publishQuestion(question);
    }
}
