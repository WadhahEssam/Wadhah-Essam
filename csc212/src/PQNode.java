
public class PQNode<T> {
	public T data ; 
	public PQNode<T> next ; 
	public int priority ;
	
	public PQNode () {
		next = null ; 
	}
	
	public PQNode ( T val , int p ) {
		data = val ; 
		next = null ; 
		priority = p ; 
	}
}
