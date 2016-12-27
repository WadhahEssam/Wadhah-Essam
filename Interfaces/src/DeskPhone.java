
public class DeskPhone implements ITelephone {


	private int myNumber ;
	private boolean isRinging ;
	
	
	public DeskPhone  ( int number ) {
		this.myNumber = number ; 
	}


	public void powerOn() {

		System.out.println("no action taken , it's always on");
		
	}

	public void dail(int phoneNumber) {

       System.out.println("now ringing " + phoneNumber + " on deskphone ");		
	}
	
	public void answer() {

		if ( isRinging ) {
			System.out.println("Answering the desk phone");
			isRinging = false ; 
		}
	}

	public boolean callPhone(int phoneNumber) {

		if ( phoneNumber == myNumber ) {
			isRinging = true ;
			System.out.println("Ring Ring");
		}
		else 
			isRinging = false ; 
		
		return isRinging ; 
	}

	public boolean isRinging() {
		return isRinging ;
	} 
	
	

	
	
	
}
