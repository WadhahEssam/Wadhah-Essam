
public class Main {

	public static void main(String[] args) {
		
		ITelephone timsPhone = new DeskPhone(735698764) ; 
		
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		
		
		timsPhone = new MobilePhone (551292881) ; 
		timsPhone.callPhone(12343) ; 
		timsPhone.answer();
		
	}
}
