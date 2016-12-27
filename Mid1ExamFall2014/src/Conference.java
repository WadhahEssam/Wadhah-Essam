
public class Conference {
	
   
	private String name ;
	private String location ;
	private Paper arrPap[] ; 
	private int nbPap ;
	
	public Conference ( String name , String location , int size ) {
		this.name = name ;
		this.location = location ;
		this.arrPap = new Paper [size] ;
		this.nbPap = 0 ; 
	}
	
	public boolean addPaper ( Paper p ) {
		if ( nbPap < arrPap.length ) {
			arrPap[nbPap] = p ;
			nbPap++;
			return true; 
		}
		else 
			return false;
	}

}
