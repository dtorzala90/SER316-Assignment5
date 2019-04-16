package DecoratorPattern.java;

public class SportsCarSpeedupDecorator extends FactoryDecorator {
    
    public SportsCarSpeedupDecorator(Factory factory) {
        super(factory);
    }
    
    @Override
    public int numCarsMade() {
        return calculateNumCarsMade(super.numCarsMade());
    }
    
    private int calculateNumCarsMade(int num) {
        return (int) Math.floor(num * 1.5);
    }
    
}
