package decoratorAndFactoryPattern.java;

public class SportsCar implements Car {
    private double baseCost;
    
    public SportsCar(double baseCost) {
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
