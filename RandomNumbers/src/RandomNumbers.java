import java.security.SecureRandom; // this can't be known by any hacking programs but it is heavier on the system 
import java.util.Random;  // this one is faster but it can be known used some hacking programs but it is less heavy on the system 

public class RandomNumbers {
	
	public static void main ( String [] args ) {
		Random randomNum = new Random () ; 
		SecureRandom randomSNum = new SecureRandom () ;
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			int someInt = 1 + randomNum.nextInt(7);
			System.out.println(someInt);
		}
		
		System.out.println();
		
		for (int i = 0 ; i < 10 ; i ++ ) {
			int someSInt = randomSNum.nextInt(2);
			System.out.println(someSInt);
		}
	}

}
