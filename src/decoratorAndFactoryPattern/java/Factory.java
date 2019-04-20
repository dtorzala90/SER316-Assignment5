package decoratorAndFactoryPattern.java;

import java.util.ArrayList;

public interface Factory {
    int numCarsMade();
    
    ArrayList<Car> makeCars(int numToMake);
    
    String getTypeCarsMade();
    
    double costPerCar();
    
    double valueOfCar();
}
