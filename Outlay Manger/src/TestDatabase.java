import java.sql.SQLException;

import model.Database;

public class TestDatabase {

	public static void main(String[] args) {
		System.out.println("Running database test");
		
		Database db = new Database () ;
		try {
			db.connect();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		
		System.out.println("Connection is fine ");
		
		try {
			db.disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Connection is closed");
	}

}
