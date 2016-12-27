
public class Product {
	private int id ; 
	private String section ; 
	private double price ;
	
	public Product(int id, String section, double price) {
		this.id = id;
		this.section = section;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
	
	@Override
	public String toString () {
		return ("Id : " + this.id + "Section : " +this.section + " Price : " + this.price + "\n" ) ;
	}
	
}
