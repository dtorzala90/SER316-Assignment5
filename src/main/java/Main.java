package main.java;

public class Main {

    public static void main(String[] args)throws Exception {
        FactoryDecorator decoratedFactory = new FactoryDecorator(new TruckSpeedupDecorator(new FactoryImpl()));
        System.out.println(decoratedFactory.numCarsMade());
    }
}
