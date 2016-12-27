
public class ProductTest {
	
	public static void main ( String [] args ) {
		Edible e1 = new Edible(1, "Bakery", 120.5, "Cake");
		Edible e2 = new Edible(2, "Soft Drinks", 2.5, "Drinks");
		Wearable w1 = new Wearable(1, "Men", 40, "Medium", false); 
		Wearable w2 = new Wearable(2, "Kids", 23, "2 Months", true); 
		
		
		Product[] products = new Product [4] ; 
		products[0] = e1 ;
		products[1] = e2 ; 
		products[2] = w1 ; 
		products[3] = w2 ; 
		
		for ( int i = 0 ; i < products.length ; i++ ) {
			Result(products[i]);
		}
		
		for ( int i = 0 ; i < products.length ; i++ ) {
			System.out.println(products[i].toString());
		}
		
	}
	
	public static void Result ( Product p ) {
		if ( p instanceof Edible ) {
			System.out.println("YUMMY");
		}
		else if ( p instanceof Wearable ){
			System.out.println("COOL");
		}
	}

}
