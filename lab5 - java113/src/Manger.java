
public class Manger extends Employee {
	
	private int nbEmps ;
	
	public Manger ( String name , int rank , int yearsOfExperince , int nbEmps ) {
		super ( name , rank , yearsOfExperince );
		this.nbEmps = nbEmps ; 
	}
	
	public Manger ( Manger m ) {
		super (m) ;
		this.nbEmps = m.nbEmps ; 
	}
	
	public void display () {
		super.display();
		System.out.println(" The number of employee he is managing ");
	}
	
	public double calculateSalary () {
		return super.getYearsOfExperince() * 500 + super.getRank() * 1500 + this.nbEmps * 10 ; 
	}
	
	public int getNbEmps () {
		return this.nbEmps ;
	}
	
	

}
