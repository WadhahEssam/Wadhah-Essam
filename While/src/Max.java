import java.util.Scanner; 

public class Max {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		
		System.out.print("Enter a student name: ");
		String student1  = input.next();
		
		System.out.print("Enter a student score: ");
		double score1 = input.nextDouble();
		
		System.out.print("Enter a student name: ");
		String student2  = input.next();
		
		System.out.print("Enter a student score: ");
		double score2 = input.nextDouble();
		
		String bestStudent = "none" ; 
		double bestScore = 0 ; 
		
		if ( score1 > score2 ) {
			bestScore = score1 ;
			bestStudent = student1 ; 
		}
		else if ( score2 > score1 ) {
			bestScore = score2;
			bestStudent = student2 ; 
		}
		
		int counter = 2 ;
		
		while ( counter != numOfStudents ){
			++counter ;
			System.out.print("Enter a student name: ");
			String studentInLoop = input.next();
			
			System.out.print("Enter a student score: ");
			double scoreInLoop = input.nextDouble();
			
			if ( scoreInLoop > bestScore ) {
				bestScore = scoreInLoop ;
			}
			
		}
		
		System.out.print("Top student " + bestStudent + "'s score is " + bestScore );
		
		

	}

}
