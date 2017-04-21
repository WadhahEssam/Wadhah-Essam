
public class DoubleLinkedList<T> implements DoubleList<T> {
	
	private Node<T> head ; 
	private Node<T> current ;
	
	public void findPrevious () {
		current = current.previous ; 
	}
	
	public boolean last () {
		return ( current.next == null ) ;
	}
	
	public void update (T e) {
		 current.data = e ; 
	}
	
	public void insert ( T e ) {
		Node<T> tmp = new Node<T>(e);
		if(empty()) {
			current = head = tmp;
		}
		else {
			tmp.next = current.next;
			tmp.previous = current;
			if(current.next != null)
				current.next.previous = tmp;
			current.next = tmp;
			current = tmp;
		}
	}

	@Override
	public boolean empty() {
		return ( head == null ) ;
	}

	@Override
	public boolean full() {
		return false;
	}

	@Override
	public T retrive() {
		return current.data ; 
	}

	@Override
	public void remove() {
		if(current == head) {
			head = head.next;
			if(head != null)
			   head.previous = null;
		}
		else {
			current.previous.next = current.next;
			if(current.next != null)
			   current.next.previous = current.previous;
		}

		if(current.next == null)
			current = head;
		else
			current = current.next;
	}

	

	@Override
	public void findFirst() {
		current = head ; 
		
	}

	@Override
	public void findNext() {
		current = current.next ; 
		
	}

	@Override
	public boolean first () {
		return ( current == head ); 
	}
	


}
