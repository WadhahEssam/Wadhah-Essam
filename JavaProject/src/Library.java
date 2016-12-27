
public class Library {
	
	public Book [] libraryBooks ;
	private int numOfBooks ;
	public static final int MAX_SIZE = 100; 
	
	public Library () {
		libraryBooks = new Book[MAX_SIZE] ;
		this.numOfBooks = 0 ; 
	}
	
	public boolean addBook ( int ISBN , String author , String title , String genre ) { 
		
		if ( numOfBooks == 0 && /*( ( libraryBooks[numOfBooks].verifyISBN(ISBN) ) ) && */ ( findBook(ISBN) == -1) ) {
			
			libraryBooks[numOfBooks].setISBN(ISBN);
			libraryBooks[numOfBooks].setAuthor(author);
			libraryBooks[numOfBooks].setTitle(title);
			libraryBooks[numOfBooks].setGenre(genre);
			numOfBooks ++ ; 
			return true ; 
		}
	
		else if ( numOfBooks == 0 /* && ( ( libraryBooks[numOfBooks].verifyISBN(ISBN)) )*/ ){
			return false ;
		}
			
		else if (  /*( libraryBooks[numOfBooks].verifyISBN(ISBN) && */ ( findBook (ISBN) != -1 ) )   {
			libraryBooks[numOfBooks].setISBN(ISBN);
			libraryBooks[numOfBooks].setAuthor(author);
			libraryBooks[numOfBooks].setTitle(title);
			libraryBooks[numOfBooks].setGenre(genre);
			libraryBooks[numOfBooks].generateReference();
			numOfBooks ++ ; 
			return true ; 
		}
		
		else {
			return false ; 
		}
	}
	
	public boolean addBook ( Book b ) {
		
		if ( ( numOfBooks == 0 && ( findBook (b) != -1 ) ) || ( libraryBooks[numOfBooks].verifyISBN(b.getISBN() ) && ( findBook (b) != -1 ) ) ) {
			
			libraryBooks[numOfBooks].setISBN(b.getISBN() );
			libraryBooks[numOfBooks].setAuthor(b.getAuthor());
			libraryBooks[numOfBooks].setTitle(b.getTitle());
			libraryBooks[numOfBooks].setGenre(b.getGenre());
			libraryBooks[numOfBooks].generateReference();
			numOfBooks ++ ; 
			return true ; 
		}
		
		else {
			return false ; 
		}
	}
	
	public void deleteBook ( int ISBN ) {
		
		int i =  0 ; 
		
		while ( ISBN != libraryBooks[i].getISBN() || i == numOfBooks ) {
			i++ ; 
		}
		
		libraryBooks[i] = libraryBooks[numOfBooks] ;
		libraryBooks[numOfBooks] = null ; 
		numOfBooks-- ;
		
	}
	
	public int findBook ( int ISBN ) {
		
		int index = 0 ; 
		
		for ( int y = 0 ; y < numOfBooks ; y++ ) {
			if( ISBN == libraryBooks[y].getISBN() ) {
				index = y ; 
			}
		}
		
		if ( index == 0 ) {
			return -1 ; 
		}
		
		else 
			return index ; 
		
	}

	public int findBook ( Book b ) {
		
		int i = 0 ; 
		while ( b.getISBN() != libraryBooks[i].getISBN() || i == ( numOfBooks + 1 ) ) {
			i++ ; 
		}
		
		if ( i == numOfBooks + 1 ) {
			return -1 ; 
		}
		else 
			return i ; 
		
	}
	
	public void printAll () { 
		
		for ( int i = 0  ; i < numOfBooks ; i++ ) {
			
			libraryBooks[i].printBookInfo();
			
		}
		
	}

	public void printGenre ( String genre ) {
		
		for ( int i = 0 ; i < numOfBooks ; i++ ) {
			if  ( libraryBooks[i].getGenre().equalsIgnoreCase(genre) ) {
				libraryBooks[i].printBookInfo();
			}
		}
	}

	public int getNumberOfBooksByAuthor ( String author ) {
		
	    int authorBooks = 0 ; 
		for (int i = 0 ; i < numOfBooks ; i++ ) { 
			if ( libraryBooks[i].getAuthor().equalsIgnoreCase(author) ) {
				authorBooks ++ ; 
			}
		}
		return authorBooks ; 
	}
	
	public int getNumOfBooks () {
	    return this.numOfBooks ; 
	}
	
	public Book[] getLibraryBooks() {
		return libraryBooks ; 
	}
	
	public void setNumOfBooks ( int numOfBooks ) {
		this.numOfBooks = numOfBooks ; 
	}
}
