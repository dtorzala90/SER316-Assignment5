package main.java;

public class HybridSpeedupDecorator extends FactoryDecorator {
    
    public HybridSpeedupDecorator(Factory factory, String typeOfCar) {
        super(factory, typeOfCar);
    }
    
    @Override
    public int numCarsMade() {
        return calculateNumCarsMade(super.numCarsMade());
    }
    
    private int calculateNumCarsMade(int num) {
        return (int) Math.floor(num * 1.5);
    }
}
