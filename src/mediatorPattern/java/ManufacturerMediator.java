package mediatorPattern.java;

import java.util.ArrayList;

import decoratorAndFactoryPattern.java.Factory;

//ManufacturerMediator utilizes the mediator design patter by having it control the actions of
//all the manufacturers and the timing of them using a Thread.sleep method
public class ManufacturerMediator implements Mediator {

    //List of all manufacturers
	private ArrayList<Manufacturer> manufacturers;
	
	//Basic constructor
	public ManufacturerMediator() {
		manufacturers = new ArrayList<Manufacturer>();
	}
	
	//Method iterates over the manufacturers and calls makeCars on each
	@Override
	public void makeCars() {
		for (Manufacturer m : manufacturers) {
			m.makeCars();
		}
	}
	
    //Method iterates over the manufacturers and calls printManufacturers on each
	@Override
	public void printManufacturers() {
		for (Manufacturer m : manufacturers) {
			m.printManufacturerData();
		}
		
	}
	
    //Method iterates over the manufacturers and calls sellCars on each
    @Override
    public void sellCars() {
        for (Manufacturer m : manufacturers) {
            m.sellCars();
        }
    }

	//Finds the manufacturer with the most money and the manufacturer with the 
	// least value and checks if the one can buy the other
	@Override
	public void sellAndBuyManufacturer() {
	    
		//Find the manufacturer with the most money and the one with the least value:
	    Manufacturer wealthiest;
	    Manufacturer cheapest;
	    wealthiest = manufacturers.get(0);
	    cheapest = manufacturers.get(0);
	    for (Manufacturer m : manufacturers) {
	        if (m.getTotalMoney() > wealthiest.getTotalMoney()) {
	            wealthiest = m;
	        }
	        if (m.getTotalValue() < cheapest.getTotalValue()) {
	            cheapest = m;
	        }
	    }
	    
	    //If the wealthy manufacturer can afford the cheap one than it buys the cheap one
	    if (wealthiest != cheapest && wealthiest.getTotalMoney() > cheapest.getTotalValue()) {
	        manufacturerBuysManufacturer(wealthiest, cheapest);
	        System.out.println("Manufacturer: " + wealthiest.getName() + "just bought out " + cheapest.getName() + "!!");
	        manufacturers.remove(cheapest);
	    }
		
	}

	//Method adds all the factories previously owned by the selling manufacturer to the buying one
	@Override
    public void manufacturerBuysManufacturer(Manufacturer buyer, Manufacturer seller) {
	    for (Factory f : seller.getFactories()) {
	        buyer.addFactory(f);
	    }
	}
    
	//Method for running the program and having the "tick" effect
	@Override
	public void run() {
		while (manufacturers.size() > 1) {
			try {
				Thread.sleep(100);
				makeCars();
				sellCars();
				sellAndBuyManufacturer();
				printManufacturers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void addManufacturer(Manufacturer m) {
		manufacturers.add(m);
	}
        
}
