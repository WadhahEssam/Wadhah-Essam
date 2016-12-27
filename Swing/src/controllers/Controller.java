package controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import gui.FormEvent;
import model.AgeCategory;
import model.Database;
import model.EducationCategory;
import model.Gender;
import model.Student;

public class Controller {

	Database database ;
	
	public Controller () {
		// this is the only database that has been created in the whole program ( maybe i can make it a singleton in  the future )  
		database = new Database () ;
	}
	
	/////////////////////// this is going to be done when the OK button is clicked
	public void addStudent( FormEvent e ) {
		String name = e.getName() ; 
		String occupation = e.getOc() ;
		int ageId = e.getAgeId() ; 
		String education = e.getEducation() ; 
		boolean isKSUMember = e.isKSUMember() ; 
		String kSUID = e.getiD() ;
		String isMale = e.getGender() ; 
		
		AgeCategory ageCat = null ;
		EducationCategory educationCat = null ; 
		Gender genderCat = null ; 

		switch (ageId) {
		case 0 : 
			ageCat = AgeCategory.CHILD ; 
			break ;
		case 1 : 
			ageCat = AgeCategory.ADULT ; 
			break ; 
		case 2 : 
			ageCat = AgeCategory.SENIOR ; 
			break ;
		}
		
		switch (education) {
		case "Elementry" :
			educationCat = EducationCategory.ELEMENTRY ;
			break ; 
		case "High School" :
			educationCat = EducationCategory.HIGHSCHOOL ; 
			break ; 
		case "Collage" :
			educationCat = EducationCategory.COLLAGE ; 
			break ; 
		}
		
		if (isMale == "Male" ) 
			genderCat = Gender.MALE ;
		else 
			genderCat = Gender.FEMALE ; 

		Student student = null ; 
		if ( isKSUMember ) 
			student = new Student ( name , occupation , ageCat , educationCat , isKSUMember , kSUID , genderCat ) ;
		else 
			student = new Student ( name , occupation , ageCat , educationCat , isKSUMember , null , genderCat ) ;
		
		database.addStudent(student);
		
	}
	
	// this method is used to pass the information of the array list into the class that want to use it ( this class should have an instance of this class ) 
	public List<Student> getStudents () {
		return database.getStudents() ; 
	}
	
	public void saveToFile (File file) throws IOException {  // a connection between the database class and the main frame ( back end and front end ) 
		database.saveToFile(file);
	}
	public void loadFromFile (File file) throws IOException {
		database.loadFromFile(file);
	}
	
	public void deleteStudent ( int index ) {
		database.deleteStudent(index);
	}
}
