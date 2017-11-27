import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnection {
	
	static Scanner input = new Scanner (System.in) ; 


	
	public static void main(String[] args) {	
		
		String check = "1" ; 
		while ( check.equals("1") )  { 
			///////////////////////////////////////////////////
			
			String firstChoice = "" ; 
			
			System.out.println("Choose a table : ");
			System.out.println("1 ) RESEARCHER ");
			System.out.println("2 ) RESEARCHEAWARD ");
			System.out.println("Your Choice :) ");
			
			firstChoice = input.nextLine() ; 
			
			System.out.println("");

			///////////////////////////////////////////////////
			
			String secondChoice = "" ; 
			
			switch ( firstChoice ) {
			
			case ( "1" ) :
				
				System.out.println("Table RESEARCHER");
				System.out.println("1 ) Insert new record");
				System.out.println("2 ) Delete a record");
				System.out.println("3 ) Update a record");
				System.out.println("4 ) Exit ");
				System.out.println("Choose an operation :)");
				
				secondChoice = input.nextLine() ; 
			break ;
			
			case ( "2" ) :
				
				System.out.println("Table RESEARCHER");
				System.out.println("1 ) Insert new record");
				System.out.println("2 ) Delete a record");
				System.out.println("3 ) Update a record");
				System.out.println("4 ) Exit ");
				System.out.println("Choose an operation :)");
				
				secondChoice = input.nextLine() ; 
				
			break ; 
			
			}
			
			System.out.println("");

			
			///////////////////////////////////////////////////
			
	
			
			if ( firstChoice.equals("1") ) {
				
				switch ( secondChoice ) {
				
				case ( "1" ) :
					researcherInsert() ; 
				break ;
				
				case ( "2" ) :
					researcherDelete() ; 
	
				break ; 
			
				case ( "3" ) :
					resercherUpdate () ;
	
				break ; 
				
				case ( "4" ) :
					check = "4" ; 
				break ; 
				
				}
				
			}
			
			else if ( firstChoice.equals("2") ) {
				
				switch ( secondChoice ) {
				
				case ( "1" ) :
					researcherAwardInsert () ;
				break ;
				
				case ( "2" ) :
					resercherAwardDelete () ; 
				break ; 
				
				case ( "3" ) :
					resercherAwardUpdate () ; 
				break ; 
				
				case ( "4" ) :
					check = "4" ; 
				break ; 
				
				}
				
			}
		
		}
		

	}
	
	

	private static void resercherAwardUpdate() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 
			String awardDate = "" ; 
			String awardAmount = "" ; 
			String awardTitle = "" ; 
			int nbrAttr = 0 ; 
			
			System.out.println("RESEARCHAWARD - UPDATE");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			System.out.println("Input the number of the attribute to be updated ( 4 - 6 ) ( 4 = Award-Date , 5 = Award-Amount , 6 = Award-Title ) :)");
			nbrAttr = input.nextInt() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			

			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	            
	            String sqlUpdate = "" ;
	            
	            if ( nbrAttr == 4 ) {
	            	System.out.println("Input the new Award-Date of the research award obtained by " + firstName + " (MM/DD/YYYY) :)");
	            	input.nextLine();
	            	awardDate = input.nextLine() ; 
	            	sqlUpdate = "update RESEARCHAWARD "  
		            		+ "set AWARD_DATE = '"+awardDate+"' where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            } else if ( nbrAttr == 5 ) {
	            	System.out.println("Input the new Award-Amount of the research award obtained by " + firstName + " :)");
	            	input.nextLine();
	            	awardAmount = input.nextLine() ; 
	            	sqlUpdate = "update RESEARCHAWARD "  
		            		+ "set AWARD_AMOUNT = '"+awardAmount+"' where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            } else if ( nbrAttr == 6 ) {
	            	System.out.println("Input the new Award-Title of the research award obtained by " + firstName + " :)");
	            	input.nextLine();
	            	awardTitle = input.nextLine() ; 
	            	sqlUpdate = "update RESEARCHAWARD "  
		            		+ "set AWARD_TITLE = '"+awardTitle+"' where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            }
	            
	            int countUpdated = 0 ;
	            if ( nbrAttr == 4 || nbrAttr == 5 || nbrAttr == 6 ) {
		            countUpdated = stmt.executeUpdate(sqlUpdate);
	            }
	            
	            if ( countUpdated == 1 ) {
	            	System.out.println("You have Updated One Element ");
	            } 
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }		
	        
	        
			System.out.println("");

	       
	        System.out.print("Update another new record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
	        
			System.out.println("");

		}
	}



	private static void resercherAwardDelete() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 

			
			System.out.println("RESEARCHAWARD - DELETION");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	
	            String sqlDelete = "delete from  RESEARCHAWARD "  
	            		+ "where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            int countDeleted = stmt.executeUpdate(sqlDelete);
	            
	            if ( countDeleted == 1 ) {
	            	System.out.println("You have Deleted One Element ");
	            } 
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }		
	        
	        
			System.out.println("");

	       
	        System.out.print("Delete another new record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
	        
			System.out.println("");

		}
	}



	private static void researcherAwardInsert() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 
			String awardDate = "" ; 
			String awardAmount = "" ; 
			String awardTitle = "" ; 
			
			
			System.out.println("RESEARCHAWARD - INSERTION");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			System.out.println("Input Award-Date (MM/DD/YYYY) :)"); 
			awardDate = input.nextLine() ; 
			
			System.out.println("Input Award-Amount :)");
			awardAmount = input.nextLine() ; 

			System.out.println("Input Award-Title :)");
			awardTitle = input.nextLine() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	
	            String sqlInsert = "insert into  RESEARCHAWARD " 
	            		+ "values ( '" + firstName + "' , '" + middleName + "' , '" + familyName + "' , TO_DATE('" + awardDate + "', 'MM/DD/YYYY') , '" + awardAmount + "' , '" + awardTitle + "'  )";
	            int countInserted = stmt.executeUpdate(sqlInsert);
	            
	            if ( countInserted == 1 ) {
	            	System.out.println("You have Inserted One Element ");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
                System.out.println(e.getErrorCode() );
                System.out.print("There is an error : ");
                if ( e.getErrorCode() == 12899 ) System.out.print("value is too big");
                else if ( e.getErrorCode() == 1 ) System.out.print("primary key can't be duplicated");
                else if ( e.getErrorCode() == 1400 ) System.out.print("null value is not allowed");
                else if ( e.getErrorCode() == 1843 ) System.out.print("the value doesn't match the datatype ( not month ) ");
                else if ( e.getErrorCode() == 1722 ) System.out.print("the value doesn't match the datatype ( not number ) ");
                else if ( e.getErrorCode() == 2291 ) System.out.print("there is no primary key in table researcher with this values ");                
                System.out.println( " << Details >> " + e.getMessage()  );   
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();        
	            }
	        }		
	        
			System.out.println("");

	       
	        System.out.print("Insert a new Record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
			System.out.println("");

	        
		}
		
		
	}



	private static void resercherUpdate() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 
			String mobile = "" ; 
			String email = "" ; 
			int nbrAttr = 0 ; 
			
			System.out.println("RESEARCHER - UPDATE");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			System.out.println("Input the number of the attribute to be updated ( 4 - 5 ) ( 4 = Mobile , 5 = Email ) :)");
			nbrAttr = input.nextInt() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			

			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	            
	            String sqlUpdate = "" ;
	            
	            if ( nbrAttr == 4 ) {
	            	System.out.println("Input the new mobile of the researcher " + firstName + " :)");
	            	input.nextLine();
	            	mobile = input.nextLine() ; 
	            	sqlUpdate = "update RESEARCHER "  
		            		+ "set MOBILE = '"+mobile+"' where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            } else if ( nbrAttr == 5 ) {
	            	System.out.println("Input the new Email of the researcher " + firstName + " :)");
	            	input.nextLine();
	            	email = input.nextLine() ; 
	            	sqlUpdate = "update  RESEARCHER "  
		            		+ "set EMAIL = '"+email+"' where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            }
	            
	            int countUpdated = 0 ;
	            if ( nbrAttr == 4 || nbrAttr == 5 ) {
		            countUpdated = stmt.executeUpdate(sqlUpdate);
	            }
	            
	            if ( countUpdated == 1 ) {
	            	System.out.println("You have Updated One Element ");
	            } 
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }		
	        
	        
			System.out.println("");

	       
	        System.out.print("Update another new record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
	        
			System.out.println("");

		}
		
	}



	private static void researcherDelete() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 

			
			System.out.println("RESEARCHER - DELETION");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	
	            String sqlDelete = "delete from  RESEARCHER "  
	            		+ "where FIRST_NAME = '" + firstName + "' and MIDDLE_NAME = '" + middleName + "' and FAMILLY_NAME = '" + familyName + "' "  ; 
	            int countDeleted = stmt.executeUpdate(sqlDelete);
	            
	            if ( countDeleted == 1 ) {
	            	System.out.println("You have Deleted One Element ");
	            } 
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }		
	        
	        
			System.out.println("");

	       
	        System.out.print("Delete another new record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
	        
			System.out.println("");

		}
		
	}



	private static void researcherInsert() {
		String check = "Y" ; 
		while ( check.equals("Y") || check.equals("y") ) { 
			
			String firstName  = "" ; 
			String middleName = "" ; 
			String familyName = "" ; 
			String mobile = "" ; 
			String email = "" ; 
			
			
			System.out.println("RESEARCHER - INSERTION");
			System.out.println();
			
			System.out.println("Input First-Name :)");
			firstName = input.nextLine(); 
			
			System.out.println("Input Middle-Name :)");
			middleName = input.nextLine() ; 
			
			System.out.println("Input Family-Name :)");
			familyName = input.nextLine() ; 
			
			System.out.println("Input mobile :)"); 
			mobile = input.nextLine() ; 
			
			System.out.println("Input email :)");
			email = input.nextLine() ; 
			
			Connection con = null ; 
			Statement stmt= null ;
			
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	con = DriverManager.getConnection("jdbc:oracle:thin:wadahesam/112233@localhost:1521:xe");
	            stmt = con.createStatement();
	
	            String sqlInsert = "insert into  RESEARCHER "  
	            		+ "values ( '" + firstName + "' , '" + middleName + "' , '" + familyName + "' , '" + mobile + "' , '" + email + "' )";
	            int countInserted = stmt.executeUpdate(sqlInsert);
	            
	            if ( countInserted == 1 ) {
	            	System.out.println("You have Inserted One Element ");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
                System.out.println(e.getErrorCode() );
                System.out.print("There is an error : ");
                if ( e.getErrorCode() == 12899 ) System.out.print("value is too big");
                else if ( e.getErrorCode() == 1 ) System.out.print("primary key can't be duplicated");
                else if ( e.getErrorCode() == 1400 ) System.out.print("null value is not allowed");
                System.out.println( " << Details >> " + e.getMessage()  );   
	        } finally {
	            try {
	                stmt.close();
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();        
	            }
	        }		
	        
	        
			System.out.println("");

	       
	        System.out.print("Insert a new Record ( Y / N ) ? ") ; 
	        check = input.nextLine() ; 
	        
	        
			System.out.println("");

		}
		
		
	}





}
