package com.design.pattern.behavioral.observer.sample2;

public class BuyStockListener implements Observer {
    @Override
    public void update(float price) {
        if(price < 95){
            System.out.println("buying stock with price " + price);
        }
    }
}
