package decoratorPattern.java;

import java.util.HashMap;

import main.java.Manufacturer;

public class FactoryImpl implements Factory {
	private String typeCarsMade;
    private Manufacturer manufacturer;
    private double baseCost;
    
	public FactoryImpl(String typeCarsMade, double baseCost) {
    	this.typeCarsMade = typeCarsMade;
    	this.baseCost = baseCost;
    }
    
    public HashMap<String, Integer> makeCars() {
    	HashMap<String, Integer> inventoryReturn = new HashMap<String, Integer>();
    	inventoryReturn.put(getTypeCarsMade(), numCarsMade());
    	return inventoryReturn;
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
