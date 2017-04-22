import java.awt.HeadlessException;

import javax.xml.transform.Templates;

public class LinkedList<T> implements List<T> {
	private Node head ; 
	private Node current ;
	
	public LinkedList () {
		this.head  = null ; 
		this.current = null ; 
	}
	public boolean last () {
		return (current.next == null ) ;
	}
	
	public boolean empty () {
		return ( head == null ) ;
	}
	
	public boolean full () {
		return false ; 
	}
	
	public void findNext () {
		current = current.next ; 
	}
	
	public void findFirst () {
		current = head ; 
	}
	
	public void update ( T val ) {
		current.data = val ; 
	}
	
	public T retrive () {
		return (T) current.data ; 
	}
	
	public void insert ( T val ) {
		
		Node<T> n = new Node (val) ;
		if ( head == null ) {
			head = current = n ; 
		} else {
			n.next = current.next ; 
			current.next = n ; 
			current = n ; 
		}
	}
	
	public void insertAll ( T e[] , int n ) {
		
		
		for ( int i = 0 ; i < n ; i++ ) {
			insert(e[i]);
		}
		
	}
	
	public void remove () {
		if ( current == head ) {
			head = current = head.next ; 
		} else {
			Node<T> previous = head ;
			while (previous.next != current ) {
				previous = previous.next ; 
			}
			previous.next = current.next ;
			if ( current.next != null )
				current = current.next ;
			else 
				current = head ; 
		}
	}
	
	public void removeFirst() {
		Node<T> last = head , lastM ;
		while (last.next != null ){
			last = last.next ; 
		}
		lastM = last ; 
		
		
		Node<T> temp = head ; 

		while ( temp != last.next ) {
			
			boolean before = false ;
			boolean after = false ; 
			
			Node<T> tempB = head , tempA = null ;
			if ( temp != last )
				tempA = temp.next ; 
			
			while ( tempB != temp ) {
				if ( tempB.data.equals(temp.data)) {
					before = true ; 
				}
				tempB = tempB.next; 
			}
			
			while (  tempA != null && tempA != last.next ) { //
				if ( tempA.data == temp.data)
					after = true ;
				tempA = tempA.next ; 
			}
			
			Node <T> newNode = new Node<T> (temp.data);
			
			if ( (before == true) || (before==false && after==false) ) {
				lastM.next = newNode ;
				lastM = lastM.next ; 
			}
			
			temp = temp.next; 
		}
		
		head = last.next ;
		
	}
	
	public void removeBetween ( T e1 , T e2 ) {
		Node<T> temp1 = head , temp2 = head  ; 
		
		while ( temp1!=null && ! (temp1.data == e1) ) {
			temp1 = temp1.next ; 
		}
		
		while ( temp1!=null  && ! (temp2.data == e2) ) {
			temp2 = temp2.next ; 
		}
		
		if ( temp1 != null && temp2 != null ) {
			temp1.next = temp2 ;
		}
		
	}
	
	//recursive search
	public boolean search ( T e ) {
		return searchH( head , e ) ;
	}
	
	private boolean searchH ( Node<T> c , T e ) {
		if ( c == null ) 
			return false ; 
		else if ( c.data.equals(e) ) 
			return true ;  
		else 
			return searchH(c.next,e) ; 
	}

}












