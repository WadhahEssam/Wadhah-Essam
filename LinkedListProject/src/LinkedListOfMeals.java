
public class LinkedListOfMeals {
	
	private Node head ; 
	
	public LinkedListOfMeals () {
		head = null ; 
	}
	
	// add at ( first ) 
	public void addAtFront ( Meal m ) {
		Node n = new Node (m) ;  // the new node that you r going to add 
		n.setNext(head); // its next is going to be the previous from the last update 
		head = n ; // the head will be the new one 
	}
	
	// displaying the stuff inside the data of the nodes 
	public void display () {
		Node n = head ; 
		while ( n != null ) {
			n.getData().display();
			n = n.getNext();  
		}
	}
	
	// getting the size of the linked list 
	public int size () {
		int c = 0 ; // counter 
		Node n = head ; 
		
		// while loop for counting  >> it stops when n == null which is the end of the nodes 
		while ( n != null ) {
			c++ ; 
			n = n.getNext() ; 
		}
		return c ; 
	}
	
	// add at ( End ) 
	
	public void addAtBack (Meal m) {
		Node n = new Node (m); // the node you r going to add 
		Node tail ; 
		
		if ( head == null ) { // if there is no meals added yet 
			head = n ;
		} else { 
			tail = head ; // finding the last node in the linked list so you can connect its next to the new node 
			while ( tail.getNext() != null ) {
				tail = tail.getNext() ; 
			}
			tail.setNext(n); // making the next of the last node equlas the new node that we made 
		}
	}
	
	public boolean delete ( Meal m ) {
		Node current = head ; // you create this node for finding the wanted node
		Node previous = null ; 
			
		while ( current != null && ! ( current.getData().getName().equals( m.getName() ) ) ) {
			previous = current ;
			current = current.getNext() ;
		}
		
		if ( current == null ) { // didn't find the wanted meal
			return false ; 
		} else {
			if ( previous == null ) { // he found the meal at the first spot (( the head is the same as the current )) 
				head = head.getNext() ; 
				current.setNext(null); 
			} else {  // he found the meal but not in the first node 
				previous.setNext(current.getNext());
				current = current.getNext() ; 
			}
			return true ; 
		}
	}
	
	public void addSorted ( Meal m ) {
		Node n = new Node (m) ; 
		Node current = head ; 
		Node previous = null ; 
		
		if ( head == null ) {
			head = n ; 
		}
		else {
			while ( current != null && current.getData().getPrice() < m.getPrice() ) { 
				previous = current ; 
				current = current.getNext() ;
			}
			
			if ( previous == null ) { 
				n.setNext(head);
				head = n ; 
			} else {
				previous.setNext(n);
				n.setNext(current);
			}
		}
	}
	
}
