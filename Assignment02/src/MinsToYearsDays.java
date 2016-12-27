import java.util.Scanner ;

public class MinsToYearsDays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		 
		double years = (double) minutes / ( 60 * 24 * 365 ) ;
		double daysLeft = (years - (int) years ) * 365  ;
		
		System.out.print( minutes + " minutes is approximately " + (int) years + " years and " + (int) daysLeft + " days" );

	}

}
