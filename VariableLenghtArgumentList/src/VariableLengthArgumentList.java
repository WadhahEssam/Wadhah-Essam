
public class VariableLengthArgumentList {

	public static void main(String[] args) {

		double a = 1 , b = 3 , c = 4 , d = 5 ; 
		
		
		System.out.println("the average of the numbers are " + countAvg(a,b,c,d));
	}
	
	
	//this method is receiving a variable length argument list // so the number of arguments is not known < so the user can input as much arguments as he wants ( should be the same type of arguments ) 
    // the method is going to deal with all the arguments as an array 
	
	public static double countAvg ( double... numbers ) { 
		
		double total = 0 ; 
		for ( double number : numbers ) {
			total += number ; 
		}
		
		return total / numbers.length ; 
		
	}

}
