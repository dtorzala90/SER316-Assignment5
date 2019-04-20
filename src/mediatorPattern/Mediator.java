package mediatorPattern;

import main.java.*;

public interface Mediator {

	public void makeCars();
	
	public void buyManufacturer(Manufacturer buyer, Manufacturer seller);
	
	public void run();
	
	public void addManufacturer(Manufacturer m);
	
	public void printManufacturers();
}
