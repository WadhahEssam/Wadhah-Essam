
public class MobilePhone implements ITelephone {


	private int myNumber ;
	private boolean isRinging ;
	private boolean isOn ; 
	
	public MobilePhone  ( int number ) {
		this.myNumber = number ; 
	}


	public void powerOn() {

		isOn = true ; 
		System.out.println("Moblie Phone powered up ");
		
	}

	public void dail(int phoneNumber) {

		if ( isOn ) {
			 System.out.println("now ringing " + phoneNumber + " on deskphone ");		
		}
		else 
			System.out.println("phone is off");
      
	}
	
	public void answer() {

		if ( isRinging ) {
			System.out.println("Answering the desk phone");
			isRinging = false ; 
		}
	}

	public boolean callPhone(int phoneNumber) {

		if ( phoneNumber == myNumber && isOn ) {
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
