public class LinkedListOfMeals {
	
	private Node head ;

	public LinkedListOfMeals() {
		this.head = null;
	}
	
	public void addAtFront (Meal m) {
		Node n = new Node (m) ; 
		
		n.setNext(head);
		head = n ; 
	}
	
	public int size () {
		Node startNode = head ; 
		int c = 0 ; // counter 
		
		while ( startNode != null ) {
			c++ ; 
			startNode = startNode.getNext() ; 
		}
		return c ; 
	}
	
	public void addAtBack (Meal m) { 
		Node n = new Node (m) ; 
		
		if ( head == null ) {
			head = n ;
		} else {
			Node last = head ; 
			
			while ( last.getNext() != null ) {
				last = last.getNext() ; 
			}
			last.setNext(n);
		}
	}
	
	public boolean delete ( Meal m ) {
		Node current = head ; 
		Node previous = null ; 
		
		while ( current != null && !(current.getData().getName().equals(m.getName())) ) {
			previous = current ;
			current = current.getNext() ; 
		}
		
		if ( previous == null ) {
			head = head.getNext() ; 
			current.setNext(null);
			return true ; 
		} else if ( current == null ) {
			return false ;
		} else {
			previous.setNext(current.getNext());
			current.setNext(null);
			return true ; 
		}
	}
	
	// „‰ «·’€Ì— «·Ï «·ﬂ»Ì—
	public void addSorted ( Meal m ) {
		Node n = new Node (m)  ;
		Node current = head ; 
		Node previous = null ;
		
		while ( current != null && current.getData().getPrice() < m.getPrice() ) {
			previous = current ; 
			current = current.getNext() ;
		}
		
		if ( current == null ) {
			addAtBack(m) ; 
		} else if ( previous == null ) {
			addAtFront(m) ; 
		} else {
			previous.setNext(n);
			n.setNext(current);
		}
	}
	
	public void display () {
		Node current = head ; 
		while ( current != null ) {
			current.getData().display();
			current = current.getNext() ; 
		}
	}
	
}