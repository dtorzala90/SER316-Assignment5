package decoratorAndFactoryPattern.java;

public class SportsCarSpeedupDecorator extends FactoryDecorator {
    
    public SportsCarSpeedupDecorator(Factory factory) {
        super(factory);
    }
    
    //This method sends the originally calculated number to the method for manipulation
    @Override
    public int numCarsMade() {
        return calculateNumCarsMade(super.numCarsMade());
    }
    
    // This method returns 150% the original number
    private int calculateNumCarsMade(int num) {
        return (int) Math.floor(num * 1.5);
    }
    
}
