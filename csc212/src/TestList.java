//
//public class TestList {
//	public static void main ( String [] args ) {
//		DoubleLinkedList<Integer> i = new DoubleLinkedList<Integer> () ; 
//		
//		i.insert(0);
//		i.insert(1);
//		i.insert(2);
//		i.insert(2);
//		i.insert(0);
//
//
//		
//		printDoubleList(i);
//		
//		System.out.println(checkListEndsSymmetry(i, 2));
//
//		
//
//	}
//	
//	public static <T> boolean checkListEndsSymmetry (DoubleLinkedList<T> dl , int k ) {
//		T numsBefore [] = (T[]) new Object [k] ; 
//		dl.findFirst();  
//		for ( int i = 0 ; i < k ; i++ ) {
//			numsBefore[i] = dl.retrive(); 
//			dl.findNext();
//		}
//		dl.findNext() ; 
//		
//		int i = k ; 
//		while (!dl.last()) {
//			if ( (dl.retrive()==null && i >= 0  ) || !dl.retrive().equals(numsBefore[--i])  ) { 
//				return false ; 
//			}
//			dl.findNext();
//		}
//		
//		return true ;  
//	}
//	
//	
//	public static <T> void filter (List <T> l , Condition<T> cnd) {
//		if ( !l.empty() ) {
//			l.findFirst();
//			while (!l.last()){
//				if (!cnd.test(l.retrive())) 
//					l.remove();
//				else 
//					l.findNext();
//			}
//			if (!cnd.test(l.retrive())) 
//				l.remove();	
//		}
//	}
//	
//	
//	public static <T> void moveToEnd ( List<T> l , int i ) {
//		if ( !l.empty()){
//			l.findFirst();
//			for ( int j = 0 ; j < i ; j++ ) {
//				l.findNext();
//			}
//			T temp = l.retrive() ; 
//			l.remove();
//			
//			if ( !l.empty() ){
//				l.findFirst();
//				while ( !l.last() ) {
//					l.findNext();
//				}
//			}
//
//			
//			l.insert(temp);
//		}
//	}
//	
//	public static <T> void removeDuplicate (List<T> l , T data) {
//		boolean firstShow = false ;  
//		l.findFirst();
//		
//		while(!l.last()){
//			if (l.retrive().equals(data)) 
//				if (firstShow) 
//					l.remove();
//				else {
//					l.findNext();
//					firstShow = true ;
//				}
//			else
//				l.findNext();
//		}
//		if ( l.retrive().equals(data) && firstShow ) 
//			l.remove();	
//	}
//	
//	public static <T>  void printList ( List<T> l ) {
//		l.findFirst();
//		while (!l.last()) {
//			System.out.println(l.retrive());
//			l.findNext();
//		}
//		System.out.println(l.retrive());		
//		System.out.println();
//	}
//	
//	public static <T>  void printDoubleList ( DoubleList<T> l ) {
//		l.findFirst();
//		while (!l.last()) {
//			System.out.println(l.retrive());
//			l.findNext();
//		}
//		System.out.println(l.retrive());		
//		System.out.println();
//	}
//}
