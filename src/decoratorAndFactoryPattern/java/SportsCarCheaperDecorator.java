package decoratorAndFactoryPattern.java;

//This is a decorator for making a factory produce Sports Cars cars for 70% of original cost
//when it wraps a factory object
public class SportsCarCheaperDecorator extends FactoryDecorator {

    public SportsCarCheaperDecorator(Factory factory) {
        super(factory);
    }

    //This method sends the originally calculated cost to the method for manipulation
    @Override
    public double costPerCar() {
        return calculateCostPerCar(super.costPerCar());
    }

    // This method returns 70% the original number
    private int calculateCostPerCar(double num) {
        return (int) Math.floor(num * .7);
    }
}
