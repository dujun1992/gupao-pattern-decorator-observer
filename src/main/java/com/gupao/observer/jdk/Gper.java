package com.gupao.observer.jdk;

import java.util.Observable;

/**
 * Created by DJ on 2019年08月03日 22:10
 **/
public class Gper extends Observable {
    private String name = "GPer生态圈";
    private static Gper gper = null;
    private Gper(){}

    public static Gper getInstance(){
        if(null == gper){
            gper = new Gper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
