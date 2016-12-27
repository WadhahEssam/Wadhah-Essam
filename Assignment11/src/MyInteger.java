
public class MyInteger {
	
	private int value ; 
	
	MyInteger (){
		this (0); 
	}
	MyInteger ( int value ) { 
		this.setValue(value) ; 
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven (){
		if ( this.value % 2 == 0 )   {
			return true ; 
		}
		else 
			return false ; 
	}
	
	public boolean isOdd (){
		if ( this.value % 2 == 1 )   {
			return true ; 
		}
		else 
			return false ; 
	}
	
	public boolean isPrime(){

         
	        for( int i=2 ; i <= this.value /2 ; i++){
	            if( this.value % i == 0){
	                return false;
	            }
	        }
	        return true;
	   
	}
	
	public static boolean isEven (int value ) {
		if ( value % 2 == 0 )   {
			return true ; 
		}
		else 
			return false ; 
	}

	public static boolean isOdd (int value ) {
		if ( value % 2 == 1 )   {
			return true ; 
		}
		else 
			return false ; 
	}
	
	public static boolean isPrime(int value ){
        
        for( int i=2 ; i <=  value /2 ; i++){
            if( value % i == 0){
                return false;
            }
        }
        return true ;
        		
	}
	
	public static boolean isEven ( MyInteger n  ) {
		if ( n.value % 2 == 0 )   {
			return true ; 
		}
		else 
			return false ; 
	}

	public static boolean isOdd ( MyInteger n  ) {
		if ( n.value % 2 == 1 )   {
			return true ; 
		}
		else 
			return false ; 
	}
	
	public static boolean isPrime( MyInteger n ){
        
        for( int i=2 ; i <=  n.value /2 ; i++){
            if( n.value % i == 0){
                return false;
            }
        }
        return true ;
        		
	}
		
	public MyInteger add ( MyInteger n ) {
		MyInteger n3 = new MyInteger () ; 
		int dd = ( n.value + this.value );
		n3.setValue(dd);
		return n3   ; 
	}
	
	public MyInteger sub ( MyInteger n ) {
		MyInteger n3 = new MyInteger () ; 
		int dd = ( this.value - n.value );
		n3.setValue(dd);
		return n3   ; 	
	}
	
	public MyInteger mul ( MyInteger n ) {
		MyInteger n3 = new MyInteger () ; 
		int dd = ( n.value * this.value );
		n3.setValue(dd);
		return n3   ; 	
	}
	
	public MyInteger div ( MyInteger n ) {
		MyInteger n3 = new MyInteger () ; 
		int dd = ( this.value / n.value );
		n3.setValue(dd);
		return n3   ; 	
	}
	
	public boolean equals ( int n ) {
		if ( this.value == n ) {
			return true ; 
		}
		else 
			return false ; 
	}
	
	public boolean equals (MyInteger n ) {
		if (this.value  == n.value ){
			return true ; 
		}
		else 
			return false ; 
	}
	
	
	
	
	
	
}