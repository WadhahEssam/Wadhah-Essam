
public class Government {
	
	private String name ; 
	private Ministry[] arrMin ; 
	private int nbMin ; 
	
	public Government ( String name , int size ) {
		this.name = name ; 
		this.arrMin = new Ministry [size] ; 
		this.nbMin = 0 ; 
	}
	
	public void addMinistry ( Ministry m ) {
		if (nbMin < arrMin.length ) {
			if ( m instanceof Executive ) 
				this.arrMin[nbMin] = new Executive ( (Executive) m ) ; 
			else if ( m instanceof Other ) 
				this.arrMin[nbMin] = new Other ( ( Other ) m ) ; 
			else 
				this.arrMin[nbMin] = new Administrative  ( ( Administrative ) m  ) ; 
			
		}
	}
	
	public double averageBudget () { 
		if ( this.nbMin == 0 ) 
			return 0.0 ; 
		
		double totalBudget = 0.0 ; 
		
		for ( int i = 0 ; i<nbMin ; i++ ) {
			totalBudget += this.arrMin[i].calculateBudget() ; 
		}
		return totalBudget / nbMin ; 
	}
	
	public int countExecutive ( double e ) { 
		int numOfEx = 0 ; 
		
		for ( int i = 0 ; i < nbMin ; i++ ) {
			if ( this.arrMin[i] instanceof Executive ) {
				Executive ex = new Executive ((Executive ) this.arrMin[i]);
				if (ex.getExpenses() > e ) {
					numOfEx++ ; 
				}
			}
		}
		return numOfEx ; 
	}
	
	public int getExecutives ( double e , Executive[] ae) {
		int numOfEx = 0 ; 
		
		for ( int i = 0 ; i < nbMin ; i++ ) {
			if ( this.arrMin[i] instanceof Executive ) {
				Executive ex = (Executive) this.arrMin[i] ; 
				if (ex.getExpenses() > e && ex.calculateBudget() > this.averageBudget() ) 
					ae[numOfEx++] = ex ; 
			}
		}
		return numOfEx ; 
		
	}
	
}
