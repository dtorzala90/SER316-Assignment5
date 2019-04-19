package DecoratorPattern.java;

import java.util.HashMap;

public interface Factory {
    int numCarsMade();
    
    HashMap<String, Integer> makeCars();
    
    String getTypeCarsMade();
    
    double costPerCar();
}
