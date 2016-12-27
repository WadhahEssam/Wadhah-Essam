import java.util.Scanner ; 

public class Unique {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		System.out.println("enter how many numbers you want to input : ");
		int numInput = input.nextInt()  ; 
		
		int [] nums = new int [numInput] ; 
		
		int i = 0 ;
		
		
		while (i != numInput){
			
			System.out.println("Enter number: ");
			
			int num = input.nextInt() ; 
			
			
			boolean unique = true ; 
			
			int j = 0 ; 
			while ( j != numInput ) {
		         if ( num == nums[j] ){
		        	 unique = false ; 
		         }
		         j++;
			}
				
				
			if ( num >= 10 && unique && num <= 100 ) { 
				nums[i] = num ; 
				i++ ; 
			}
			
			else if (!unique ) {
				System.out.println("number has already been entered.");
			}
			
			else if (num > 100 || num < 10 ) { 
				System.out.println("number must be between 10 and 100");
			}
			
			for (int x = 0 ; x < numInput ; x++ ) {
				if ( nums[x] != 0 ) {
					System.out.println(nums[x]);
				}
			}
			System.out.println();
			
			
				
			
		}
		

	}

}
