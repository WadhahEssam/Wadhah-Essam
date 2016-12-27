import java.util.Scanner ;

public class testRecursion {

	public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.print("Enter a number that you want to find the facorial for : " );
		int number = input.nextInt () ;
		System.out.println( "the facorial of number " + number + " is " + factorial ( number ) );
	}
	
	
	
	public static int factorial ( int number ) {
		if ( number == 1  ) {
			return 1 ; 
		}
		else 
			return number * factorial ( number-1 ) ; // so this is the idea of the so called Recursion   ,,,, simply that the method is able to call it self 
	}
	
}
