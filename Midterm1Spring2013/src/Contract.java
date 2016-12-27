
public class Contract {
	
	private int id ;
	private String date ;
	private String companyName ;
	public Clause[] arrClause ; 
	public int nbClause ; 
	
	public Contract ( int id , String date , String companyName ) {
		this.id = id ;
		this.date = date ; 
		this.companyName = companyName ; 
		this.arrClause = new Clause [20];
		this.nbClause = 0 ; 
	}
	
	public double computerContractRevenue () {
		
		double totalRevenue = 0  ; 
		for (int i = 0 ; i < nbClause ; i++ ) {
			totalRevenue += arrClause[i].getRevenue();	
		}
		return totalRevenue ; 
	}
	
	public boolean addClause (Clause c) {
		if ( nbClause < arrClause.length ) {
			arrClause[nbClause] = new Clause (c);
			nbClause++ ; 
			return true ; 
		}
		else 
			return false ; 
	}

	public Clause[] getClauses ( double r ) {
		
	    Clause[] arrClause = new Clause [20] ;
	    int c  = 0  ;
	    
		for ( int i = 0 ; i < nbClause ; i++ ) {
			if ( this.arrClause[i].getRevenue()  == r ) {
				arrClause[c] = this.arrClause[i];
			}
		}
		return arrClause ; 
	}
	
	public Clause getSmallestRevenue () {
		Clause smallest = arrClause[0]; 
		for ( int i = 1 ; i < nbClause ; i++ ) {
			if ( arrClause[i].getRevenue() < smallest.getRevenue() ) {
				smallest = this.arrClause[i];
			}
		}
		return smallest ;
	}
}
