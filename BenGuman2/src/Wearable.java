
public class Wearable extends Product {
	
	private String size ; 
	private boolean babyWear ; 
	
	public Wearable(int id, String section, double price , String size , boolean babyWear ) {
		super(id, section, price);
		this.size = size ; 
		this.babyWear = babyWear ; 
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isBabyWear() {
		return babyWear;
	}

	public void setBabyWear(boolean babyWear) {
		this.babyWear = babyWear;
	} 
	
	@Override
	public String toString () {
		super.toString(); 
		return (super.toString() + "Size : " + this.size + " babyWear : " + this.babyWear ) ;
		
	}

}
