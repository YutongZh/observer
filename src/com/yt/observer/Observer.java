package com.yt.observer;

/**
 * 观察者
 */
public class Observer {

    public void advice(Event e){
        System.out.println("我是观察者！我得到通知啦！通知内容是" + e);
    }
}
