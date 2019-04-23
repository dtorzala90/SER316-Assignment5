package decoratorAndFactoryPattern.java;

import java.util.ArrayList;

// Interface for creating a Factory object
public interface Factory {
    int numCarsMade();
    
    ArrayList<Car> makeCars(int numToMake);
    
    String getTypeCarsMade();
    
    double costPerCar();
    
    double valueOfCar();
}
