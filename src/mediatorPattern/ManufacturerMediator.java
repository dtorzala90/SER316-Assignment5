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
	public void buyManufacturer(Manufacturer m) {
		// TODO Auto-generated method stub
		
	}

}
