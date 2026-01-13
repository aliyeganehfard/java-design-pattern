package com.design.pattern.behavioral.observer.sample2;

public interface Subject {

    void addObserver(Observer observer);
    void notifyObservers();
}
