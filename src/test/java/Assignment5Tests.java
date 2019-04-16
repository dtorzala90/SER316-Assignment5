package test.java;

import main.java.Manufacturer;

import java.util.ArrayList;

import org.junit.Before;

import org.junit.Test;

import DecoratorPattern.java.Factory;
import DecoratorPattern.java.FactoryImpl;

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
    
}