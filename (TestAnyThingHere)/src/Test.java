import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; 

public class Test {
	
	public static void main ( String [] args ) {
		DateFormat dateFormat = new SimpleDateFormat ("yyyy/mm/dd") ;
		Date date = new Date () ;
		System.out.println(dateFormat.format(date));
		
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime())); //2016/11/16 12:08:43
	}

}
