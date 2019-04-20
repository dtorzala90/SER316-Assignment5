package main.java;

import java.util.ArrayList;
import java.util.HashMap;

import decoratorPattern.java.Factory;

public class Manufacturer {
    private String name;
    private ArrayList<Factory> factories;
    private HashMap<String,Integer> inventory;
    private double totalMoney;
    private double totalValue;

	public Manufacturer(String pname, Factory pfactory, double startMoney, double startValue) {
        this.name = pname;
        this.totalMoney = startMoney;
        this.totalValue = startValue;
        this.addFactory(pfactory);
        initiateInventory();
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
    		int num = f.numCarsMade();
    		int ogNum = inventory.get(f.getTypeCarsMade());
    		inventory.put(f.getTypeCarsMade(), ogNum + num);
    		double costOfMakingCars = num * f.costPerCar();
    		double valueFromMakingCars = num * f.valueOfCar();
    		totalMoney -= costOfMakingCars;
    		totalValue += valueFromMakingCars;
    	}
    }
    
    private void initiateInventory() {
    	inventory = new HashMap<String,Integer>();
    	inventory.put("Sports Cars", 0);
    	inventory.put("Trucks", 0);
    	inventory.put("Hybrid Cars", 0);
    }
    
    public void printManufacturerData() {
    	System.out.println("***********************\n\t" + this.name 
    			+ "\n***********************\nType of Car\tAmount\nSports Cars\t" 
    			+ inventory.get("Sports Cars") + "\nTrucks\t\t" + inventory.get("Trucks") +
    			"\nHybrid Cars\t" + inventory.get("Hybrid Cars") + "\n\n");
    }
    
    public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
    
    public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
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
