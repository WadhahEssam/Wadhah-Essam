import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;


public class TruthTaple {
	
	public static int line = 1 ; 
	
	public static void main(String[] args) throws ScriptException {
		
		Scanner input = new Scanner ( System.in ) ; 
		
	    System.out.println(" **************  WRITE THE EQUATION  ************** ");
	    System.out.println(" ************************************************** ");
	    System.out.println(" ************  x = X , y = Y , z = Z  ************* ");
	    System.out.println(" ***********  x' = x , y' = y , z' = z  *********** ");
	    System.out.println(" ************************************************** ");
	    System.out.println(" *************   () <<< are allowed   ************* ");
	    System.out.println(" ************************************************** ");
	    System.out.println(" *************    Ex. (x*Z)+ x*(z+Y)   ************ ");
	    System.out.println(" ************************************************** ");

	   
	    String equation = input.nextLine() ; 
	    
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	    System.out.println(" X | Y | Z |   F(X,Y,Z) ");
	    System.out.println();

	    
	    
	    
	    

	   
	}
	
	public static String toNumbers (String equation) {
		
	    char[] arrEquation = equation.toCharArray();
	    
	    for (int i = 0 ; i < arrEquation.length ; i++ ) {
	    	switch (line) {
	    	
	    	case 1 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '0';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '1';
		    		break;
		    	}
		    	break;
		    	
	    	case 2 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '1';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '0';
		    		break;
		    	}
		    	break;
		    	
	    	case 3 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '0';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '1';
		    		break;
		    	}
		    	break;
	    	
	    	
    	case 4 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;

    	case 5 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '0';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '1';
	    		break;
	    	}
	    	break;
    	case 6 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;
	    	
	    	
	    case 7 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '0';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '1';
	    		break;
	    	}
	    	break;
	    	
	    case 8 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;
	    	
	    	}
	    }
	    
	    StringBuilder equation1 = new StringBuilder ("                                                                                       ") ; 
	   
	    for ( int i = 0 ; i < arrEquation.length ; i++ ) {
	    	equation1.setCharAt(i, arrEquation[i]);
	    }
	    String equation12 = equation1.toString();
	    
	    return equation12 ;
	}
	
	

}
