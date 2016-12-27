
public class Paper {
	
	private String title ; 
	private int nbWords ;
	private Author arrAuthor[] ;
	private int nbAuthor; 
	
	public Paper ( String title , int nbWords ){
		this.title = title ;
		this.nbWords= nbWords ;
		this.arrAuthor = new Author[5];
		this.nbAuthor = 0 ; 
	}
	
	public Paper ( Paper p ) {
		this.title = p.title ;
		this.nbWords = p.nbWords;
		this.arrAuthor = new Author [ p.arrAuthor.length ];
		this.nbAuthor = p.nbAuthor;
		
		for ( int i = 0 ; i < p.arrAuthor.length ; i++ ) {
			this.addAuthor(p.arrAuthor[i]);
		}
	}
	
	public boolean addAuthor ( Author a ) {
		if ( nbAuthor < arrAuthor.length ) {
			arrAuthor[nbAuthor] = a ;
			nbAuthor++;
			return true ;
		}
		else 
			return false ;
	}
	
	
	

}
