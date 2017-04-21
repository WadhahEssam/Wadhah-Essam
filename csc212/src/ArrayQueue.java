
public class ArrayQueue<T> implements Queue<T> {
	
	private T nodes []  ; 
	private int maxSize ; 
	private int size ;
	private int head , tail ;
	
	public ArrayQueue ( int n ) {
		maxSize = n ; 
		nodes = ( T[] ) new Object [n] ; 
		head = 0 ;
		tail = 0 ; 
		size = 0 ; 
		
	}
	
	public boolean full() {
		return ( size == maxSize ) ;
	}

	public T serve() {
		T result = nodes[head] ; 
		head = ( head + 1 ) % maxSize ;
		size-- ; 
		return result ;
	}

	public void enqueue(T val) {
		nodes[tail] = val ; 
		tail = (tail + 1) % maxSize ; 
		size++ ;
	}

	public int length() {
		return size ; 
	}
	
	public void remove(int k)  { 
		head = ( head + 2 ) % maxSize ; 
		size -= 2 ; 
	}
	
	public void reverse () {
		int h = head ; 
		int t = tail ; 

		for ( int i = 0 ; i < size / 2 ; i++ ){
			
			if ( t == 0 ) 
				t = maxSize ; 
			
			if ( h == maxSize-1 ) 
				h = 0 ; 
			
			System.out.println(h + " " + t);
			T temp = nodes[h] ;
			nodes[h] = nodes[(t-1)] ; 
			nodes[t-1] = temp ; 

			h++ ;
			t-- ; 
		}
	}
	
	public void exchange ( int i , int j ) {
		T temp = nodes [(head +i) % maxSize] ; 
		nodes[(head+i) % maxSize] = nodes[(head+j) %maxSize] ; 
		nodes[(head+j) % maxSize] = temp ; 
	}
	
	
	
	
	
	
}
