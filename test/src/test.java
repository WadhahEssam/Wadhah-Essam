import java.util.Scanner ; 

public class test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of miutes: ");
		int minutes = input.nextInt();
		
		int years = minutes / (  60 * 24 * 365 ) ;
		int minutesLeft = minutes % (  60 * 24 * 365 )  ;
		
		
		int daysLeft = minutesLeft / ( 24 * 60 ); 
		
		System.out.print ( minutes + " minutes is approximately " + years + " years and " + daysLeft + " days" ); 
	}

}
