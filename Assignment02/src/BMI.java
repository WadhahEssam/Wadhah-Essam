import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble(); 
		
		System.out.print("Enter height in inches: ");
		int heightInInches = input.nextInt();
		
		double weightInKilograms = ( weightInPounds * 0.45359237 ); 
		double heightInMeters = ( heightInInches * 0.0254 ) ;
		double bMI = ( weightInKilograms / ( heightInMeters * heightInMeters ) ) ; 
		
		System.out.print("BMI is " + bMI);

	}

}
