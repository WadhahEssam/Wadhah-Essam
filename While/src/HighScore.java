import java.util.Scanner ;

public class HighScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		
		int checker = 0;
		double bestScore = 0 ; 
		String bestStudent = ("nothing yet") ;
		double bestestScore = 0 ;
		String bestestStudent = ("nothing yet");
		
		while (checker != numOfStudents){
			
			System.out.print("Enter a student name: ");
			String student1 = input.next();
			
			System.out.print("Enter a student score: ");
			double score1 = input.nextDouble();
			
			System.out.print("Enter a student name: ");
			String student2 = input.next();
			
			System.out.print("Enter a student score: ");
			double score2 = input.nextDouble();
			
			checker = checker + 2 ;
			
			if (score1 > score2) {
				bestScore = score1 ; 
				bestStudent = student1 ;
			}
			else {
				bestScore = score2 ; 
				bestStudent = student2 ;
		    }
			
			if ( ( bestScore > score1) || (bestScore > score2 ) ){
				bestestScore = bestScore ;
				bestestStudent = bestStudent;
			}
			if (( checker == numOfStudents )||(bestestScore > bestScore)){
				   System.out.print("top student is "+ bestestStudent + " and he got " + bestestScore );
			}
			else {
				   System.out.print("top student is "+ bestStudent + " and he got " + bestScore );
			}
			
			
	}
		
		

}
}
