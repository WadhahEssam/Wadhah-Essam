
public class FootBallPlayer extends Player {
	
	private int numOfGoals ; 
	private String position ; 
	
	FootBallPlayer ( String name , int age , int size , int nbOfGoals , String position ) {
		super ( name , age , size ) ; 
		this.numOfGoals = nbOfGoals ; 
		this.position = position ; 
	}
	
	public void computeSalary () { 
		super.salary = 20000 + numOfGoals * 1000 ;
	}
	
	public void display ()  { 
	super.display();
	System.out.println("and he scored " + numOfGoals + ( (numOfGoals > 1) ? "Goal" : "Goals" ) + " and his position is " + this.position );
	}
	

}
