
public class Player {
	
	private String name ; 
	private int age ; 
	protected double salary ; 
	protected Contract[] arrCon ; 
	protected int nbCon ; 
	
	public Player ( String name , int age , int size  ) {
		this.name = name ; 
		this.age = age ; 
		this.arrCon = new Contract [size] ; 
		this.nbCon = 0 ; 
	}
	
	public boolean addContract ( Contract c ) {
		if ( nbCon < arrCon.length ) {
			arrCon[nbCon] = c ; 
			nbCon++;
			return true ; 
		}
		else 
			return false ;
		
	}
	
	public void ComputeSalary () {
		
	}
	
	
	//////////// i am not sure from this method 
	public double averageContractsRevenue () {
		
		int total = 0 ; 
		int c = 0 ; 

		for ( int i = 0 ; i < nbCon ; i++ ) {
			for ( int y = 0 ; y < arrCon[i].nbClause ; y++ ){
				total += arrCon[i].arrClause[y].getRevenue();
				c++;
			}
		}

		if ( c != 0 ) {
			return total / c ;
		}
		
		else return total ; 
	}
	
	public void display () {
		System.out.println("The Player's name is " + name + " his age is " + age + " his salary is " + salary );
	}

}
