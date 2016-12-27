
public class test {

	public static void main(String[] args) {
		
		Player p1 = new Player () ;
		
		p1.PlayerJumped() ;
	//	p1.draw();
    //	GameObject g11 = new GameObject () ; // doesn't work cuz it is abstract 
		
		Menu m1 = new Menu () ;
		//m1.draw();
		
		GameObject[] arrG = new GameObject[2] ; 
		arrG[0] = p1 ; 
		arrG[1] = m1 ;
		
		for ( GameObject obj : arrG ) {
			obj.draw();
		}
	}
}
