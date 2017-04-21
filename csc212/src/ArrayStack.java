
public class ArrayStack<T> implements Stack<T> {

	private int maxSize ; 
	private T [] nodes  ;
	private int top ; 
	
	public ArrayStack ( int max ) {
		maxSize = max ; 
		nodes = ( T [] ) new Object [maxSize] ; 
		top = -1 ; 
		
	}
	public boolean full() {
		return ( top + 1  == maxSize);
	}

	public boolean empty() {
		return ( top + 1 == 0 ) ;
	}

	public T pop() {
		T temp = nodes[top] ; 
		top-- ; 
		return temp ; 
		
	}

	public void push(T val) {
		nodes[top++] = val ;
	}

	
}
