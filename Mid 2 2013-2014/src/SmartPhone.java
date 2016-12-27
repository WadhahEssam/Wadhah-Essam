
public class SmartPhone extends MobileDevice {
	
	private int nbSim ; 
	
	public SmartPhone(int storage, String brand, double speed, double price , int nbSim) {
		super(storage, brand, speed, price);
		this.nbSim = nbSim ; 
	}
	
	public SmartPhone(SmartPhone s ) {
		super (s) ;
		this.nbSim = s.nbSim ; 
	}
	
	public double calculatePrice () {
		return 1300 + this.nbSim * 150 ;
	}
	
	public int getNbSim () {
		return this.nbSim ; 
	}
}
