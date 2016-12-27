package gui;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateItem {
	
	private Date date ; 
	
	public DateItem ( Date date ) {
		this.date = date ; 
	}
	
	public Date getDate () {
		return date ; 
	}
	
	public String toDataBaseString () {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy/MM/dd");
		return ( dateFormat.format(date) );
	}
	
	public String toString () {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy/MM/dd");
		return ( "    " + dateFormat.format(date) + "    " );
	}
	

}
