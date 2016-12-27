
public class TvChannel {
	
	private String name;
	private boolean live ; 
	private int frequency ; 
	private TvProgram[] arrP ; 
	private int nbP ; 
	
	public TvChannel ( String name , boolean live ,int frequency ) {
		this.name = name ;
		this.live = live ; 
		this.frequency = frequency  ;
		this.arrP = new TvProgram[25];
		this.nbP = 0 ;
	}
	
	public TvChannel ( TvChannel t ) {
		this.name = t.name ; 
		this.live = t.live ; 
		this.frequency = t.frequency ;
		this.arrP = new TvProgram [t.arrP.length];
		for ( int i = 0 ; i < t.nbP ; i ++ ) {
			this.arrP[i] = t.arrP[i] ; 
		}
		this.nbP = t.nbP ;
	}
	
	public boolean addProgram ( TvProgram p ) {
		if ( nbP < arrP.length ) {
			this.arrP[nbP] = p ; 
			nbP++;
			return true ;
		}
		else
			return false ;
	}
	
}
