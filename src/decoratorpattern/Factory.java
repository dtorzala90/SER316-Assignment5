package decoratorpattern;

import java.util.ArrayList;

import factorypattern.Car;

// Interface for creating a Factory object
public interface Factory {
    int numCarsMade();
    
    ArrayList<Car> makeCars(int numToMake);
    
    String getTypeCarsMade();
    
    double costPerCar();
    
    double valueOfCar();
}
