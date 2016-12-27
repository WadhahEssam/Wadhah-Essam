
public class EnhancedFor {

	public static void main(String[] args) {		
		
		//this for is used in the multidimentional arrays  , it makes it easier to get the values from it 
		int[] lotOfRandoms = { 55 , 15 , 848 , 998 , 220 , 2  , 882 } ; // this program gives the total using two for methods 
			
		int totalNormal = 0 ; 
		for ( int i = 0 ; i < lotOfRandoms.length ; i++ ) {
			totalNormal += lotOfRandoms[i];
		}
		
		System.out.println("the answer with the normal for is " + totalNormal );
		
		int totalEnhanced = 0 ; 
		for ( int numbers : lotOfRandoms ) {
			totalEnhanced += numbers ;
		} // very important note  . . . the data inside the array can't be changed using the enhanced for 
		
		System.out.println("the answer with the enhanced for is " + totalEnhanced );

	}

}
