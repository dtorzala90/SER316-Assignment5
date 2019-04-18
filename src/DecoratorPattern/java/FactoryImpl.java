package DecoratorPattern.java;

import java.text.DecimalFormat;

import main.java.Manufacturer;

public class FactoryImpl implements Factory {
    private Manufacturer manufacturer;
    
    public void makeCars() {
    	DecimalFormat df = new DecimalFormat("#.00"); 
    	System.out.println("The number of cars this factory made: " 
    			+ numCarsMade() + " at $" + df.format(costPerCar()));
    }
    
    
    @Override
    public int numCarsMade() {
        return 10;
    }
    
    @Override
    public double costPerCar() {
        return 5.0;
    }
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
