package main.java;

public class FactoryDecorator implements Factory {
    private Factory factory;
    
    public FactoryDecorator(Factory pfactory) {
        this.factory = pfactory;
    }
    
    @Override
    public Car makeCar() {
        return factory.makeCar();
    }
}
