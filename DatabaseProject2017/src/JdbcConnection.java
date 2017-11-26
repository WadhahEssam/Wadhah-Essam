import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) {
		Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
            stmt = con.createStatement();
            
            //display all the rows
            rs = stmt.executeQuery("SELECT * FROM person");
            while(rs.next()) {
                System.out.print(rs.getInt("PID") + "\t");
                System.out.println(rs.getString("PNAME"));
            }   
            System.out.println("\n");
            
            // insert a new tuple (4, 'Abdulrahman')
            String sqlInsert = "insert into person " // need a space 
            		+ "values (4, 'Abdulrahman')";
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            //System.out.println("\n");

            //display all the rows to check insertion
            rs.close();
            rs = stmt.executeQuery("SELECT * FROM person");
            while(rs.next()) {
                System.out.print(rs.getInt("PID") + "\t");
                System.out.println(rs.getString("PNAME"));
            } 
            System.out.println("\n");

            // delete the row with PID=4
            String sqlDelete = "delete from person where pid=4"; 
            int countDeleted = stmt.executeUpdate(sqlDelete); 
            System.out.println(countDeleted + " records deleted.\n");
            //System.out.println("\n");

           //display all the rows to check deletion
            rs.close();
            rs = stmt.executeQuery("SELECT * FROM person");
            while(rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.println(rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                //rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

}

//(To be used in the faculty) con = DriverManager.getConnection("jdbc:oracle:thin:username/password@10.131.240.15:1522:o10g");
// (to be  used at home) con = DriverManager.getConnection("jdbc:oracle:thin:username/password@localhost:1521:xe");