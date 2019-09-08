package com.yt.observer;

import java.lang.reflect.InvocationTargetException;

/**
 * 主题类 即观察者观察的对象
 */
public class Subject extends EventListener{

    public void add() throws InvocationTargetException, IllegalAccessException {
        System.out.println("我是主题类，我开始调用add方法" );
        super.trigger(OpeTypeEnum.ON_ADD);
    }

    public void remove(){
        System.out.println("我是主题类，我开始调用remove方法");

    }
}
