
public class TestCD {

	public static void main ( String []args ) {
		try {
			CD csc113 = new CD ("CSC113" , 3 ) ;
			AudioTrack a = new AudioTrack ( "Inheritance" , 60 ) ;
			csc113.add(a);
			csc113.del("Inheritance");
		}catch (NegativeArraySizeException n) {
			n.getStackTrace() ; 
		}catch (ArrayIndexOutOfBoundsException a){
			a.getStackTrace();
		}catch (NullPointerException n) {
			n.getStackTrace();
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
