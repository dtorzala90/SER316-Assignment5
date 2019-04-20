package decoratorAndFactoryPattern.java;

public class HybridSpeedupDecorator extends FactoryDecorator {
    
    public HybridSpeedupDecorator(Factory factory) {
        super(factory);
    }
    
    @Override
    public int numCarsMade() {
        return calculateNumCarsMade(super.numCarsMade());
    }
    
    private int calculateNumCarsMade(int num) {
        return (int) Math.floor(num * 1.8);
    }
}
