package com.design.pattern.behavioral.observer.sample1;

public interface IEventManager {

    void subscribe(String eventType, EventListener listener);

    void unsubscribe(String eventType, EventListener listener);

    void notify(String eventType, String data);
}
