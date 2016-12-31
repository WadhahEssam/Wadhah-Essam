
public class Node {
	
	private Node next ;
	private Meal data ;
	
	
	public Node() {
		this.next = null;
		this.data = null;
	} 
	
	public Node (Meal m) {
		this.next = null ; 
		this.data = m ; 
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Meal getData() {
		return data;
	}

	public void setData(Meal data) {
		this.data = data;
	}
	
}
