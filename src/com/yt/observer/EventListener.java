package com.yt.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventListener {

    Map<Enum, Event> eventMap = new HashMap<Enum, Event>();

    //注册到监听器中
    public void addEventListener (Enum type, Object target, Method callback){
        eventMap.put(type, new Event(target, callback));
    }

    //触发事件
    public void trigger(Enum type) throws InvocationTargetException, IllegalAccessException {
        if (!eventMap.containsKey(type)){
            return;
        }
        Event event = eventMap.get(type);
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        event.getCallback().invoke(event.getTarget(), event);
    }
}
