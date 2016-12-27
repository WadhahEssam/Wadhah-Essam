package gui;
import java.util.EventObject;

public class FormEvent extends EventObject {
	
	private String name ; 
	private String oc ; 
	private int ageId ; 
	private String education ;
	private boolean isKSUMember ; 
	private String iD ; 
	private String gender  ;

	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent( Object source , String name , String oc , AgeCategory ageL , String education , boolean isKSUMember , String iD , String gender ) {
		super(source);
		this.name = name ; 
		this.oc = oc ; 
		this.ageId = ageL.getId() ;
		this.education = education;
		this.isKSUMember = isKSUMember ; 
		this.iD = iD ; 
		this.gender = gender ; 
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOc() {
		return oc;
	}

	public void setOc(String oc) {
		this.oc = oc;
	}

	public int getAgeId() {
		return ageId ;
	}

	public void setAgeId(int ageL) {
		this.ageId = ageL  ;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public boolean isKSUMember() {
		return isKSUMember;
	}

	public void setKSUMember(boolean isKSUMember) {
		this.isKSUMember = isKSUMember;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

}
