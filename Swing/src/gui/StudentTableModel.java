package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Student;

public class StudentTableModel extends AbstractTableModel {

	private List<Student> database ; 
	private String[] colNames = { "ID" , "Name"  , "Occupation" , "Age" , "Education" , "KSU Member ?" , "KSU ID" , "Gender" } ;
	
	// this method is getting the info from the table panel which got it from the main frame  , which got it from the controller which got it from the database class
	public void setData (List<Student> database ){
		this.database = database ;  
	}
	
	@Override
	public int getColumnCount() {
		return 8;
	}

	@Override
	public int getRowCount() {
		return database.size(); // number of objects inside the list
	}

	@Override
	public Object getValueAt(int row, int col) {
		Student s = database.get(row) ; // gives you the object inside the (row) index 

		switch (col) {
		case 0 : 
			return s.getiD() ; 
		case 1 : 
			return s.getName() ; 
		case 2 : 
			return s.getOccupation() ;
		case 3 : 
			return s.getAge() ; 
		case 4 :
			return s.getEducation() ;
		case 5 : 
			return s.isKSUMember() ; 
		case 6 : 
			return s.getkSUID() ; 
		case 7 : 
			return s.getGender() ; 
		}
		return null; // this is not going to be happening but it is just for switch
	}

	@Override
	public String getColumnName(int column) {
		return colNames[column];
	}

}
