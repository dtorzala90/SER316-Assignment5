package DecoratorPattern.java;

public class FactoryDecorator implements Factory {
    private Factory factory;
    
    public FactoryDecorator(Factory factory) {
        this.factory = factory;
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
