import java.awt.HeadlessException;

public class LinkedQueue <T> implements Queue <T> {

	private Node<T> head , tail ;
	private int size ; 
	
	public LinkedQueue () {
		this.head = this.tail = null ; 
		this.size = 0 ; 
	}
	
	public boolean full() {
		return false;
	}

	public T serve() {
		Node<T> result = head ; 
		head = head.next ; 
		size-- ; 
		if ( size == 0 ) 
			tail = null ;
		return result.data ; 
	}

	public void enqueue(T val) {
		Node<T> n = new Node<T> (val)  ;
		if ( head == null ) 
			head = tail = n ; 
		else {
			tail.next = n ; 
			tail = n ; 
		}
		size ++ ; 
	}

	public int length() {
		return this.size; 
	}
	
	public void reverse () {
		if ( size >= 2 ) {
			Node<T> current = head , previous = null , after = head.next  ;
			Node<T> tempTail = tail ;
			tail = head ; 
			head = tempTail ; 
			while ( current != null ) {
				current.next = previous ; 
				
				previous = current ; 
				current = after ;
				if (after != null)
					after = after.next ;
			}
			
			
		}
		
		
	}
	
	
	
	
	

}
