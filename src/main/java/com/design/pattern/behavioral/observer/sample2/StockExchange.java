package com.design.pattern.behavioral.observer.sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {

    private float price = 100;
    private final Random random;
    private final List<Observer> observers = new ArrayList<Observer>();

    public StockExchange() {
        random = new Random();
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            price = price + 2 * random.nextFloat() - 1;
            notifyObservers();
            System.out.println("price : " + price);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
