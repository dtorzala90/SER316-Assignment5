package decoratorandfactorypattern;

// This is a decorator for making a factory produce Hybrid cars for 80% of original cost
// when it wraps a factory object
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
