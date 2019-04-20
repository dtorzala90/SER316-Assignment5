package mediatorPattern;

import java.util.ArrayList;

import main.java.Manufacturer;

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
	public void buyManufacturer(Manufacturer buyer, Manufacturer seller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		while (manufacturers.size() > 1) {
			try {
				wait(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			makeCars();
		}
		
	}

	@Override
	public void addManufacturer(Manufacturer m) {
		manufacturers.add(m);
	}
	
	

}
