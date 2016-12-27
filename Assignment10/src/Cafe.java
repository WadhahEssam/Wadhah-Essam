
public class Cafe {
	
	private double discount ; 
	private double coffeePrice ; 
	private double teaPrice ; 
	private double donutPrice ; 
	private int coffeeTotQty ; 
	private int teaTotQty; 
	private int donutTotQty;
	private double subtotal ; 
	private double discountedPrice ; 
	private double total ;
	
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		if (discount >= 0 ) 
		this.discount = discount;
	}
	public double getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(double coffeePrice) {
		if (coffeePrice >= 0 ) 
		this.coffeePrice = coffeePrice;
	}
	public double getTeaPrice() {
		return teaPrice;
	}
	public void setTeaPrice(double teaPrice) {
		if (teaPrice >= 0 ) 
		this.teaPrice = teaPrice;
	}
	public double getDonutPrice() {
		return donutPrice;
	}
	public void setDonutPrice(double donutPrice) {
		if (donutPrice >= 0 ) 
		this.donutPrice = donutPrice;
	}
	public int getCoffeeTotQty() {
		return coffeeTotQty;
	}
	public void setCoffeeTotQty(int coffeeTotQty) {
		if (coffeeTotQty >= 0 ) 
		this.coffeeTotQty = coffeeTotQty;
	}
	public int getTeaTotQty() {
		return teaTotQty;
	}
	public void setTeaTotQty(int teaTotQty) {
		if (teaTotQty >= 0 ) 
		this.teaTotQty = teaTotQty;
	}
	public int getDonutTotQty() {
		return donutTotQty;
	}
	public void setDonutTotQty(int donutTotQty) {
		if (donutTotQty >= 0 ) 
		this.donutTotQty = donutTotQty;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice() {
		this.discountedPrice =  ( this.subtotal / 100 * this.discount )   ;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	} 
	
	
	private void calculateSubTotal(int coffeeQty , int teaQty , int donutQty ) {
		double subtotal ; 
		subtotal = coffeeQty  * this.coffeePrice  + teaQty * this.teaPrice + donutQty * this.donutPrice ;
		this.subtotal = subtotal ; 
	}
	
	private void calculateTotal (int coffeeQty , int teaQty , int donutQty ) {
		calculateSubTotal ( coffeeQty ,teaQty , donutQty ) ; 
		this.setDiscountedPrice();
	    this.total = ( this.subtotal - this.discountedPrice )  ; 
	}
	
	public void display (int coffeeQty , int teaQty , int donutQty ) {
		
		System.out.println("-------------------------------------------");
		System.out.println("Item            Quantity           Price ");
		System.out.println("-------------------------------------------");
		System.out.println("Coffee            " + coffeeQty + "          " + this.coffeePrice * coffeeQty  + " ");
		System.out.println("Tea               " + teaQty + "          " + this.teaPrice * teaQty + " ");
		System.out.println("Donuts             " + donutQty+ "          " + this.donutPrice *  donutQty + " ");
		System.out.println("-------------------------------------------");
		System.out.println("Subtotal                           " + this.subtotal );
		System.out.println("discount          (%" +this.discount+ ")              " + this.discountedPrice + " ");
		System.out.println("-------------------------------------------");
		System.out.println("Total                              " + this.total + " ");
		System.out.println("-------------------------------------------");
		System.out.println();

		//" + + "
	}
	
	
	public double order (int coffeeQty , int teaQty , int donutQty ) { 
		if ( coffeeQty < this.coffeeTotQty || teaQty < this.coffeeTotQty || donutQty < this.donutTotQty ) {
			
			
			calculateTotal ( coffeeQty ,teaQty , donutQty ) ;
			display(coffeeQty ,teaQty , donutQty ) ; 
	        return getTotal() ;
		}
		else 
			System.out.println("Error:no enough cups and/or donuts");
	    return 0 ;
	}
	

	
}



















