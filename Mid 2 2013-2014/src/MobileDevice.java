
public abstract class MobileDevice {
	
	protected int storage ; 
	private String brand ; 
	private double speed ; 
	private double price ;
	
	public MobileDevice(int storage, String brand, double speed, double price) {
		this.storage = storage;
		this.brand = brand;
		this.speed = speed;
		this.price = price;
	} 
	
	public MobileDevice ( MobileDevice m ) {
		this.storage = m.storage ; 
		this.brand = m.brand ; 
		this.speed = m.speed ; 
		this.price = m.price ; 
	}
	
	public abstract double calculatePrice () ;
	
	public String getBrand () {
		return this.brand ; 
	}
}
