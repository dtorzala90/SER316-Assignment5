package decoratorAndFactoryPattern.java;

public class HybridCar implements Car {
    private double baseCost;
    
    public HybridCar(double baseCost) {
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
