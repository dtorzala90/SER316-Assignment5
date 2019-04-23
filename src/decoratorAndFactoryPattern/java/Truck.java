package decoratorAndFactoryPattern.java;

public class Truck implements Car {
    private double baseCost;
    
    public Truck(double baseCost) {
        this.baseCost = baseCost;
    }
    
    @Override
    public void makeCar() {
        
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

}
