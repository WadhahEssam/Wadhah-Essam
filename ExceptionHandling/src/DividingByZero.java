import java.util.InputMismatchException; // you should import the mismatch exception but you don't have to import the arithmetic exception because it belongs to java.lang which is already imported 
import java.util.Scanner;

public class DividingByZero {
	
	public static void main ( String [] args ) {
		
		Scanner input = new Scanner ( System.in ) ; 
		
		boolean loop = true ; 

		do {
			
			try {
				System.out.println("please enter the nominator : ");
				int num = input.nextInt() ; 
				
				System.out.println("please enter the nominator : ");
				int den = input.nextInt() ;
				
				int result = quotiont( num , den );
				System.out.println("The result is just simply :" + result);
				loop = false ; 
			}
			catch ( InputMismatchException InputMismatchException ) {
				System.err.println("Exception : " + InputMismatchException );
				input.nextLine() ;      // if you don't do that line the program might explode 
				System.out.println("you have input invalid values , please try again ");
			}
			catch ( ArithmeticException ArithmeticException ) { 
				System.err.printf("%nException :%s%n" , ArithmeticException);
				System.out.println("you can't enter a zero as a denominator , please try again ");
			}

		}
		while (loop) ;
	}
	
	public static int quotiont ( int num , int den ) 
			throws ArithmeticException   // this has no use here because the Arithmetic Exception is an unChecked exception ,,, so it's not required to be in the check or declare process
	{
		return num/den ; 
	}

}
