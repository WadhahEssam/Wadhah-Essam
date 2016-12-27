
public abstract class Role {
	
	private String roleName ; 
	protected int nbOccur ; 
	protected int totalTime ; 
	protected Award[] arrAw ; 
	protected int nbAw ; 

	public Role ( String roleName , int nbOccure , int totalTime  ) {
		this.roleName = roleName ; 
		this.nbOccur = nbOccure ; 
		this.totalTime = totalTime ; 
		this.arrAw = new Award [10];
		this.nbAw = 0 ; 	
	}
	
	public Role ( Role r ) {
		this.roleName = r.roleName ; 
		this.nbOccur = r.nbOccur ;
		this.totalTime = r.totalTime ; 
		this.arrAw = new Award [r.arrAw.length];
		for ( int i = 0 ; i < r.nbAw ; i++ ) {
			this.arrAw[i] = r.arrAw[i] ; 
		}
		this.nbAw = r.nbAw ;
	}
	
	public abstract double calculateCachet () ;
	
	public double calculateTotalRevenue () {
		double totalCash = 0;
		for ( int i = 0 ; i < nbAw ; i++ ) {
			totalCash += arrAw[i].getCash() ;
		}
		return totalCash ;	
	}
	
	/// doooo noooot impelemnt it in your coooode 
	public int getNbOccure () {
		return nbOccur ; 
	}

}
