import java.util.Scanner ; 


public class Digits {
	
	public static void main (String []args ){
		
		Scanner input = new Scanner (System.in); 
		
		int num = 0 ; 
		
		while ( num != -1 )  { 
				
			
			System.out.print("Enter a number (-1 to end): ");
		     num = input.nextInt() ;
			
			int numOfDigits = (int) ( Math.log10(num) + 1 ) ; 
			
			int digits = numOfDigits ; 
			int cNew = 0 ;
			
		    int counter = 1 ;
	    
		while ( ( counter-1 ) != numOfDigits 	){
			
			
			
			
			int c  = (int)  Math.pow ( 10, counter ) ;
			int digit = num % c ; 
			
			if (counter == 1) {
				
			}
			else {
				cNew = c / 10 ;
				digit = digit / cNew ;
			}
			
			
			
			
			System.out.println("Digit" + counter + " = " + digit );
			
		    num  = num - ( digit )  ;
			
			digits-- ; 
			counter++ ; 
			
		}
		
		}
		 
	}
	}

