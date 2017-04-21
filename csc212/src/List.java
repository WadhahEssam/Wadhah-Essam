
public interface List <T> { 
	
	boolean last();
	boolean empty() ;
	boolean full() ;
	T retrive () ;
	void update ( T val ) ;
	void remove () ; 
	void insert ( T val ) ;
	void findFirst () ; 
	void findNext () ; 

}
