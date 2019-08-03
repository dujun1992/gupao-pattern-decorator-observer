package com.gupao.observer.event;

/**
 * Created by DJ on 2019年08月03日 22:34
 **/
public class Test {
    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK,callback);

        mouse.click();

    }
}
