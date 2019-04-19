package main.java;

import DecoratorPattern.java.FactoryDecorator;
import DecoratorPattern.java.FactoryImpl;
import DecoratorPattern.java.TruckSpeedupDecorator;

public class Main {
    /**
     * Main method for testing the code in a runtime environment.
     */
    public static void main(String[] args)throws Exception {
        
        // Create a Factory without any trade:
        FactoryImpl basicFactory = new FactoryImpl("Sports Cars");
        System.out.println("Here is how many cars this factory would make "
                + "without the decorator: " + basicFactory.numCarsMade());
        
        // Wrap the factory in the decorator (or trade):
        FactoryDecorator decoratedFactory = new FactoryDecorator(
                new TruckSpeedupDecorator(basicFactory));
        System.out.println("Here is how many cars this factory would make "
                + "with the decorator: " + decoratedFactory.numCarsMade());
        
        Manufacturer m = new Manufacturer("BMW",decoratedFactory);
        m.makeCars();
        m.printManufacturerData();
        m.makeCars();
        m.printManufacturerData();
    }
}
