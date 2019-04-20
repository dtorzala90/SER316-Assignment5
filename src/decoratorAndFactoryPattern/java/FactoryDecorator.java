package decoratorAndFactoryPattern.java;

import java.util.ArrayList;
import java.util.HashMap;

public class FactoryDecorator implements Factory {
    private Factory factory;
    
    public FactoryDecorator(Factory factory) {
        this.factory = factory;
    }

    @Override
    public int numCarsMade() {
        return factory.numCarsMade();
    }

    @Override
    public double costPerCar() {
        return factory.costPerCar();
    }

	@Override
	public ArrayList<Car> makeCars(int numToMake) {
		return factory.makeCars(numToMake);
	}

	@Override
	public String getTypeCarsMade() {
		return factory.getTypeCarsMade();
	}

	@Override
	public double valueOfCar() {
		return factory.valueOfCar();
	}

}
