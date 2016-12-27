
public class Consultant extends Employee {
	
	private int hoursPerWeek ;
	
	public Consultant ( String name , int rank , int yearsOfExperince , int hoursPerWeek ) {
		super (name , rank , yearsOfExperince ) ; 
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public Consultant ( Consultant c ) {
		super ( c ) ;
		this.hoursPerWeek = c.hoursPerWeek ; 
	}
	
	public void display () {
		super.display(); 
	    System.out.println(" His hours per Week " + this.hoursPerWeek );
	}
	
	public double calculateSalary () {
		return this.hoursPerWeek * 1000 + super.getRank() * 500 ;
	}

}
