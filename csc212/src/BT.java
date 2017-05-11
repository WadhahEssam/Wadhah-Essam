
public class BT<T> {
	private BTNode<T> root ; 
	private BTNode<T> current ; 
	
	public BT () {
		root = current = null ; 
	}
	
	public boolean empty () {
		return ( root == null ) ;
	}
	
	public boolean full () {
		return false ; 
	}
	
	public void update ( T val ) {
		current.data = val ; 
	}
	
	public T retrieve () {
		return current.data ; 
	}
	
	public boolean insert ( Relative rel , T val ) {
		BTNode<T> n = new BTNode<T> (val) ; 
		switch (rel) {
		
			case leftChild :
				if ( current.left==null) {
					current.left = n ; 
					current = n ; 
					return true; 
				} else 
					return false ; 
 
			case rightChild :
				if ( current.right == null ){ 
					current.right = n ; 
					current = n ; 
					return true ;  
				} else 
					return false ; 
		
			case root :
				if ( root == null ) {
					root = n ; 
					current = n ;
					return true ; 
				} else 
					return false ; 
			
			case parent :
				return false ; 
				
			default : 
				return false  ; 
				
				
		}
		

	}
	
	
	public void deleteSubtree () {
		if ( current == root ) {
			root = current = null ; 
		} else { 
			BTNode<T> temp = current;  
			find(Relative.parent) ;
			if ( current.left == temp ) 
				current.left = null ; 
			else if ( current.right == temp ) 
				current.right = null ; 
			current = root ; // you should do that whenever you use the delete subtree method 
		}
	}
	
	public boolean find ( Relative rel ) {
		
		switch (rel) {
			case leftChild : 
				if ( current.left != null ) {
					current = current.left ; 
					return true; 
				} else 
					return false ; 
			case rightChild : 
				if ( current.right != null ) {
					current = current.right ; 
					return true;  
				} else 
					return false ; 
			case root : 
				current = root ; 
				return true;  
			case parent : 
				if ( current == root ) 
					return false;  
				if ( findParent ( root , current ) != null ){
					current =  findParent(root,current) ; 
					return true; 
				}
				else 
					return false ; 
			default:
				return false ; 
		
		}
	}
	
	
	public BTNode<T> findParent ( BTNode<T> root , BTNode<T> current ) {
		if ( root == null ) 
			return null ; 
		
		
		Stack<BTNode<T>> s = new LinkedStack<BTNode<T>> () ;
		
		while ( root.right != current && root.left != current ) {
			
			
			if ( root.right != null ) 
				s.push(root.right);
			if ( root.left != null )
				root = root.left ;
			else 
				root = s.pop() ; 
			
		}
		
		return root ; 
	}
	
	public BTNode<T> findParentR ( BTNode<T> root , BTNode<T> current ) { 
		// if it is empty 
		if (root == null ) 
			return null ; 
		
		if ( root.right == null && root.left == null ) 
			return null  ; 
		else if ( root.left == current || root.right == current  ) { 
			return root ;
		} else {
			/* the most important code */
			BTNode<T> q = findParent(root.left,current); 
			if ( q != null ) 
				return q ; 
			else 
				return findParent(root.right , current) ; 
		}
	}
	
	
	private void printNodes ( BTNode<T> root ) {
		if (root == null)
			return ; 
		else if ( root.right == null && root.left == null ) {
			System.out.println(root);
			return ; 
		} 
		printNodes(root.left); 
		printNodes(root.right);
		return ;
	}
	
	
	
	
	
}
