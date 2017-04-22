
public class testStack {

	public static void main ( String [] args ) {
		Stack<String> s = new LinkedStack <String> () ;
		s.push("C");
		s.push("B");
		s.push("A");
		
		Stack<String> s2 = new LinkedStack <String> () ;

		s2.push("E");
		s2.push("D");
		
		
		Stack<String> res = concatenate( s , s2 ) ; 
		
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		
		
	}
	public static <T> Stack<T> concatenate ( Stack<T> s1 , Stack<T> s2 ) {
		Stack<T> res = new LinkedStack<T> () ;
		Stack<T> s = new LinkedStack<T> () ; 
		
		while ( !s2.empty() ) {
			s.push(s2.pop());
		}

		while ( !s1.empty() ) {
			s.push(s1.pop()) ; 
		}
		
		while ( !s.empty() ) {
			res.push(s.pop());
		}
		
		return res ; 
	}
	
	
	public static <T> void pullUpBottom ( Stack<T> s ) {
		Stack<T> s2 = new LinkedStack<T> () ; 
		
		while ( !s.empty() ){
			s2.push(s.pop());
		}
		
		T temp = s2.pop(); 
		
		while ( !s2.empty() ) {
			s.push(s2.pop());
		}
		s.push(temp) ; 
	}
	
	public static <T> void remove (Stack<T> st , int i ) { 
		Stack<T> s = new LinkedStack<T> () ; 
		for ( int k = 0 ; k < i - 1 ; k++ ) {
			s.push(st.pop());
		}
		st.pop();
		while( !s.empty() ) {
			st.push(s.pop()) ; 
		}
	}
	
	public static <T> Stack<T> copyStack(Stack<T> s ) {
		Stack<T> result = new LinkedStack<T> () ;
		Stack<T> st = new LinkedStack<T> () ;

		while (!s.empty()) {
			st.push(s.pop());
		}
		
		while (!st.empty()) {
			T temp = st.pop () ; 
			result.push(temp);
			s.push(temp); 
		}
		
		return result ; 
	}
	
	public static <T> void removeLast ( Stack <T> st )  {
		Stack<T> s = new LinkedStack <T> () ;
		
		while ( !st.empty() ) {
			s.push(st.pop());
		}
		
		s.pop(); 
		while ( !s.empty() ) {
			st.push(s.pop()) ; 
		}
	}
	
	public static <T> void insertAfter ( Stack<T> st , int i , T e ) {
		Stack<T> s = new LinkedStack<T> () ;
		
		while ( !st.empty() ) {
			s.push(st.pop()); 
		}
		
		for ( int k = 0 ; k < i ; k++ ) { 
			st.push(s.pop()) ; 
		}
		
		st.push(e) ; 
		
		while ( !s.empty() ) {
			st.push( s.pop() ) ; 
		}
		
		
	}
	
	public static <T> void replace ( Stack<T> st , T x , T y ) {
		Stack<T> tempS = new LinkedStack<T> () ; 
		while (!st.empty()) {
			T temp = st.pop();
			if ( temp.equals(x) )
				temp = y ; 
			tempS.push(temp);
		}
		
		while (!tempS.empty()) {
			st.push(tempS.pop());
		}
	}
	
	public static <T> boolean isBalanced ( String s ) {
		Stack<Character> st = new LinkedStack<Character> () ; 
		for (int i = 0 ; i < s.length() ; i++ ) { 
			if (s.charAt(i) == '{') {
				st.push('{');
			} else if ( s.charAt(i) == '}' ) {
				if (st.empty()) 
					return false ; 
				st.pop();
			}
		}
		if ( st.empty() ) 
			return true; 
		else 
			return false ;
	}
}


