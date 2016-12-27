
public class Movie {
	
	private String name ; 
	private int year ; 
	private Role[] arrRole ; 
	private int nbRole ; 
	
	
	public Movie (String name , int year , int size ) {
		this.name = name ; 
		this.year = year ;
		this.arrRole = new Role [size] ; 
		this.nbRole = 0 ;
	}
	
	////////
	public boolean addRole ( Role r ) {
		if ( nbRole < arrRole.length ) {
			if ( r instanceof PrincipalRole	) {
				this.arrRole[nbRole] = new PrincipalRole ( (PrincipalRole) r ) ; 
				nbRole++;
				return true; 
			}
			else {
				this.arrRole[nbRole] = new SecondaryRole ( (SecondaryRole) r ) ;
				nbRole++;
				return true;
			}
		}
		else 
			return false ; 
	}
	
	
	//////////
	public int countPrincipalRoles ( int nbOccur ) {
		int c = 0 ;
		
		for ( int i = 0 ; i < nbRole ; i++ ) {
			if ( this.arrRole[i] instanceof PrincipalRole && this.arrRole[i].getNbOccure() > nbOccur ) {
				c++ ;
			}
		}
		return c ; 
	}
	
	////////////
	public double getTotalCachetOfSecondaryRoles ( double hourlyRate ) {
		double totalCachet = 0 ; 
		for ( int i = 0 ; i < nbRole ; i++ ) {
			if ( this.arrRole[i] instanceof SecondaryRole ) {
				SecondaryRole s = (SecondaryRole) arrRole[i] ;
				if (s.getHourlyRate() == hourlyRate) {
					totalCachet += s.calculateCachet() ; 
				}
			}
		}		
		return totalCachet ; 
	}
	
	
	public Role[] getyPrincipalRoles () {
		
		Role[] arrRole = new Role [nbRole] ; 
		int c = 0 ; 
		
		for ( int i = 0 ; i < this.nbRole ; i++ ) {
			if ( this.arrRole[i] instanceof PrincipalRole && this.arrRole[i].calculateTotalRevenue() > this.arrRole[i].calculateCachet() ) {
					arrRole[c] = arrRole[i] ;
					c++;
			}
		}
		return arrRole ; 
	}
	
	public void splitAndSave ( Role[] pr , Role[] sr , double c ) {
		
		int x = 0 ; 
		int y = 0 ;
		
		
		for ( int i = 0 ; i < this.nbRole ; i++ ) {
			if ( this.arrRole[i] instanceof PrincipalRole && this.arrRole[i].calculateCachet()>c && x < pr.length) {
				pr[x] = arrRole[i]; 
				x++;
			}
			else if ( this.arrRole[i] instanceof SecondaryRole && this.arrRole[i].calculateCachet() > c && y > sr.length) {
				sr[y] = arrRole[i] ; 
				y++;
			}
		}
	}
	

	
	
	
	

}
