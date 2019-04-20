package mediatorPattern;

import java.util.ArrayList;

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
	public void buyManufacturer(Manufacturer buyer, Manufacturer seller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		while (manufacturers.size() > 1) {
			try {
				Thread.sleep(1000);
				makeCars();
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
	
	

}
