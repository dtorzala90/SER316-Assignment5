package decoratorandfactorypattern;

//SportsCar is a basic implementation of the interface Car. It could be further specified
//according to real world stats
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
