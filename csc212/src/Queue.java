
public interface Queue <T> {
	boolean full () ;
	T serve () ;
	void enqueue ( T val ) ;
	int length () ; 
}
