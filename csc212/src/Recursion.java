
public class Recursion {

	public static void main(String[] args) {
		Queue<String> q = new LinkedQueue<String> () ;
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.enqueue("3");
		q.enqueue("3");
		q.enqueue("3");
		q.enqueue("3");
		q.enqueue("3");
		
		Stack<Integer> s = new LinkedStack<Integer> () ; 
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		System.out.println(stackSum(s));
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
	public static<T> void removeLast ( Stack<T> st ) {
		if ( st.empty() )
			return ;
		else {
			T temp = st.pop()  ; 
			removeLast(st); 
			if(!st.empty())
				st.push(temp);
		}
	}
	
	public static<Integer> int stackSum ( Stack<Integer> st ) {
		if ( st.empty() ) 
			return 0 ; 
		else {
			Integer temp = st.pop() ; 	
			int sum = stackSum(st) + (int) temp ; 
			st.push(temp);
			return sum ; 
		}
	}
	
	public static<T> void removeEle ( Stack<T> st , T e ) {
		if ( st.empty() ) 
			return ;
		else {
			T temp = st.pop() ; 
			removeEle(st,e) ; 
			if ( !temp.equals(e) )
				st.push(temp);
		}
	}
	
	public static<T> void replace ( Stack<T> st , T x , T y ) {
		if ( st.empty() ) 
			return ; 
		else {
			T temp = st.pop() ; 
			if ( temp.equals(x) )
				temp = y ; 
			replace( st , x , y ) ; 
			st.push(temp); 
		}
	}
	
	public static<T> void reverseQueue ( Queue<T> q ) {
		reverseQueueH(q , q.length()) ;
	}
	
	private static<T> void reverseQueueH ( Queue<T> q , int n ) {
		if ( n == 0 ) 
			return ; 
		else {
			T temp = q.serve() ; 
			reverseQueueH(q,n-1) ; 
			q.enqueue(temp); 
		}
	}
	
	public static <T> void printQueue(Queue<T> q){
		printQueueH(q, q.length()); 
	} 
	
	
	private static <T> void printQueueH(Queue<T> q, int n){
		if ( n == 0 ) 
			return ; 
		else {
			T temp = q.serve() ; 
			q.enqueue(temp);
			System.out.print(temp + " ");
			printQueueH(q,n-1) ; 
		}
	}
	
	public static <T> void printQueueReverse ( Queue<T> q ) {
		printQueueReverseH(q,q.length()) ; 
	}
	
	
	
	private static <T> void printQueueReverseH ( Queue<T> q , int n ) {
		if ( n == 0 ) 
			return ; 
		else {
			T temp = q.serve() ; 
			q.enqueue(temp); 
			printQueueReverseH(q, n);
			System.out.println(temp);
		}
	}
	
	public static<T> boolean SearchLinkedList ( List<T> l , T val ) {
		if ( l.empty() )
			return false ; 
		else {
			l.findFirst();
			return SearchLinkedListH(l,val) ; 
		}
	}
	
	private static<T> boolean SearchLinkedListH ( List<T> l , T val ) {
		if ( l.last() )
			return l.retrive().equals(val) ; 
		if (l.retrive().equals(val))
			return true;  
		else {
			l.findNext();
			return SearchLinkedListH(l, val) ; 
		}
		
			
	}
	
	public static<T> void CopyStack ( Stack<T> s1 , Stack<T> s2) {
		if (s1.empty()) 
			return ; 
		T temp = s1.pop(); 
		CopyStack(s1,s2) ;
		s2.push(temp);
		s1.push(temp) ;	
	}
	
	public static <T> boolean SearchStack ( Stack<T> s , T val ) {
		if ( s.empty() )
			return false; 
		else {
			T temp = s.pop() ; 
			if ( temp == val ) {
				s.push(temp);
				return true; 
			} else {
				boolean res = SearchStack(s,val) ;
				s.push(temp) ; 
				return res ; 
			}
		}
	}
	
	
	public static int getFac ( int n ) {
		if ( n == 0 ) 
			return 1 ; 
		else 
			return n * getFac(n-1) ; 
	}
	
	public static int getFib ( int n ) {
		if ( n < 2 ) 
			return 1 ; 
		else 
			return  getFib(n-1) + getFib(n-2) ; 
	}
	
	public static int BinarySearch ( int nums [] , int x ) {
		return BinarySearchR( nums , 0 , nums.length -1 , x ) ; 
	}
	
	private static int BinarySearchR ( int nums [] , int start , int end , int x ) {
		int i = (start+end) / 2 ; 
		if ( nums[i] == x ) 
			return i ; 
		else if ( nums[i] < x ) 
			return BinarySearchR (nums , i+1 , end , x ) ;
		else 
			return BinarySearchR (nums , start , i-1 , x ) ; 
	}
	
	
	public static int getPower ( int n , int m ) {
		if ( m == 1 ) 
			return n ; 
		if ( m == 0 ) 
			return 1 ; 
		else 
			return n * getPower(n , m-1) ; 
	}
	
	// provide the sum of the first n integers 
	public static int sum ( int [] nums , int n ) {
		if ( n == 1 ) 
			return nums[n-1] ; 
		else 
			return nums[n-1] + sum(nums,n-1) ; 
	}
	
	//searches for the index of an element inside an array 
	public static int LinearSearch ( int [] nums , int n , int d ) {
		if ( nums[n-1] == d )
			return n-1 ; 
		else 
			return LinearSearch ( nums , n-1 , d ) ; 
	}
	
	public static int BinarySum ( int [] nums , double start , double n ) {
		if ( n == 1 ) 
			return nums[(int) start] ; 
		else 
			return BinarySum(nums,start,Math.ceil(n/2)) + BinarySum(nums,start+Math.ceil(n/2) , Math.floor(n/2)) ; 
	}

}
