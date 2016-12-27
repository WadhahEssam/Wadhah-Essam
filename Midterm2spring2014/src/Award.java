
public class Award {
	
	private String name ;
	private int awardYear ;
	private double cash ; 
	 
	public Award ( String name , int awardYear , double cash  ) {
		this.name = name ; 
		this.awardYear = awardYear ;
		this.cash = cash ; 
		}
	
	public double getCash () {
		return this.cash;
	}
	
	public int getYear () {
		return this.awardYear ; 
	} 

}
