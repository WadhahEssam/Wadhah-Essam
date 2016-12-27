import java.util.Scanner;  

public class Simple {
	
	public static void main (String [] args ) {
		
		Scanner input = new Scanner (System.in ) ; 
		
		
	    int a = 1 , b = 2 ; 
	    System.out.println(a);
		
		int n = 0 ; 
		System.out.println("how many numbers you want to put inside this fucken program : ");
		
		while ( n <= 0 ) {
			
	
		 n = input.nextInt() ; 
		
		
		if ( n <= 0 ){
			System.out.println("NUMBER MUST BE > 0 . ENTER NUMBER OF INTS YOU WANT TO READ AGAIN ");
		}
		
		}
			
		int [] nums = new int [n] ; 
		
		

		System.out.println("enter " + n + " numbers ");
		
		

		int i2 = 0 ;
		for ( int i = 0  ; i < nums.length  ; i++ ) { 
		nums[i] = input.nextInt() ; 
		i2++ ; 
		}
		
		int y = n-1 ; 
		
		int [] nums2 = new int [n] ;
		for ( int x = 0 ; x < nums2.length ; x++ ) { 
			nums2[x]=nums[y] ;
			y--;
			
		}
		
		
		
		/*
		 *
		 * 
		int y = n -1 ; 
		for ( int x = 0 ; x < i2  ; x++ ) {
			nums[x] = nums[y] ; 
			y--; 
		}
		nums[0] = 6 ; 
		
		if ( n >= 4 ) {
			nums[4] = 5 ; 
		}
		
		if ( n > 5 ) {
			nums[5] = 6 ; 
		}
		
		nums[n-1] = 100 ; 
		
		if (n >= 2 ) { 
			nums[n-2] = 50 ; 
		}
		
		System.out.println("enter a number i ( > 0 )");
		
		
		int i = input.nextInt() ; 
		if ( i > 0 && i < (  n/2 ) ) {
		 i = ( i * 2 ) ; 
		nums[i] = 4; 
		}
		
		*/
		
		
		
		System.out.print("the numbers are : ");
	    for ( int j = 0 ; j < i2 ; j++ ) {
	    	
	    	System.out.print(" " + nums[j] );
	    	 
	    }
	    System.out.println();

		System.out.print("the reversed numbers are : ");
	    for ( int j = 0 ; j < i2 ; j++ ) {
	    	
	    	System.out.print(" " + nums2[j] );
	    	 
	    }
	    
	    

		
		
	}

}
