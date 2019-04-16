package DecoratorPattern.java;

import main.java.Manufacturer;

public class FactoryImpl implements Factory {
    private Manufacturer manufacturer;
    
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
