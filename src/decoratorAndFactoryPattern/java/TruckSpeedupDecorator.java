package decoratorAndFactoryPattern.java;

public class TruckSpeedupDecorator extends FactoryDecorator {

    public TruckSpeedupDecorator(Factory factory) {
        super(factory);
    }
    
    //This method sends the originally calculated number to the method for manipulation
    @Override
    public int numCarsMade() {
        return calculateNumCarsMade(super.numCarsMade());
    }
    
    // This method returns 180% the original number
    private int calculateNumCarsMade(int num) {
        return (int) Math.floor(num * 1.8);
    }
}
