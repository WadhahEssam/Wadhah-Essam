
public class Recursion {
	
	public static void main ( String [] args ) {
		sumOfNumbers(5);
		
	}
	
	
	private static int sumOfNumbers(int n) {
		System.out.println(n);
		return sumOfNumbers(n-1);
	}

}
