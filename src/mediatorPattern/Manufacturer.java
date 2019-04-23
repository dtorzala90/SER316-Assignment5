package mediatorPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

import decoratorAndFactoryPattern.java.Car;
import decoratorAndFactoryPattern.java.Factory;

public class Manufacturer {
    private String name;
    private ArrayList<Factory> factories;
    private HashMap<String,ArrayList<Car>> inventory;
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

    public void sellCars() {
		int totalNumCars = inventory.get("Sports Cars").size() + inventory.get("Trucks").size() + inventory.get("Hybrid Cars").size();
		double costOfSellingCars = 0;
		double valueFromSellingCars = 0;
		if (totalNumCars > 100) {
		    int numSold = (int)(inventory.get("Sports Cars").size() * (Math.random() * (1.1) + .2));
		    for (int i = 0; i < numSold; i++) {
		        costOfSellingCars += inventory.get("Sports Cars").get(i).getBaseCost() * .05;
		        valueFromSellingCars += inventory.get("Sports Cars").get(i).getBaseCost();
		        inventory.get("Sports Cars").remove(i);
		    }
            numSold = (int)(inventory.get("Trucks").size() * (Math.random() * (1.1) + .2));
            for (int i = 0; i < numSold; i++) {
                costOfSellingCars += inventory.get("Trucks").get(0).getBaseCost() * .05;
                valueFromSellingCars += inventory.get("Trucks").get(0).getBaseCost();
                inventory.get("Trucks").remove(0);
            }
            numSold = (int)(inventory.get("Hybrid Cars").size() * (Math.random() * (1.1) + .2));
            for (int i = 0; i < numSold; i++) {
                costOfSellingCars += inventory.get("Hybrid Cars").get(0).getBaseCost() * .05;
                valueFromSellingCars += inventory.get("Hybrid Cars").get(0).getBaseCost();
                inventory.get("Hybrid Cars").remove(0);
            }
		}
		totalMoney += valueFromSellingCars;
		totalMoney -= costOfSellingCars;
		totalValue -= valueFromSellingCars;
    }
    
    public void makeCars() {
        for (Factory f : factories) {
            int num = f.numCarsMade();
            ArrayList<Car> carsToAdd = f.makeCars(num);
            for (Car c: carsToAdd) {
                inventory.get(f.getTypeCarsMade()).add(c);
                System.out.print("Just made a " + f.getTypeCarsMade());
            }
            System.out.print("\n");
            double costOfMakingCars = num * f.costPerCar();
            double valueFromMakingCars = num * f.valueOfCar();
            totalMoney -= costOfMakingCars;
            totalValue += valueFromMakingCars;
        }
    }
    
    private void initiateInventory() {
    	inventory = new HashMap<String, ArrayList<Car>>();
    	inventory.put("Sports Cars", new ArrayList<Car>());
    	inventory.put("Trucks", new ArrayList<Car>());
    	inventory.put("Hybrid Cars", new ArrayList<Car>());
    }
    
    public void printManufacturerData() {
        DecimalFormat df = new DecimalFormat("#.00");
    	System.out.println("***********************\n"
    			+ "\t" + this.name 
    			+ "\n***********************\n"
    			+ "Type of Car\tAmount\nSports Cars\t" + inventory.get("Sports Cars").size() + "\n"
    			+ "Trucks\t\t" + inventory.get("Trucks").size() + "\n"
    			+ "Hybrid Cars\t" + inventory.get("Hybrid Cars").size() + "\n"
    			+ "Total Money: " + "\t$" + df.format(totalMoney) + "\n"
    			+ "Total Value: " + "\t$" + df.format(totalValue) + "\n\n");
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

    
    public HashMap<String, ArrayList<Car>> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<String, ArrayList<Car>> inventory) {
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
