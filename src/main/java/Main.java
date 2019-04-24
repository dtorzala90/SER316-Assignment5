package main.java;

import decoratorAndFactoryPattern.java.*;
import mediatorPattern.java.*;

public class Main {
    /**
     * Main method for testing the code in a runtime environment.
     */
    public static void main(String[] args)throws Exception {

        // Create a Factory without any trade:
        FactoryImpl basicScFactory = new FactoryImpl("Sports Cars", 50000);
        FactoryImpl basicTFactory = new FactoryImpl("Trucks", 32000);
        FactoryImpl basicHFactory = new FactoryImpl("Hybrid Cars", 20000);

        // Wrap the factory in the decorator (or trade):
        FactoryDecorator spedUpTFactory = new FactoryDecorator(
                new TruckSpeedupDecorator(basicTFactory));
        FactoryDecorator spedUpHFactory = new FactoryDecorator(
                new HybridSpeedupDecorator(basicHFactory));
        FactoryDecorator cheaperTFactory = new FactoryDecorator(
                new TruckCheaperDecorator(basicTFactory));
        FactoryDecorator cheaperSCFactory = new FactoryDecorator(
                new SportsCarCheaperDecorator(basicScFactory));
        FactoryDecorator cheaperHFactory = new FactoryDecorator(
                new HybridCheaperDecorator(basicHFactory));

        Manufacturer m1 = new Manufacturer(
                "BMW",spedUpTFactory, 1000000.0, 20000000.0);
        m1.addFactory(cheaperSCFactory);
        Manufacturer m2 = new Manufacturer(
                "Volkswagen",cheaperHFactory, 700000.0, 15000000.0);
        m2.addFactory(spedUpHFactory);
        Manufacturer m3 = new Manufacturer(
                "Ford",cheaperTFactory, 5000000.0, 1000000.0);
        ManufacturerMediator manMed = new ManufacturerMediator();
        manMed.addManufacturer(m1);
        manMed.addManufacturer(m2);
        manMed.addManufacturer(m3);

        manMed.run();
    }
}
