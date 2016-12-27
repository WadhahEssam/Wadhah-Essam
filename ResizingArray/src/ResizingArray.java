import java.lang.reflect.Array;

public class ResizingArray {

	
	
	public static int[] numbers ;
	
	public static void main(String[] args) {
     
		numbers = new int[10]; // i am going to resize this array 
		
		for (int i = 0 ; i < numbers.length ; i++ ) {
			numbers[i] = i + 1 ;
		}
		
		for (int i = 0  ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		numbers = resizeArray(numbers , 12); 
		
		for (int i = 0  ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		numbers = resizeArray ( numbers , 6 );
		
		for (int i = 0  ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}
		
	}
	
	private static int[] resizeArray ( int[] array , int size ) {
        int[] newArray = new int[size];
        
        for ( int i = 0 ; ( i < newArray.length ) && ( i < array.length ); i++ ) {
        	newArray[i] = array[i];
        }
        
        return newArray ;
        
	}
	
	
	

}
