package breakAndContinue;

public class BreakAndConinue {

	public static void main(String[] args) {

		
		for ( int i = 0 ; i < 10 ; i++ ) {
			if ( i == 4 ) {
				continue ;
			}
			
			if ( i == 7) {
				break;
			}
			System.out.println(i);
		}
		
		int numOfGoals = 1 ; 
		
		System.out.println("the player scored " + numOfGoals + ((numOfGoals <= 1) ? " goal" : " goals"));
		
		
	}

}
