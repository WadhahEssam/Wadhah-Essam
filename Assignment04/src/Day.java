import java.util.Scanner ; 
import java.lang.System;

public class Day {
    public static void main ( String []args){
    
    Scanner input  = new Scanner (System.in );
    
    System.out.print("Enter year: (e.g., 2012): ");
    int year = input.nextInt(); 
    
    System.out.print("Enter month: 1-12: ");
    int month = input.nextInt();
    
    System.out.print("Enter the day of the month: 1-31: ");
    int day = input.nextInt();
    
    int m = month ; 
    
    switch (m) {
    case 1 : 
    	m = 13 ;
    	year = year - 1 ;
    	break ; 
    case 2 :
    	m = 14 ;
    	year = year - 1 ; 
    	break ;
    }
    
    int q = day ;
    int j = year / 100 ; 
    int k = year % 100 ; 
    
    int h ; // the day of the year from 7 to 1
    
    h =    ( q + ((26 * ( m + 1 ) / 10) + k + ( k / 4 ) + ( j/ 4 ) + ( 5 * j ) ) ) % 7 ;
    
    String dayW = "nothing" ; 
    
    switch (h){
    
    case 0 :
    	dayW = ("Saturday"); 
        break;
    case 1 :
    	dayW = ("Sunday");
        break; 
    case 2 :
    	dayW = ("Monday");
        break;
    case 3 :
    	dayW = ("Tuesday");
        break;
    case 4 :
    	dayW = ("Wednesday");
        break; 
    case 5 :
    	dayW = ("Thursday");
        break; 
    case 6 : 
    	dayW = ("Friday");
        break;
    
    }
    
    
    
    System.out.print("Day og the week is " + dayW ) ;
    
    
   }        
}
