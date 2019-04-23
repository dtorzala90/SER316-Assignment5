package decoratorAndFactoryPattern.java;

//Truck is a basic implementation of the interface Car. It could be further specified
//according to real world stats
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
