
public class test {

	public static void main(String[] args) {


		Employee e = new Employee ( "Ahmed " , 7 , 8 ) ;
		Manger m = new Manger ( "Ali " , 12 , 12 , 20 ) ;
		Consultant c = new Consultant ( "Hamed " , 9 , 10 , 19 ) ;
		
		Company STC = new Company ( "STC" , 3 ) ;

		STC.addEmployee(e);
		STC.addEmployee(m);
		STC.addEmployee(c);
		
		STC.displayAll();
		
		Employee[] arrE = STC.getHighSalary(20000);
		Manger[] arrM = STC.getManger(10);
		
		System.out.println(arrM.length);
		System.out.println("the emplyees with salary greater than 20000" );
		
		for ( int i = 0 ; i < arrE.length-1  ; i++ ) {
			arrE[i].display();
		}
		System.out.println("the mangers with number of employees greater than 10");
		for ( int i = 0 ; i < arrM.length && arrM[i] != null ; i++ ) {
			arrM[i].display();
		}
	}

}
