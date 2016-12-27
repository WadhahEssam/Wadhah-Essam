import java.util.Scanner ; 

public class TestBook {
	
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in); 
		Book b1 = new Book () ; 
		
		System.out.println("Please, enter the book details #ISBN, author, title, and genre.");
		b1.ISBN = input.nextInt(); 
		b1.author = input.next();
		b1.title = input.next();
		b1.genre = input.next();
		
		if (b1.verifyISBN(b1.ISBN) == false) 
			System.out.print("Invalid ISBN") ;
		
		else  {
	        System.out.println(b1.toString()) ; 
	        System.out.println();
		    System.out.print("The book reference is:" + b1.generateReference() ) ; 
		}
		
		

		
	}

}
