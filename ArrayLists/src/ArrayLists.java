import java.util.ArrayList; // the teacher in udemy didn't import any thing he just directly diclared the arraylist 

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> List = new ArrayList<String>(); 
		
		ArrayList<double[]> numbersList = new ArrayList<double[]>(); // i should use the indices [] to create the arrayList with a type double or int 
		ArrayList<int[]> numberIList = new ArrayList<int[]>();
		
        List.add("Wadah") ;
        List.add("Mohammed");
        List.add("Ali");
        List.add("Gaber");
        List.add("Nasser");
            
        for (String name : List) {
        	System.out.println(name);
        }
        
        List.clear();
        
        for (String name : List) {
        	System.out.println(name);
        }
        System.out.println();
        
        
        List.add("Wadah") ;
        List.add("Mohammed");
        List.add("Ali");
        List.add("Gaber");
        List.add("Nasser");
        
        List.add( 1 , "Saleh");
        
        System.out.printf("the size of the list is %d \n\n" , List.size());
		
        List.remove(2);
        List.remove(3);
        
        for (String name : List) {
        	System.out.println(name);
        }
        
        if ( List.contains("Wadah")) {
        	System.out.println("the list contains the name wadah");
        }
        if ( List.contains("Saleh")){ // you can do this search manually by using for loop   but this way is better  
        	System.out.println("the list contain the name saleh ");
        }
      
        
        
	}
}
