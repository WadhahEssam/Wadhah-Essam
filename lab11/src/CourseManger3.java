import java.util.Scanner ; 

public class CourseManger3 {
	
	private double [] scores ;
	private  char [] grades ; 
	
	
	
	
	public void readScore () {
		Scanner input = new Scanner ( System.in ) ;
		System.out.println("Emter number of students : ");
		
		int j = input.nextInt() ;
		
		while ( j < 1 ) {
		     
		   System.out.println("number of students is invalid , enter number of students:  ");
		   j = input.nextInt() ;
		}
		
		scores = new double [j];
		grades = new char [j];
		
		System.out.println("plese enter students scores : ");
		
		for ( int i = 0 ; i < scores.length ; i++ ) {
			
			scores[i] = input.nextDouble() ; 
			if ( scores[i] < 0 || scores[i] > 100 ) {
				scores[i] = 0 ; 
				System.out.println("the score " + scores[i] + " you entered is wrong program will store 0 instead " );
			}
			
			
		}
		
	}

    public void scoreToGrade () {
    	

    	for ( int y = 0 ; y < scores.length ; y++ ) {
    	
    	if ( scores[y]  >= 90 ) {
    		grades[y] = 'A' ; 
    	}
    	else if ( scores[y] >= 80 ){
    		grades[y] = 'B' ; 
    	}
    	else if ( scores[y] >= 70 ){
    		grades[y] = 'C' ; 
    	}
    	else if ( scores[y] >= 60 ){
    		grades[y] = 'D' ; 
    	}
    	else {
    		grades[y] = 'F' ; 
    	}
    	
    	}
    }
    
    public void printGrades () { 
    	

		System.out.print("the scores are : ");
		
		for ( int j = 0 ; j < scores.length ; j++ ) {
			
			System.out.print(" " + scores[j] + "/" + grades[j] );
			
		}
    	
    }

}
