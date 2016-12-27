package model;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L; // not really needed
	
	private static int count = 0 ; 
	private int iD ; 
	private String name ; 
	private String occupation ; 
	private AgeCategory age ; 
	private EducationCategory education ;
	private boolean isKSUMember ;
	private String kSUID ;
	private Gender gender ;
	
	public Student( String name, String occupation, AgeCategory age, EducationCategory education, boolean isKSUMember , String kSUID,
			Gender gender) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
		this.education = education;
		this.isKSUMember = isKSUMember; 
		this.kSUID = kSUID;
		this.gender = gender;
		this.iD = count ; 
		count++ ;
	}
	
	//////////////////// getters and setters ///////////////////
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public AgeCategory getAge() {
		return age;
	}
	public void setAge(AgeCategory age) {
		this.age = age;
	}
	public EducationCategory getEducation() {
		return education;
	}
	public void setEducation(EducationCategory education) {
		this.education = education;
	}
	public boolean isKSUMember() {
		return isKSUMember;
	}
	public void setKSUMember(boolean isKSUMember) {
		this.isKSUMember = isKSUMember;
	}
	public String getkSUID() {
		return kSUID;
	}
	public void setkSUID(String kSUID) {
		this.kSUID = kSUID;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	///////////// just for testing I can delete it any time I want 
	public void printStudentInfo () {
		System.out.println("name : " + name + "ID :" + kSUID );
	}
}
