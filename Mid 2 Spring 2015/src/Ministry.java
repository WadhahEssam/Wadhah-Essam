
public abstract class Ministry implements Finance {
	private String name ; 
	protected int nbEmployee ; 
	
	public Ministry ( String name , int nbEmp ) {
		this.name = name ; 
		this.nbEmployee = nbEmp ; 
	}
	
	public Ministry ( Ministry m ) {
		this.name = m.name ; 
		this.nbEmployee = m.nbEmployee ; 
	}

	public String getName() {
		return name;
	}

	public int getNbEmployee() {
		return nbEmployee;
	}
	
	public void display () {
		System.out.println("Name : " + this.name + " Number Of Employee : " + this.nbEmployee ); 
	}
}
