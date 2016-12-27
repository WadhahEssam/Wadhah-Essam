
public class Enum {
	
	public enum Bool { TRUE , FALSE } ;  // the enum is like if you want to add a new data type to java and use it the way you wan //// the enum can't be defined in the main menu
	
	public void printEnum () {
		Bool bool = Bool.TRUE ; 
		
		if ( bool == Bool.TRUE ) {
			System.out.println("true");
		}
	}


}
