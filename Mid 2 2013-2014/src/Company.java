
public class Company {
	
	private String name ; 
	private MobileDevice[] arrMob ; 
	private int nbMob ; 

	public Company(String name , int size) {
		super();
		this.name = name;
		this.arrMob = new MobileDevice[size] ;
		this.nbMob = 0;
	}
	
	public String addMobile ( MobileDevice m ) {
		if ( nbMob < arrMob.length ) {
			if ( m instanceof SmartPhone ) 
				this.arrMob[nbMob] = new SmartPhone ( (SmartPhone) m ) ; 
//			else ( m instanceof Tablet ) 
//				this.arrMob[nbMob] = new Tablet ((Tablet) m ) ; 
			return "Successfully added" ;
		}
		else return "Cannot be added" ; 
	}
	
//	public 

}
