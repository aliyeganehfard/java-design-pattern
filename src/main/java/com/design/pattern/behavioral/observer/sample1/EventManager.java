package com.design.pattern.behavioral.observer.sample1;

import java.util.*;

public class EventManager implements IEventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();


    @Override
    public void subscribe(String eventType, EventListener listener) {
        var listenersValue = listeners.get(eventType);
        if (listenersValue == null) {
            listenersValue = new ArrayList<>();
        }
        listenersValue.add(listener);
        listeners.put(eventType, listenersValue);
    }

    @Override
    public void unsubscribe(String eventType, EventListener listener) {
        var listenersValue = listeners.get(eventType);
        if (listenersValue != null) {
            listenersValue.remove(listener);
            listeners.put(eventType, listenersValue);
        }
    }

    @Override
    public void notify(String eventType, String data) {
        var listenersValue = listeners.get(eventType);
        if (listenersValue != null) {
            for (EventListener listener : listenersValue) {
                listener.update(data);
            }
        }
    }
}
