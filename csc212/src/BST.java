
public class BST<T> {
	BSTNode<T> root , current ; 
	
	public BST () {
		root = current = null ; 
	}
	
	public boolean empty () {
		return ( root == null )  ; 
	}
	
	public boolean full () {
		return false ; 
	}
	
	public T retrieve () {
		return ( current.data ) ;
	}
	
	public boolean update ( int k , T val ) {
//		remove_key( current.key ) ;
		return insert ( k , val ) ;  
	}
	
	public boolean FindKey ( int k ) {
		if ( root == null )
			return false ; 
		
		BSTNode<T> temp = root ; // important that you should start searching from the root not from the current 
		while ( temp.key != k) {
			if ( k > temp.key ) {
				if (temp.right == null ){
					current = temp ;
					return false ; 
				} else 
					temp = temp.right ; 
			}
			else {
				if ( temp.left == null )  { 
					current = temp.left ;
					return false ; 
				} else 
					temp = temp.left ;
			}
		}
		
		current = temp  ; 
		return true ; 
	}
	
	
	// there is a much easier version of this method written in the slides ( but it uses other methods ) 
	public boolean insert ( int k , T val ) {
		BSTNode<T> n = new BSTNode<T>(k ,  val)  , temp = root ; 
		
		while ( temp.key != k ) {
			if ( k > temp.key ) {
				if ( temp.right == null ) {
					temp.right = n ; 
					current = n ; 
					return true; 
				} else {
					temp = temp.right ;
				}
			} else if ( k < temp.key ) {
				if ( temp.left == null ) {
					temp.left = n ; 
					current = n ; 
					return true ;  
				} else {
					temp = temp.left ;
				}
			}
		}
		return false ; // when k is already inserted
	}
	
//	public boolean remove_key ( int tkey ) {
//		Boolean removed = new Boolean ( false ) ;
//		BSTNode<T> p ; 
//		p = remove_aux ( tkey , root , removed ) ;
//		current = root = p ; 
//		return removed ; 
//	}
	
//	private BSTNode<T> remove_aux ( int key , BSTNode<T> p , Boolean b ) {
//		BSTNode<T> q , child = null ; 
//		if ( p == null ) 
//			return null ; 
//		if ( key < p.key )
//			p.left = remove_aux ( key , p.left , b ) ;
//		else if ( key > p.key ) 
//			p.right = remove_aux ( key , p.right , b ) ; 
//		else {
//			b = true ; 
//			if ( p.left != null && p.right != null ) {
//				q = find_min ( p.right) 
//			}
//		}
//	}
	
	
	
}
