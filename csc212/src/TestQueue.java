//
//public class TestQueue {
//	
//	public static void main ( String [] args ) {	
//		
//
//		LinkedQueue <String> q1 = new LinkedQueue<String>() ; 
//		q1.enqueue("1");
//		q1.enqueue("2");		
//		q1.enqueue("3");
//		q1.enqueue("4");		
//		q1.enqueue("5");
//		q1.enqueue("6");		
//		q1.enqueue("7");
//		q1.enqueue("8");		
//		q1.enqueue("9");
//
//
//		
//		ArrayQueue <String> q2 = new ArrayQueue <String> (5) ; 
//		q2.enqueue("a");
//		q2.enqueue("b");
//		q2.enqueue("c");
//		q2.enqueue("d");
//		q2.enqueue("e");
//
//
//		q1.reverse();
//		
//		System.out.println(q1.serve());
//		System.out.println(q1.serve());
//		System.out.println(q1.serve());
//
//
//
//
//		
////		PriorityQueue<String> PQ = new PriorityQueue<>() ; 
////		PQ.enqueue("Hellow" , 10);
////		PQ.enqueue("wadah" ,12);
////		PQ.enqueue("esam" , 12);
////		PQ.enqueue("haider" , 12);
////		PQ.enqueue("my name is" , 14);
//
//		
////		System.out.println(PQ.serve().data);
////		System.out.println(PQ.serve().data);
////		System.out.println(PQ.serve().data);
////		System.out.println(PQ.serve().data);
//		
//	}
//	
//	public static <T> void exchange ( Queue<T> q1 , Queue<T> q2 ) {
//		int sizeOfq2 = q2.length() ; 
//		int sizeOfq1 = q1.length() ; 
//		 
//		for ( int i = 0 ; i < sizeOfq1 ; i++ ) 
//			q2.enqueue(q1.serve());
//		
//		for ( int i = 0  ; i < sizeOfq2 ; i++ ) 
//			q1.enqueue(q2.serve());
//	}
//	
//	
//	
//	public static <T> boolean isReverse ( Queue<T> q1 , Queue<T> q2 ) {
//
//		if ( q1.length() == q2.length() ) {
//			for ( int i = 0 ; i < q1.length() ; i++ ) {
//				
//				T temp1 , temp2 ; 
//				
//				
//				///////////////// q1 
//				
//				//prepare to take
//				for ( int j = 0 ; j < i ; j++ ) {
//					q1.enqueue(q1.serve()); ; 
//				}
//				
//				temp1 = q1.serve(); 
//				q1.enqueue(temp1);
//				
//				//make q1 it as it was 
//				for ( int k = 0 ; k < q1.length()-i-1 ; k++ ) {
//					q1.enqueue(q1.serve()); ; 
//				}
//				
//				////////////////q2
//				//prepare to take
//				for ( int j = 0 ; j < q2.length()-1-i ; j++ ){
//					q2.enqueue(q2.serve()); ;
//				}
//				
//				
//				temp2 = q2.serve() ; 
//				q2.enqueue(temp2); 
//				
//				//make it as it was
//				for ( int k = 0 ; k < i ; k++ ) {
//					q2.enqueue(q2.serve()); ; 
//				}
//				
//				if ( !temp1.equals(temp2) ) {
//					return false ; 
//				}
//				
//			}
//			return true ;  
//		} else {
//			return false ; 
//		}
//		
//	}
//	
//	public static <T> boolean isReverse2 ( Queue<T> q1 , Queue<T> q2 ) {
//		
//		if ( q1.length() == q1.length() ) {
//			
//			T [] array = ( T[] ) new Object [q1.length()] ; 
//			int count = 0 ; 
//			for ( int i = 0 ; i < q1.length() ; i++ ) {
//				array[count] = q1.serve(); 
//				q1.enqueue(array[count]);
//				count++ ; 
//			}
//			
//			
//			T [] array2 = ( T[] ) new Object [q2.length()] ; 
//			int count2 = 0 ; 
//			for ( int i = 0 ; i < q2.length() ; i++) {
//				array2[count2] = q2.serve(); 
//				q2.enqueue(array2[count2]);
//				count2++ ;  
//			}
//			
//
//			for ( int i = 0 ; i < count2 ; i++  ) {
//				if ( !array[i].equals(array2[count-1]) )
//					return false ; 
//				count-- ; 
//			}
//			
//			return true; 
//			
//			
//		} else 
//			return false ;
//		
//	}
//}
