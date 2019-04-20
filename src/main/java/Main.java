package main.java;

import decoratorPattern.java.FactoryDecorator;
import decoratorPattern.java.FactoryImpl;
import decoratorPattern.java.TruckSpeedupDecorator;
import mediatorPattern.ManufacturerMediator;

public class Main {
    /**
     * Main method for testing the code in a runtime environment.
     */
    public static void main(String[] args)throws Exception {
        
        // Create a Factory without any trade:
        FactoryImpl basicFactory = new FactoryImpl("Sports Cars", 10000);
        System.out.println("Here is how many cars this factory would make "
                + "without the decorator: " + basicFactory.numCarsMade());
        
        // Wrap the factory in the decorator (or trade):
        FactoryDecorator decoratedFactory = new FactoryDecorator(new TruckSpeedupDecorator(basicFactory));
        System.out.println("Here is how many cars this factory would make "
                + "with the decorator: " + decoratedFactory.numCarsMade());
        
        Manufacturer m1 = new Manufacturer("BMW",decoratedFactory, 100000, 20000000);
        Manufacturer m2 = new Manufacturer("Volkswagen",decoratedFactory, 7000, 15000000);
        Manufacturer m3 = new Manufacturer("Ford",decoratedFactory, 5000, 10000000);
        ManufacturerMediator manMed = new ManufacturerMediator();
        manMed.addManufacturer(m1);
        manMed.addManufacturer(m2);
        manMed.addManufacturer(m3);
        
        manMed.run();
    }
}
