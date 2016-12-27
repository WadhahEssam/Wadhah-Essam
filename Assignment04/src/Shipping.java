import java.util.Scanner ; 

public class Shipping {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print( "Enter package weight: " ); 
		double weight = input.nextDouble() ; 
		double cost = 0 ; 
		
		if ( (weight > 0 ) && (weight <= 1) ) {
			cost = 3.5 ; 
		}
		else {
			if ( ( weight > 1 ) && ( weight <= 3 ) ) {
				cost = 5.5 ; 
			}
			else {
				if ( ( weight > 3) && ( weight <= 10 ) ) {
					cost = 8.5 ;
				}
				else {
					if ( ( weight > 10) && ( weight <= 20 ) ){
						cost = 10.5 ; 
					}
				}
			}
		}
		if (weight > 20 ) {
			System.out.print ("the package cannot be shipped.");
		}
		System.out.print("The shipping cost is $" + cost );


	}

}