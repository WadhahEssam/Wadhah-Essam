
public class Edible extends Product {
	
	private String category ; 
	
	public Edible(int id, String section, double price , String category ) {
		super(id, section, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString () {
		return (super.toString() + "category : " + this.category ) ;
	}

}
