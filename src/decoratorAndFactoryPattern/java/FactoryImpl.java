package decoratorAndFactoryPattern.java;

import java.util.ArrayList;
import java.util.HashMap;

import mediatorPattern.Manufacturer;

public class FactoryImpl implements Factory {
	private String typeCarsMade;
    private Manufacturer manufacturer;
    private double baseCost;
    
	public FactoryImpl(String typeCarsMade, double baseCost) {
    	this.typeCarsMade = typeCarsMade;
    	this.baseCost = baseCost;
    }
    
    public ArrayList<Car> makeCars(int numToMake) {
    	ArrayList<Car> carList = new ArrayList<Car>();
    	for(int i = 0; i < numToMake; i++) {
    		carList.add(getCar(typeCarsMade));
    	}
    	return carList;
    }

    public Car getCar(String carType){
        if(carType == null){
           return null;
        }		
        if(carType.equalsIgnoreCase("Sports Car")){
           return new SportsCar(baseCost);
           
        } else if(carType.equalsIgnoreCase("Hybrid Car")){
           return new HybridCar(baseCost);
           
        } else if(carType.equalsIgnoreCase("Truck")){
           return new Truck(baseCost);
        }
        
        return null;
     }
    
	@Override
    public int numCarsMade() {
        return 10;
    }
    
    @Override
    public double costPerCar() {
        return 5.0;
    }

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
