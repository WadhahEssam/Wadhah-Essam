
public class Application {
	
	public static void main ( String [] args ) {

		Contract c1 = new Contract ( 1111 , "21/5/2010" , "STC" ) ;
		
		Clause cc1 = new Clause ( "advertising" , 250000.00 );
		c1.addClause(cc1); 
		
		Clause cc2 = new Clause ( "Kids program	" , 150000.00 );
		c1.addClause(cc2); 
		
		Contract c2 = new Contract ( 2222 , "22/8/2011" , "MBC TV" ) ;
		
		Clause cc3 = new Clause ( "Media" , 120000.00 );
		c2.addClause(cc3); 
		
		Clause cc4 = new Clause ( "TV programs " , 90000.00 );
		c2.addClause(cc4); 
		
		Clause cc5 = new Clause ( "Visiting School" , 350000.00 );
		c2.addClause(cc5); 
		
		FootBallPlayer PL  = new FootBallPlayer ( "Beckham " , 37 , 10 , 1000 , "strike");
		PL.addContract(c1);
		PL.addContract(c2);
		
		PL.computeSalary() ;
		PL.display();

	}

}
