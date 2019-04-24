package decoratorAndFactoryPattern.java;

//This is a decorator for making a factory produce Trucks for 50% of original cost
//when it wraps a factory object
public class TruckCheaperDecorator extends FactoryDecorator {

    public TruckCheaperDecorator(Factory factory) {
        super(factory);
    }

    //This method sends the originally calculated cost to the method for manipulation
    @Override
    public double costPerCar() {
        return calculateCostPerCar(super.costPerCar());
    }

    // This method returns 50% the original number
    private int calculateCostPerCar(double num) {
        return (int) Math.floor(num * .5);
    }
}
