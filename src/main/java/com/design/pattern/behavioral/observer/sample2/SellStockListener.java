package com.design.pattern.behavioral.observer.sample2;

public class SellStockListener implements Observer{
    @Override
    public void update(float price) {
        if(price > 105){
            System.out.println("selling stock with price " + price);
        }
    }
}
