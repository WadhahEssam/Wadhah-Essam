import java.awt.HeadlessException;

public class PriorityQueue<T>  {
	
	private PQNode<T> head; 
	private int size ; 
	
	public PriorityQueue () {
		head = null ;
		size = 0 ; 
	}
	
	public boolean full() {
		return false;
	}

	public PQElement<T> serve() {
		PQNode<T> temp = head ; 
		head = head.next ; 
		size--;
		return new PQElement<T> (temp.data , temp.priority); 
	}

	public void enqueue(T e, int pr) {
		PQNode<T> n = new PQNode<T>(e, pr);
		
		// when do you put it as a head 
		if((head == null) || (pr > head.priority)) {
			n.next = head;
			head = n;
		}
		else {
			PQNode<T> p = head;
			PQNode<T> q = null;
			while((p != null) && (pr <= p.priority)) {
				q = p;
				p = p.next;
			}
			n.next = p;
			q.next = n;
		}
		size++;
	}


	public int length() {
		return size ; 
	}

}

class PQElement <T> {
	T data ; 
	int priority ; 
	
	public PQElement ( T val , int p ) {
		this.data = val ; 
		this.priority = p ; 
	}
	
}
