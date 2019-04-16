package main.java;

public class FactoryDecorator implements Factory {
    private Factory factory;
    private String typeOfCar;
    
    public FactoryDecorator(Factory pfactory, String ptypeOfCar) {
        this.factory = pfactory;
        this.typeOfCar = ptypeOfCar;
    }

    @Override
    public int numCarsMade() {
        return factory.numCarsMade();
    }

    @Override
    public double costPerCar() {
        return factory.costPerCar();
    }

}
