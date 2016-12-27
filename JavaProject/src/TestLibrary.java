import java.util.Scanner ; 

public class TestLibrary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner  (System.in)  ; 
		Library l1 = new Library () ;
		
		for ( int i = 0 ; i < l1.MAX_SIZE ; i ++ ) {
			l1.libraryBooks [i] = new Book () ;
		}
		
		int i = 0 ; 
		
		
		do 
		{
		System.out.println("**********************************************************************");
		System.out.println("*                        Welcome to KSU Library :)");
		System.out.println("*                        ---------------------------");
		System.out.println("*       Please enter one of the following options:");
		System.out.println("*       1) Add a book");
		System.out.println("*       2) Delete a book");
		System.out.println("*       3) Find a book");
		System.out.println("*       4) List all books");
		System.out.println("*       5) List books for a given genre");
		System.out.println("*       6) Number of books for a given author");
		System.out.println("*       7) Total number of books");
		System.out.println("*       8) Exit");
		System.out.println("*");
		System.out.println("**********************************************************************");
		System.out.println("Enter your option :> ");
		i = input.nextInt() ; 
		
		switch ( i ) {
		
		case 1 : 
			System.out.println("Please, enter the book details #ISBN, author, title, and genre.");
			
			int ISBN = input.nextInt() ; 
			String author = input.next()  ; 
			String title = input.next() ; 
			String genre = input.next() ; 
			
			if ( l1.addBook(ISBN, author, title, genre) == true )  {
				System.out.println("The book has been added.");
			}
			else {
				System.out.println("ISBN has been added before ");
			}
			break ;
		case 2 :
			System.out.println("Enter the ISBN of the Book ");
			int ISBN2 = input.nextInt() ; 
			l1.deleteBook(ISBN2);
			break ;
		   
		case 4 :
			l1.printAll();
			break ; 
			
		case 8 :
			System.out.println("Thanks. Goodbye! ");
		    break;
			
		}
		}
		
		while  ( i != 8 ) ; 
		
        
	}

}
