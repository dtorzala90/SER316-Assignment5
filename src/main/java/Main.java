package main.java;

import DecoratorPattern.java.FactoryDecorator;
import DecoratorPattern.java.FactoryImpl;
import DecoratorPattern.java.TruckSpeedupDecorator;

public class Main {
    /**
     * Main method for testing the code in a runtime environment.
     */
    public static void main(String[] args)throws Exception {
        FactoryDecorator decoratedFactory = new FactoryDecorator(
                new TruckSpeedupDecorator(new FactoryImpl()));
        System.out.println(decoratedFactory.numCarsMade());
    }
}
