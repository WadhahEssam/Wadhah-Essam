	/*
*
*/
package code_convention;

public class Something {
	private int val1 ;
	private int val2 ; 
	private int result ; 

	public void setValue(int x, int y) {
		val1=x;
		val2=y;
	}
	public int add() {
		result = val1 + val2;
		return result ; 
	}
	public int s(int v1,int v2) {
		result = val1 - val2;
		return result ; 
	}
	public int m(int v1,int v2) {
		result = val1 * val2;
		return result ;  
	}
	public int d(int v1,int v2) {
		result = val1 / val2;
		return result ; 
	}
}
