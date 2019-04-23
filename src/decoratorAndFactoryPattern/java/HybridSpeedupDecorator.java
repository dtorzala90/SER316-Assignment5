package decoratorAndFactoryPattern.java;

//This is a decorator for making a factory produce Hybrid cars with 180% of original productivity
//when it wraps a factory object
public class HybridSpeedupDecorator extends FactoryDecorator {
    
    public HybridSpeedupDecorator(Factory factory) {
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
