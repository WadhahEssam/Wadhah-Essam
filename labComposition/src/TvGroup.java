
public class TvGroup {
	
	private String name ; 
	private TvChannel[] arrC ; 
	private int nbC;
	
	
	public TvGroup ( String name , int size ) {
		this.name = name ; 
		this.arrC = new TvChannel [size] ;
		this.nbC = 0 ; 
	}
	
	public boolean addChannel ( TvChannel t )  {
		if ( nbC < arrC.length ) {
			arrC[nbC] = new TvChannel (t) ; 
			nbC++; 
			return true ; 
		}
		else 
			return false;  
	}

}
