package main.java;

import decoratorAndFactoryPattern.java.FactoryDecorator;
import decoratorAndFactoryPattern.java.FactoryImpl;
import decoratorAndFactoryPattern.java.HybridCheaperDecorator;
import decoratorAndFactoryPattern.java.HybridSpeedupDecorator;
import decoratorAndFactoryPattern.java.SportsCarCheaperDecorator;
import decoratorAndFactoryPattern.java.SportsCarSpeedupDecorator;
import decoratorAndFactoryPattern.java.TruckCheaperDecorator;
import decoratorAndFactoryPattern.java.TruckSpeedupDecorator;
import mediatorPattern.Manufacturer;
import mediatorPattern.ManufacturerMediator;

public class Main {
    /**
     * Main method for testing the code in a runtime environment.
     */
    public static void main(String[] args)throws Exception {
        
        // Create a Factory without any trade:
        FactoryImpl basicSCFactory = new FactoryImpl("Sports Cars", 50000);
        FactoryImpl basicTFactory = new FactoryImpl("Trucks", 32000);
        FactoryImpl basicHFactory = new FactoryImpl("Hybrid Cars", 20000);
        
        // Wrap the factory in the decorator (or trade):
        FactoryDecorator spedUpTFactory = new FactoryDecorator(new TruckSpeedupDecorator(basicTFactory));
        FactoryDecorator spedUpSCFactory = new FactoryDecorator(new SportsCarSpeedupDecorator(basicSCFactory));
        FactoryDecorator spedUpHFactory = new FactoryDecorator(new HybridSpeedupDecorator(basicHFactory));
        FactoryDecorator cheaperTFactory = new FactoryDecorator(new TruckCheaperDecorator(basicTFactory));
        FactoryDecorator cheaperSCFactory = new FactoryDecorator(new SportsCarCheaperDecorator(basicSCFactory));
        FactoryDecorator cheaperHFactory = new FactoryDecorator(new HybridCheaperDecorator(basicHFactory));
        
        Manufacturer m1 = new Manufacturer("BMW",spedUpTFactory, 1000000, 20000000);
        m1.addFactory(cheaperSCFactory);
        Manufacturer m2 = new Manufacturer("Volkswagen",cheaperHFactory, 700000, 15000000);
        m2.addFactory(spedUpHFactory);
        Manufacturer m3 = new Manufacturer("Ford",cheaperTFactory, 5000000, 1000000);
        ManufacturerMediator manMed = new ManufacturerMediator();
        manMed.addManufacturer(m1);
        manMed.addManufacturer(m2);
        manMed.addManufacturer(m3);
        
        manMed.run();
    }
}
