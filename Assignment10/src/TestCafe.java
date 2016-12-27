import java.util.Scanner ; 

public class TestCafe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ; 
		Cafe c1 = new Cafe () ; 
		
		c1.setCoffeePrice(5.5);
		c1.setTeaPrice(3.5);
		c1.setDonutPrice(2.25);
		c1.setCoffeeTotQty(100);
		c1.setTeaTotQty(100);
		c1.setDonutTotQty(50);
		c1.setDiscount(10);
		
		int Coffee = 0 , Tea = 0 , Donuts = 0 ;
		int c = 0 ; 
		double totalSales = 0 ;
		while ( c != 2 )  { 
			
			
			 System.out.println("**********************************************************************");
			 System.out.println("*                        Welcome to Cafe :)                          *");
			 System.out.println("*                        ---------------------------                 *");
			 System.out.println("*       Please enter one of the following options:                   *");
			 System.out.println("*       1) order  ==> this allows you to order a drink               *");
			 System.out.println("*       2) quit ==> to end this program                              *");
			 System.out.println("*                                                                    *");
			 System.out.println("**********************************************************************");
			 System.out.println("Enter your option :> ");
			 c = input.nextInt() ; 
			 
			 if (c == 1 ) {
				 System.out.println("Please, enter order (#cups of coffee, #cups of tea and #donuts: ");
			     Coffee = input.nextInt() ; 
				 Tea = input.nextInt(); 
				 Donuts = input.nextInt() ;
				 
				 c1.order( Coffee , Tea , Donuts );
				 
				 totalSales = c1.getTotal() + totalSales ;
				 
			 }
			 else if (c == 2 ) {
				 System.out.println("Total sales = " + totalSales );
				 System.out.println("Thanks. Goodbye! ");
			 }
			
		}
		

	}

}
