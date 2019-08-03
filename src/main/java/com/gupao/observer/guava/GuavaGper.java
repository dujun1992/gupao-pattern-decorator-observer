package com.gupao.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.gupao.observer.jdk.Question;

/**
 * Created by DJ on 2019年08月03日 22:10
 **/
public class GuavaGper {
    private String name = "GPer生态圈";
    private static GuavaGper gper = null;
    private GuavaGper(){}

    public static GuavaGper getInstance(){
        if(null == gper){
            gper = new GuavaGper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    @Subscribe
    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
