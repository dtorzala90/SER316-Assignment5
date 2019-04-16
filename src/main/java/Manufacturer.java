package main.java;

import java.util.ArrayList;

public class Manufacturer {
    private String name;
    private ArrayList<Factory> factories;
    
    public Manufacturer(String pname, Factory pfactory) {
        this.name = pname;
        this.addFactory(pfactory);
    }

    private boolean addFactory(Factory pfactory) {
        int arrayLength = factories.size();
        this.factories.add(pfactory);
        if(arrayLength + 1 == factories.size())
            return true;
        else
            return false;
    }

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
