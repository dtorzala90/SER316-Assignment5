package main.java;

import java.util.ArrayList;
import java.util.HashMap;

import DecoratorPattern.java.Factory;

public class Manufacturer {
    private String name;
    private ArrayList<Factory> factories;
    private HashMap<String,Integer> inventory;

	public Manufacturer(String pname, Factory pfactory) {
        this.name = pname;
        this.addFactory(pfactory);
    }
    
    public Manufacturer(String pname) {
        this.name = pname;
    }

    public boolean addFactory(Factory pfactory) {
        if (factories == null) {
            factories = new ArrayList<Factory>();
            this.factories.add(pfactory);
            return true;
        }
        int arrayLength = factories.size();
        this.factories.add(pfactory);
        if (arrayLength + 1 == factories.size()) {
            return true;
        } else {
            return false;
        }
    }

    public void makeCars() {
    	for (Factory f : factories) {
    		f.makeCars();
    	}
    }
    
    public HashMap<String, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<String, Integer> inventory) {
		this.inventory = inventory;
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
