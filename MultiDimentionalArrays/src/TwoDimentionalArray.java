
public class TwoDimentionalArray {

	public static void main(String[] args) {

		// using the nested array initializer 
		int[][] twoDimArray = { { 1 , 2 } , { 5 , 9 } , { 8 , 7 } } ;  // 3 rows 2 columns (fixed)
		int[][] twoDimArray1 = { { 1 , 2 } , { 4 , 5 , 6 } , { 8 } , { 5 , 26 , 87 , 23 } , { 5 } } ;  // 3 rows  different columns 
		
		int[][] twoDimArray2 = new int[3][2];  // 3 rows 2 columns 
		
		int[][] twoDimArray3 = new int[3][ ]; 
		twoDimArray3[0] = new int [2];
		twoDimArray3[1] = new int [3];
		twoDimArray3[2] = new int [1];
		// 3 rows different columns 
		
		// lets try to type the info in the array 
		for ( int i = 0 ; i < twoDimArray.length ; i++ ) {
			for (int c = 0 ; c < twoDimArray[i].length ; c++ ) {
				System.out.print(twoDimArray[i][c] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		
		// try to type the second array
		for ( int i = 0 ; i < twoDimArray1.length ; i++ ) {
			for (int c = 0 ; c < twoDimArray1[i].length ; c++ ) {
				System.out.print(twoDimArray1[i][c] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
	
		// let's try to fill the empty third array ; 
		
		int rowWriter = 0 ;
		int columnWriter = 0 ;
		
		for ( int i = 0 ; i < twoDimArray2.length ; i++ ) {
			for (int c = 0 ; c < twoDimArray2[i].length ; c++ ) {
				twoDimArray2[i][c] = columnWriter ; 
				columnWriter++ ;
			}
			rowWriter++;
		}
		
		//easuier way to type the content using enhanced for 
		for ( int[] numbers : twoDimArray2 ) {
			for ( int number : numbers ){
				System.out.print(number + " ");
			} 
			System.out.println();
			
		}
		
		
		
	}
}
