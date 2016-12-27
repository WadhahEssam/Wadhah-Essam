
public class Book {
	
	private int ISBN ;
	private String author ; 
	private String title ; 
	private String genre ; 
	private String refCode ;
	
	public Book () {

	}

	public Book (int ISBN , String author , String title , String genre ) {
		
		this.ISBN = ISBN ; 
		this.author = author ; 
		this.title = title ; 
		this.genre = genre ; 
		
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRefCode() {
		return refCode;
	}

	public void generateReference () {
		
		String ref = this.author.charAt(0) + "" + this.author.charAt(1) + "-" + this.genre.charAt(0) + "" + this.genre.charAt(1) ; 
		this.refCode = ref.toUpperCase() ; 
		
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
	
	public void printBookInfo () {
		System.out.println("Title: " + this.getTitle());
		System.out.println();
		System.out.println("Author: " + this.getAuthor());
		System.out.println();
		System.out.println("ISBN: " + this.getISBN() + " = Reference Code : " + this.getRefCode());
		System.out.println();
		System.out.println("Genre: " + this.getGenre());
	}
	
	public boolean equals (Book b) {
		
		boolean state ; 
		
		if ( this.ISBN != b.ISBN  ) {
			state = false ; 
		}
		else if ( this.title != b.title ){
			state = false ; 
		}
		else if ( this.genre != b.genre ){
			state = false ; 
		}
		else if ( this.refCode != b.refCode ){
			state = false ; 
		}
		else if ( this.author != b.author ) {
			state = false ; 
		}
		else {
			state = true ; 
		}
		
		return state ; 
		
	}

}
