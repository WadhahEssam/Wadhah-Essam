package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Database {
	
	private static Database database = new Database() ; // just to make sure that i have only one object of this class
	private List<Purchase> purchases ; 
	private Connection con ;
	
	public Database () {
		purchases = new LinkedList<Purchase>() ;
	}
	
	public void addPurchase(Purchase purchase) {
		purchases.add(purchase);
	}
	
	public void deletePurchase (int index){
		purchases.remove(index) ;
	}
	
	/*
	 * in order to connect to database you need to  
	 * 1 ) import the package java.sql.* ;
	 * 2 ) a ) load the driver ( the jar file   and then right click on the project and choose bath build and the config bath build and choose external jar and choose the one you downloaded it 
	 * 2 ) b ) register the drivers >> by using Class.forName("com.mysql.jdbc.Driver") ;
	 * 3 ) Establishing the connection ..... by typing >> Connection con = DriverManger.getConnection ( url >> can be a little bit complicated 	, username >> it is "root" by default , password ) 
	 * 4 ) 
	 * 5 )  
	 * 6 ) 
	 * 7 ) closing the connection can be easly done by using con.close() method
	 */
	
	// method that let you connect to the database  
	public void connect () throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Register the Driver 
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException ("Driver not found"); 
		}
		
		String url = "jdbc:mysql://localhost:3306/gregs_list?autoReconnect=true&useSSL=false" ; //  I got this ( ?autoReconnect=true&useSSL=false ) from the internet and i know what is the rest 
		con = DriverManager.getConnection( url , "root" , "112233" ) ;
		
		System.out.println("Connected " + con ); // indicator that confirm that you r connected to the database you have choosen ; >>> not needed
	}
	
	
	public void disconnect () throws SQLException {
		if ( con != null) {
			con.close();  // closing the database 
		}
	}
	
	public List<Purchase> getPurchases () {
		
		return Collections.unmodifiableList(purchases); 
	}
	
	public void saveToFilex(File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file) ;
		ObjectOutputStream oos = new ObjectOutputStream(fos) ; 

		Purchase[] purchasesArray = purchases.toArray(new Purchase[purchases.size()]);
		oos.writeObject(purchasesArray);
		oos.close();

	}
	
	public void loadFromFile(File file) throws IOException {
		FileInputStream fis = new FileInputStream (file);
		ObjectInputStream ois = new ObjectInputStream (fis) ;
		
		Purchase[] purchaseArray;
		try {
			purchaseArray = (Purchase[]) ois.readObject();
			this.purchases.clear();
			this.purchases.addAll(Arrays.asList(purchaseArray));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();

	}
	
	public static Database getInstance () {
		return database ; 
	}
	
}
