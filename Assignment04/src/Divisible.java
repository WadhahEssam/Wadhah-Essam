import java.util.Scanner ;


public class Divisible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		
		int integer = input.nextInt();
		
		//start of the new test
		


		if (( integer % 5 ) == ( 0 ) ) {
			
			if ( ( integer  % 6 ) == 0 ) {
				System.out.println("Is " + integer + " divisible by 5 and 6? true" );
				System.out.println("Is " + integer + " divisible by 5 or 6? true" );
				System.out.println("Is " + integer + " divisible by 5 or 6, but not both? false" );
			}
			else {
				System.out.println("Is " + integer + " divisible by 5 and 6? false" );
				System.out.println("Is " + integer + " divisible by 5 or 6? true" );
				System.out.println("Is " + integer + " divisible by 5 or 6, but not both? true" );
			}
		}
		
		else {
			if ( ( integer  % 6 ) == 0 ) {
				System.out.println("Is " + integer + " divisible by 5 and 6? false" );
				System.out.println("Is " + integer + " divisible by 5 or 6? true" );
				System.out.println("Is " + integer + " divisible by 5 or 6, but not both? true" );
			}
			else {
				System.out.println("Is " + integer + " divisible by 5 and 6? false" );
				System.out.println("Is " + integer + " divisible by 5 or 6? false" );
				System.out.println("Is " + integer + " divisible by 5 or 6, but not both? false" );
			}
		}


	}

}
