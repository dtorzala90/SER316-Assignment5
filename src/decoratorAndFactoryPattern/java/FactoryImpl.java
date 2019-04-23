package decoratorAndFactoryPattern.java;

import java.util.ArrayList;

import mediatorPattern.java.Manufacturer;

// A basic implementation of a factory object. This is the class that will be wrapped
// by the appropriate decorators and also implements the factory design pattern in the getCar method
public class FactoryImpl implements Factory {
    
	// private attributes of a Factory object
    private String typeCarsMade;
    private Manufacturer manufacturer;
    private double baseCost;
    
    // Basic constructor
	public FactoryImpl(String typeCarsMade, double baseCost) {
    	this.typeCarsMade = typeCarsMade;
    	this.baseCost = baseCost;
    }
    
	// This method takes in the number of cars to be made and returns an array list of those objects
    public ArrayList<Car> makeCars(int numToMake) {
    	ArrayList<Car> carList = new ArrayList<Car>();
    	for(int i = 0; i < numToMake; i++) {
    		carList.add(getCar());
    	}
    	return carList;
    }

    // This method is what implements the factory design pattern
    // by returning the correct Car object depending on the type of car needed
    public Car getCar(){
        if(typeCarsMade == null){
           return null;
        }		
        if(typeCarsMade.equalsIgnoreCase("Sports Cars")){
           return new SportsCar(baseCost);
           
        } else if(typeCarsMade.equalsIgnoreCase("Hybrid Cars")){
           return new HybridCar(baseCost);
           
        } else if(typeCarsMade.equalsIgnoreCase("Trucks")){
           return new Truck(baseCost);
        }
        
        return null;
     }
    
    // Sets the generic number of cars to be made. This could have further modification
    // depending on the needs of the program
	@Override
    public int numCarsMade() {
        return 10;
    }
    
	// Sets the cost of making a car to 10% of the base cost. This could have further
	// modification depending on the needs of the program
    @Override
    public double costPerCar() {
        return baseCost * .1;
    }
    
    // sets the value of the car to equal 150% of the base cost. This could have further
    // modification depending on the needs of the program
	@Override
	public double valueOfCar() {
		return baseCost * 1.5;
	}
    
    public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
    
    public String getTypeCarsMade() {
		return typeCarsMade;
	}

	public void setTypeCarsMade(String typeCarsMade) {
		this.typeCarsMade = typeCarsMade;
	}
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
