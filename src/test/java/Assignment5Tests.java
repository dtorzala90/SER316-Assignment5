package test.java;

import main.java.Manufacturer;

import java.util.ArrayList;

import org.junit.Before;

import org.junit.Test;

import DecoratorPattern.java.Factory;
import DecoratorPattern.java.FactoryDecorator;
import DecoratorPattern.java.FactoryImpl;
import DecoratorPattern.java.HybridSpeedupDecorator;
import DecoratorPattern.java.SportsCarSpeedupDecorator;
import DecoratorPattern.java.TruckSpeedupDecorator;

public class Assignment5Tests {
    Factory thisFactory;
    
    @Before
    public void setUp() throws Exception {
    }
    
    //This tests the methods setName and getName under Manufacturer class
    @Test
    public void testManufacturerSetGetName() {
        Factory f = new FactoryImpl();
        Manufacturer m = new Manufacturer("Volkswagen",f);
        m.setName("Bob");
        assert(m.getName() == "Bob");
    }
    
    //This tests the method addFactory under Manufacturer class
    @Test
    public void testManufacturerAddFactory() {
        Factory f1 = new FactoryImpl();
        Factory f2 = new FactoryImpl();
        Manufacturer m = new Manufacturer("Volkswagen");
        assert(m.addFactory(f1));
        assert(m.addFactory(f2));
    }
    
    //This tests the methods setFactories and getFactories under Manufacturer class
    @Test
    public void testManufacturerSetGetFactories() {
        Factory f = new FactoryImpl();
        ArrayList<Factory> fList = new ArrayList<Factory>();
        fList.add(f);
        Manufacturer m = new Manufacturer("Volkswagen",f);
        m.setFactories(fList);
        assert(m.getFactories() == fList);
    }
    
    //This tests the methods FactoryImpl.numCarsMade method
    @Test
    public void testFactoryImplNumCarsMade() {
        Factory f = new FactoryImpl();
        assert(f.numCarsMade() == 10);
    }
    
    //This tests the methods FactoryImpl.costPerCar method
    @Test
    public void testFactoryImplCostPerCar() {
        Factory f = new FactoryImpl();
        assert(f.costPerCar() == 5.0);
    }
    
    //This tests the methods set and getManufacturer in FactoryImpl class
    @Test
    public void testFactoryImplSetGetManufacturer() {
        FactoryImpl f = new FactoryImpl();
        Manufacturer m = new Manufacturer("BMW");
        f.setManufacturer(m);
        assert(f.getManufacturer() == m);
    }
    
    //This tests the methods of TruckSpeedupDecorator
    @Test
    public void testTruckSpeedupDecorator() {
        Factory f = new FactoryImpl();
        FactoryDecorator fd = new FactoryDecorator(new TruckSpeedupDecorator(f));
        assert(fd.costPerCar() == 5.0);
        assert(fd.numCarsMade() == 17);
    }
    
    //This tests the methods of SportsCarSpeedupDecorator
    @Test
    public void testSportsCarSpeedupDecorator() {
        Factory f = new FactoryImpl();
        FactoryDecorator fd = new FactoryDecorator(new SportsCarSpeedupDecorator(f));
        assert(fd.costPerCar() == 5.0);
        assert(fd.numCarsMade() == 15);
    }
    
    //This tests the methods of HybridSpeedupDecorator
    @Test
    public void testHybridSpeedupDecorator() {
        Factory f = new FactoryImpl();
        FactoryDecorator fd = new FactoryDecorator(new HybridSpeedupDecorator(f));
        assert(fd.costPerCar() == 5.0);
        assert(fd.numCarsMade() == 18);
    }
}