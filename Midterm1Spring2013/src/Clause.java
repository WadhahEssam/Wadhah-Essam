
public class Clause {
	
	private String name ; 
	private double revenue ;
	
	
	public Clause(String name, double revenue) {
		this.name = name;
		this.revenue = revenue;
	}
	
	public Clause(Clause c) {
		this.name = c.name ; 
		this.revenue = c.revenue ; 
	}
	
	public double getRevenue () {
		return revenue ;
	}

}
