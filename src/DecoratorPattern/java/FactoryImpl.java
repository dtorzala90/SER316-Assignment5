package DecoratorPattern.java;

import java.util.HashMap;

import main.java.Manufacturer;

public class FactoryImpl implements Factory {
	private String typeCarsMade;
    private Manufacturer manufacturer;
    
    public FactoryImpl(String typeCarsMade) {
    	this.typeCarsMade = typeCarsMade;
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
