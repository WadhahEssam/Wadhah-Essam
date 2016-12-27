import java.util.Scanner ; 

public class CourseManger1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number of students : ");
		int numOfStu = input.nextInt() ; 
		
		while ( numOfStu < 1  ) {
			
			System.out.println("Number of students is invalid . enter number of students ");
			numOfStu = input.nextInt(); 
			
		}
		
		double [] scores = new double [numOfStu] ; 
		char [] grades = new char [numOfStu] ; 
		
		
		
		System.out.println("please enter students scores : ");
		
		for ( int i = 0 ; i < numOfStu ; i++ ){
			
		    double score = input.nextDouble() ; 
		    
		    if (score >= 0 && score <= 100 ) {
		    	scores[i] = score ; 
		    }
		    else {
		        System.out.println("the score " + score + " you entered is wrong program will store 0 instead " );
		        scores[i]= 0 ; 
		    }
		}
		
		for ( int x = 0 ; x < numOfStu ; x++ ) {
			grades[x]= scoreToGrade(scores[x]); 
		}
		
		System.out.print("the scores are : ");
		
		for ( int j = 0 ; j < numOfStu ; j++ ) {
			
			System.out.print(" " + scores[j] + "/" + grades[j] );
			
		}
		
		
		
		

	}
	
    public static char scoreToGrade ( double score  ) {
    	
    	char grade = 'F' ; 
    	
    	if ( score  >= 90 ) {
    		grade = 'A' ; 
    	}
    	else if ( score >= 80 ){
    		grade = 'B' ; 
    	}
    	else if ( score >= 70 ){
    		grade = 'C' ; 
    	}
    	else if ( score >= 60 ){
    		grade = 'D' ; 
    	}
    	
    	return grade ; 

    }

	
}




