
public class Node <T> {
	public Node next ; 
	public Node previous ; 
	public T data ; 
	
	public Node ( T val ) {
		this.next = null ;
		this.previous = null ; 
		this.data = val ;
	}
	
	public Node () {
		this.next = null ; 
		this.previous = null ; 
		this.data = null ; 
	}
}
