package main.java;

public class SportsCarSpeedupDecorator extends FactoryDecorator {
    
    public SportsCarSpeedupDecorator(Factory factory, String typeOfCar) {
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
