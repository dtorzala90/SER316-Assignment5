package decoratorAndFactoryPattern.java;

public class HybridCheaperDecorator extends FactoryDecorator {
    
    public HybridCheaperDecorator(Factory factory) {
        super(factory);
    }
    
    //This method sends the originally calculated cost to the method for manipulation
    @Override
    public double costPerCar() {
        return calculateCostPerCar(super.costPerCar());
    }
    
    // This method returns 80% the original number
    private int calculateCostPerCar(double num) {
        return (int) Math.floor(num * .8);
    }
}
