package main.java;

import java.util.ArrayList;

public class Manufacturer {
    private String name;
    private ArrayList<Factory> factories;
    
    

    public ArrayList<Factory> getFactories() {
        return factories;
    }

    public void setFactories(ArrayList<Factory> factories) {
        this.factories = factories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
