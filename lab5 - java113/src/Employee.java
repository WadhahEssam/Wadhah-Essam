
public class Employee {
	
	private String name;  
	private int rank ; 
	private int yearsOfExperince ; 
	
	public Employee ( String name , int rank , int yearsOfExperince ) { 
		this.name = name ;
		this.rank = rank ;
		this.yearsOfExperince = yearsOfExperince ; 
	}
	
	public Employee ( Employee e ) {
		this.name = e.name;
		this.rank = e.rank ; 
		this.yearsOfExperince = e.yearsOfExperince ; 
	}
	
	public int getRank () { 
		return this.rank ; 
	}
	
	public int getYearsOfExperince () {
		return this.yearsOfExperince ; 
	}
	
	public void display () {
		System.out.println("His name is " + this.name + " His rank " + this.rank + " He Worked for " + this.yearsOfExperince );
	}
	
	public double calculateSalary () {
		return this.yearsOfExperince * 500 + this.rank * 1000 ;
	}

}
