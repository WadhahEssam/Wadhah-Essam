
public class Book {
	
	public int ISBN ; 
	public String author ; 
	public String title ; 
	public String genre ; 
	
	public String generateReference () {
		
		char ach1 = this.author.charAt(0);
		char ach2 = this.author.charAt(1);
		char gch1 = this.genre.charAt(0);
		char gch2 = this.genre.charAt(1);
		
		String ref  = (""+ ach1 + ""+ ach2 + "-"  + gch1 + gch2 );
		
		
		return ref ;
		
	}
	
	public boolean verifyISBN (int ISBN) {
		
		
		int d1 = ISBN / 1000 ;
		int d2 = ISBN % 1000 / 100 ; 
		int d3 = ISBN % 100 / 10 ; 
		int d4 = ISBN % 10 ; 
		
		int control = ( d1*3 + d2*2 + d3*1 ) % 4 ;
        
        if (  (d4 == control) ) {
            return true ; 
        }
        else 
        	return false ;
        
	}
	
	public String toString () {
		return ("Title: " + this.title + "\n\nAuthor: " + author + "\n\nISBN: " + ISBN + " - Reference Code: " + this.generateReference() + "\n\nGenre: " + this.genre ); 
	}
	

}
