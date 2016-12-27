import java.util.Scanner; 

public class Fuel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble(); 
		
		System.out.print("Enter Kilos per liter: ");
		double kilos = input.nextDouble();
		
		System.out.print("Enter price per liter: ");
		double price = input.nextDouble();
		
		double kilosDistance  = distance / kilos ; 
		double totalPrice = price * kilosDistance ; 
		
		System.out.print("The cost of driving is $" + totalPrice);
		
	}

}
