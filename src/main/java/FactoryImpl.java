package main.java;

public class FactoryImpl implements Factory {
    private Manufacturer manufacturer;
    
    @Override
    public Car makeCar() {
        Car newCar = new Car();
        return newCar;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
