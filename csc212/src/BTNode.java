
public class BTNode<T> {
	T data ; 
	BTNode<T> left , right ; 
	public BTNode () {
		data = null ; 
		left = right = null ; 
	}
	
	public BTNode ( T val ) { 
		data = val  ; 
		left = null ; 
		right = null ;
	}
}
