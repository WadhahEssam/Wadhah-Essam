
public class SecondaryRole extends Role {
	
	private double hourlyRate ; 
	
	public SecondaryRole ( String name , int nbOccur , int totalTime , double hourlyRate ) {
		super (name , nbOccur , totalTime );
		this.hourlyRate = hourlyRate ; 
	}
	
	public SecondaryRole ( SecondaryRole s ) {
		super (s) ; 
		this.hourlyRate = s.hourlyRate ; 
	}
	
	public double getHourlyRate () {
		return this.hourlyRate ; 
	}
	
	@Override
	public double calculateCachet() {
		return this.hourlyRate * super.totalTime ; 
	}

}
