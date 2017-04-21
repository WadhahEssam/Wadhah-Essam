
public class ArrayList<T> implements List<T> {
	private T[] nodes ; 
	private int current ; 
	private int size ; 
	private int maxSize ;
	
	public ArrayList ( int n ) {
		maxSize = size ; 
		current = -1 ; 
		size = 0 ; 
		nodes = (T[]) new Object[n]  ; 
	}
	
	public boolean empty () {
		return (size == 0) ;
	}
	
	public boolean last () {
		return (current == size - 1 ); 	
	}
	
	public boolean full () {
		return (size == maxSize);
	}
	
	public void findNext () {
		current++;
	}
	
	public void findFirst () {
		current = 0 ; 
	}
	
	public void update ( T val ) {
		nodes[current] = val ; 
	}
	
	public T retrive () {
		return nodes[current] ;
	}
	
	public void insert ( T val ) {
		for ( int i = size-1 ; i > current ; i-- ) {
			nodes[i+1] = nodes[i] ;
		}
		current++;
		nodes[current] = val ;
		size++;
	}
	
	public void remove () {
		for ( int i = current ; i <= size - 2 ; i ++ ) {
			nodes[i] = nodes[i+1] ; 
		}
		size-- ; 
		if ( current == size-1 ) {
			current = 0 ;
		} else if ( size == 0 ) {
			current = -1 ; 
		}
	}
	
	public void removeEvenElems() {
		int j = 0 ; 
		int prevSize = size ; 
		for ( int i = 0 ; j <= prevSize  ; i++ ) {
			nodes[i] = nodes[j] ;
			if ( j != 0 )
				size-- ;
			j += 2 ;
		}
	}
	
	public void duplicate () {
		int prevSize = size ; 
		size = size * 2 ; 
		for ( int i = size-1 ; i >= 0 ; ){
			nodes[i] = nodes[prevSize-1];
			nodes[i-1] = nodes[prevSize-1];
			prevSize--;
			i -= 2 ; 
		}
	}
	
	
	
	
	
	
}
