package com.yt.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Observer observer = new Observer();
        Method advice = observer.getClass().getMethod("advice", new Class[]{Event.class});
        Subject subject = new Subject();
        subject.addEventListener(OpeTypeEnum.ON_ADD, observer, advice);
        subject.add();
    }
}
