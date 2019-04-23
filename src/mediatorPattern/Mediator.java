package mediatorPattern;

//Interface for implementing the ManufacturerMediator object
public interface Mediator {

	public void makeCars();
	
	public void sellCars();
	
	public void manufacturerBuysManufacturer(Manufacturer buyer, Manufacturer seller);
	
	public void sellAndBuyManufacturer();
	
	public void run();
	
	public void addManufacturer(Manufacturer m);
	
	public void printManufacturers();
}
