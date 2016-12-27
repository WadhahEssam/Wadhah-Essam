
public class PrincipalRole extends Role {
	
	private double basicSalary ;  
	
	
	public PrincipalRole ( String name , int nbOccur , int totalTime , double basicSalary ) {
		super(name , nbOccur , totalTime ) ;
		this.basicSalary = basicSalary ; 
	}
	
	public PrincipalRole ( PrincipalRole p ) {
		super(p);
		this.basicSalary = p.basicSalary ; 
	}
	
	public double calculateCachet () {
		return this.basicSalary + ( super.nbOccur * 2000 ) ; 
	}
	
}
