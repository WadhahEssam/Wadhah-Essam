package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.sql.*;

public class Database {
	
	private List<Student> students ; 
	private Connection con  ;
	public Database () {
		students = new LinkedList<Student>() ;  // cuz you can add and remove items in the middle of this list 
	}

	public void addStudent ( Student student ) {
		students.add(student) ; 
	}
	
	public void deleteStudent ( int index ) {
		students.remove(index);
	}
	
	public void connect () throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/gregs_list?autoReconnect=true&useSSL=false" ; 
		con = DriverManager.getConnection(url,"root","112233") ; 
		
		System.out.println("Connected");
	}
	
	public void disconnect () throws SQLException {
		if ( con != null ) {
			con.close(); 
			System.out.println("Database has been cloesd");
		}
	}
	
	public void save () { // saving all the students into the database
		
		for ( Student student : students) {
			
		}
	}
	
	public List<Student> getStudents () {
		return Collections.unmodifiableList(students) ; // so no one can modify this list rather than this class
	}
	
	/////// just for testing I can delete it any time 
	public void printAll () {
		for (Student student : students ) {
			student.printStudentInfo();
		}
	}
	
	public void saveToFile ( File file ) throws IOException {
		System.out.println(file + "database");
		FileOutputStream fos = new FileOutputStream ( file ) ;
		ObjectOutputStream oos = new ObjectOutputStream ( fos ) ;
		
		Student[] studentArray = students.toArray(new Student[students.size()]) ; // the way to change an array list into an array 
		oos.writeObject(studentArray);
		
		oos.close();
		System.out.println("done");
	}
	
	public void loadFromFile ( File file ) throws IOException {
		FileInputStream fis = new FileInputStream (file ) ; 
		ObjectInputStream ois = new ObjectInputStream ( fis ) ; 
		
		try {
			Student[] studentArray = (Student[]) ois.readObject();
			students.clear();  
			students.addAll(Arrays.asList(studentArray)) ; // changing the array back into an array list to load it into the program 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ois.close();
	}
}
