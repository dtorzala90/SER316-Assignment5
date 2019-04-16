package main.java;

public class FactoryImpl implements Factory {
    private Manufacturer manufacturer;
    
    @Override
    public int numCarsMade() {
        return 0;
    }
    
    @Override
    public double costPerCar() {
        return 0.0;
    }
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
