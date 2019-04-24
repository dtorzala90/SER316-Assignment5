package test.java;

import decoratorpattern.Factory;
import decoratorpattern.FactoryDecorator;
import decoratorpattern.FactoryImpl;
import decoratorpattern.HybridCheaperDecorator;
import decoratorpattern.HybridSpeedupDecorator;
import decoratorpattern.SportsCarCheaperDecorator;
import decoratorpattern.SportsCarSpeedupDecorator;
import decoratorpattern.TruckCheaperDecorator;
import decoratorpattern.TruckSpeedupDecorator;
import mediatorpattern.Manufacturer;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Assignment5Tests {
    Factory thisFactory;
    
    @Before
    public void setUp() throws Exception {
    }
    
    //This tests the methods setName and getName under Manufacturer class
    @Test
    public void testManufacturerSetGetName() {
        Factory f = new FactoryImpl("a", 10.0);
        Manufacturer m = new Manufacturer("Volkswagen",f, 10.0, 10.0);
        m.setName("Bob");
        assert (m.getName() == "Bob");
    }
    
    //This tests the method addFactory under Manufacturer class
    @Test
    public void testManufacturerAddFactory() {
        Factory f1 = new FactoryImpl("a", 10.0);
        Factory f2 = new FactoryImpl("b", 10.0);
        Manufacturer m = new Manufacturer("Volkswagen",f1, 10.0, 10.0);
        assert (m.addFactory(f1));
        assert (m.addFactory(f2));
    }
    
    //This tests the methods setFactories and getFactories under Manufacturer class
    @Test
    public void testManufacturerSetGetFactories() {
        Factory f = new FactoryImpl("a", 10.0);
        ArrayList<Factory> list = new ArrayList<Factory>();
        list.add(f);
        Manufacturer m = new Manufacturer("Volkswagen",f, 10.0, 10.0);
        m.setFactories(list);
        assert (m.getFactories() == list);
    }
    
    //This tests the methods FactoryImpl.numCarsMade method
    @Test
    public void testFactoryImplNumCarsMade() {
        Factory f = new FactoryImpl("a", 10.0);
        assert (f.numCarsMade() == 10);
    }
    
    //This tests the methods FactoryImpl.costPerCar method
    @Test
    public void testFactoryImplCostPerCar() {
        Factory f = new FactoryImpl("a", 10.0);
        assert (f.costPerCar() == 1.0);
    }
    
    //This tests the methods set and getManufacturer in FactoryImpl class
    @Test
    public void testFactoryImplSetGetManufacturer() {
        FactoryImpl f = new FactoryImpl("a", 10.0);
        Manufacturer m = new Manufacturer("Volkswagen",f, 10.0, 10.0);
        f.setManufacturer(m);
        assert (f.getManufacturer() == m);
    }
    
    //This tests the methods of TruckSpeedupDecorator
    @Test
    public void testTruckSpeedupDecorator() {
        Factory f = new FactoryImpl("a", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new TruckSpeedupDecorator(f));
        assert (fd.costPerCar() == 1.0);
        assert (fd.numCarsMade() == 18);
    }
    
    //This tests the methods of SportsCarSpeedupDecorator
    @Test
    public void testSportsCarSpeedupDecorator() {
        Factory f = new FactoryImpl("a", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new SportsCarSpeedupDecorator(f));
        assert (fd.costPerCar() == 1.0);
        assert (fd.numCarsMade() == 15);
    }
    
    //This tests the methods of HybridSpeedupDecorator
    @Test
    public void testHybridSpeedupDecorator() {
        Factory f = new FactoryImpl("a", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new HybridSpeedupDecorator(f));
        assert (fd.costPerCar() == 1.0);
        assert (fd.numCarsMade() == 18);
    }
    
    //This tests the methods of HybridCheaperDecorator
    @Test
    public void testHybridCheaperDecorator() {
        Factory f = new FactoryImpl("Hybrid Cars", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new HybridCheaperDecorator(f));
        assert (fd.costPerCar() == 0.0);
    }
    
  //This tests the methods of SportsCarCheaperDecorator
    @Test
    public void testSportsCarCheaperDecorator() {
        Factory f = new FactoryImpl("Sports Cars", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new SportsCarCheaperDecorator(f));
        assert (fd.costPerCar() == 0.0);
    }
    
  //This tests the methods of TruckCheaperDecorator
    @Test
    public void testTruckCheaperDecorator() {
        Factory f = new FactoryImpl("Hybrid Cars", 10.0);
        FactoryDecorator fd = new FactoryDecorator(new TruckCheaperDecorator(f));
        assert (fd.costPerCar() == 0.0);
    }
}