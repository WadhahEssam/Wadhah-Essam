
public class LinkedStack<T> implements Stack<T> {
	
	private Node<T> top ;
	
	public LinkedStack () {
		top = null  ; 
	}
	
	public boolean full() {
		return false;
	}

	public boolean empty() {
		return (top==null) ;
	}

	public T pop() {
		T result = top.data ; 
		top = top.next ; 
		return result ;
	}

	public void push(T val) {
		Node<T> n = new Node<T> (val) ; 
		n.next = top ; 
		top = n ; 
	}
	
}
