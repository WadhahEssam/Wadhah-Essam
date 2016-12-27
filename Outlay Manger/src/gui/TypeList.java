package gui;

public class TypeList {

	private int id ; 
	private String text ; 
	
	public TypeList ( int id , String text ) {
		this.id = id ; 
		this.text = text ; 
	}
	
	public int getId () {
		return id ; 
	}
	
	public String getText () {
		return text ; 
	}
	
	public String toString () {
		return text ;
	}
}
