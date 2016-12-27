import java.sql.SQLException;

import model.Database;

public class TestDatabase {
	
	public static void main ( String [] args ) { 
		Database db = new Database () ;
		System.out.println("trying to connect to database");
		
		
		try {
			db.connect();
			db.disconnect();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
