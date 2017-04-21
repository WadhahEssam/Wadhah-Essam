
public class testStack {

	public static void main ( String [] args ) {
		System.out.println(isBalanced("{hello my { name is  }  { }   { }   {  {  }  { }}} "));
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


