
public class Meal {
	private String name ;
	private double price ;

	public Meal(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Name Of The Meal : " + this.getName() ) ;
		System.out.println("Price Of The Meal : " + this.getPrice() );
	}
	
}
