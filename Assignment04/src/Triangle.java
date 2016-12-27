import java.util.Scanner ; 

public class Triangle {
    
    public static void main (String []args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print ( "Enter three edges(lengh in double):");
        
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble ();
        double thirdNum = input.nextDouble();
        
        double perimeter = firstNum + secondNum + thirdNum ; 
        
        
        if ( ( ( firstNum + secondNum ) < thirdNum ) || ( (secondNum + thirdNum ) < firstNum ) || ( ( thirdNum + firstNum ) < secondNum)) { 
            System.out.print("Input is invalid");
        }
        else {
        System.out.print("The perimeter is " + perimeter ) ;
        }

}
}