

import java.util.Scanner ; 


public class Pyramid {
	
	public static void main (String []args ){
		
		Scanner input = new Scanner (System.in) ; 
		
		System.out.print("Enter the number of lines: ");
		
		int NOL = input.nextInt()  ;
		
		
		int counter2 = 0 ;
		int checker = 1 ; 
		 
		
		while ( counter2 != NOL ){
	    int num = NOL ;
	    int counter = 0 ;
	    
	    
		while (  counter != ( NOL + NOL + 1 ) ) {
			
			if ( num > checker 	){
				System.out.print("   ");
			}
			else if ( Math.abs(num) == checker ) {
				System.out.print("  " + Math.abs(num) );
			}
			else if ( Math.abs(num) < ( checker )  ){
				System.out.print("  " + Math.abs(num)   );
			}
			
			if (num == 1){
				num = -1 ; 
			}
			num-- ; 
			counter++ ;
			
			
		}
		
	    System.out.println(""); 
		 counter2++ ; 
		 checker++ ; 
		 
	}
	}
}
