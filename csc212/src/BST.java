
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
	
	public boolean findKey ( int k ) {
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
	
	private T secondMin ( BSTNode<T> t ) {
		BSTNode<T> currentTemp = current  , p ; 
		findKey(t.key) ; 
		p = current ; 
		current = currentTemp ; 
		while ( p.left.left != null ) { 
			p = p.left ;
		}
		return p.data ; 
	}
	
	public T seondMinM () {
		return secondMinR ( root ) ; 
	}
	private T secondMinR ( BSTNode<T> t ) {
		if (t.left.left == null ) {
			if ( t.left.right != null )
				return t.left.right.data ; 
			return t.data ;
		}
		else 
			return secondMinR(t.left) ; 
	}
	
	public boolean inSubtree ( int k1 , int k2 ) { 
		BSTNode<T> p = root ; 
		while ( p != null && p.key != k1  ) {
			if ( k1 > p.key ) {
				p = p.right ; 
			} else {
				p = p.left ;
			}
		}
		if ( p == null ) 
			return false ; 
		
		while ( p != null && p.key != k2 )  {
			if ( k2 > p.key ) 
				p = p.right ;
			if ( k2 < p.key ) 
				p = p.left ; 
		}
		
		if ( p == null ) 
			return  false ;
		
		return true ; 
	}
	
	public boolean isLeaf ( int k ) { 
		return recIsLeaf ( k , root ) ;
	}
	
	private boolean recIsLeaf ( int k , BSTNode<T> t ) {
		if ( t.key == k ) {
			if ( t.left == null && t.right == null ) 
				return true;  
			else 
				return false ; 
		}
		else {
			if ( k > t.key ) 
				return recIsLeaf ( k , t.right ) ;
			else if ( k < t.key ) 
				return recIsLeaf ( k , t.left ) ;
		}
		
		return false ; 
	}
	
	
	
	// there is a much easier version of this method written in the slides ( but it uses other methods ) 
	public boolean insert ( int k , T val ) {
		BSTNode<T> n = new BSTNode<T>(k ,  val)  , temp = root ; 
		if ( root == null ) {
			root = n ;
			return true ;
		}
		else { 
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
