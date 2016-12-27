import java.util.Scanner ; 


public class Student {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int option = -1 ;
		
        while ( option != 0 ) {
        	
    		System.out.println("Enter 1 if you want to get grade of one student ");
    		System.out.println("Enter 2 if you want to get the grades for many students ");
    		option = input.nextInt();
    		
    		if ( option == 1 ) {
    			System.out.println("Enter the grade of the student "); 
    			int gradeOfStudent  = input.nextInt() ;
    			System.out.println(Grade(gradeOfStudent));
    		}
    		
    		else if (option == 2 ) {
        		System.out.println("How many students entered the course ?"); 
        		int numOfStudents = input.nextInt();
        		
        		
        		int marks[] = new int [numOfStudents];
        		for ( int i =  0 ; i < marks.length ; i++ ) {
        			System.out.println("Enter the mark for student number " + (i+1)   ); 
        			marks[i] = input.nextInt();
        		}
        		
        		String grades [] = Grades(marks);
        		for (int i = 0 ; i < grades.length ; i++ ) {
                    System.out.println("The grade for Student num " + i + " is   " + grades[i]);
        		}
        		
    			System.out.println("The percentage of the students who passed is " + PercentagePassed(marks) );
        		
    		}
    		else if ( option == 0 ) {
    			option = -1 ; 
    		}
    		else {
    			System.out.println("please enter a valid value " );
    		}
    		System.out.println();
    		System.out.println("=====================================");
    		System.out.println();	
        }

		
		
	}
	
	
	private static String Grade ( double mark ){
		if ( mark > 50 ) {
			return "P";
		}
		
		else 
			return "F";
		}
	
	private static String[] Grades ( int[] marks){
		
		String grades [] = new String [marks.length];	
		
		for ( int i = 0 ; i < marks.length ; i++ ) {
			grades[i] = Grade(marks[i]);
		}
		return grades ;	
	}
	
	private static Double PercentagePassed ( int[] marks){
		double numOfStudentPassed = 0 ; 
		
		String grades [] = new String [marks.length];	
		
		for ( int i = 0 ; i < marks.length ; i++ ) {
			if ( Grade(marks[i]) == "P" ) {
				numOfStudentPassed++ ;
			}
			
		}
		
		return (numOfStudentPassed * 100 ) / marks.length ;	
	}
	
	
	

}
