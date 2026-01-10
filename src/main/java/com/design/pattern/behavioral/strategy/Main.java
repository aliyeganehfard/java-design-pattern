package com.design.pattern.behavioral.strategy;

import com.design.pattern.behavioral.strategy.impl.ConcreteStrategyAdd;
import com.design.pattern.behavioral.strategy.impl.ConcreteStrategyMultiple;
import com.design.pattern.behavioral.strategy.impl.ConcreteStrategySubtract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        var firstNumber = scanner.nextInt();
        System.out.print("enter a number: ");
        var secondNumber = scanner.nextInt();
        System.out.print("enter a operation( + , - , * ): ");
        var operation = scanner.next();

        var context = new StrategyContext();

        switch (operation) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubtract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiple());
        }

        var result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println(result);
    }
}
