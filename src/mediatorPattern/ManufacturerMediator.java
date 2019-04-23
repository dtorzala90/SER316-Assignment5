package mediatorPattern;

import java.util.ArrayList;

import decoratorAndFactoryPattern.java.Factory;

public class ManufacturerMediator implements Mediator {

	private ArrayList<Manufacturer> manufacturers;
	
	public ManufacturerMediator() {
		
		manufacturers = new ArrayList<Manufacturer>();
	}
	
	@Override
	public void makeCars() {
		for (Manufacturer m : manufacturers) {
			m.makeCars();
		}
	}
	
	@Override
	public void printManufacturers() {
		for (Manufacturer m : manufacturers) {
			m.printManufacturerData();
		}
		
	}

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
	    
	    if (wealthiest != cheapest && wealthiest.getTotalMoney() > cheapest.getTotalValue()) {
	        manufacturerBuysManufacturer(wealthiest, cheapest);
	        System.out.println("Manufacturer: " + wealthiest.getName() + "just bought out " + cheapest.getName() + "!!");
	    }
		
	}

	@Override
    public void manufacturerBuysManufacturer(Manufacturer buyer, Manufacturer seller) {
	    for (Factory f : seller.getFactories()) {
	        buyer.addFactory(f);
	    }
	}
    
	@Override
	public void run() {
		while (manufacturers.size() > 1) {
			try {
				Thread.sleep(1000);
				makeCars();
				sellAndBuyManufacturer();
				printManufacturers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void addManufacturer(Manufacturer m) {
		manufacturers.add(m);
	}

    @Override
    public void sellCars() {
        for (Manufacturer m : manufacturers) {
            m.sellCars();
        }
        
    }
	
	

}
