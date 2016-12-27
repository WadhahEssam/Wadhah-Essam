package gui;
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class StudentFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) { 
		if ( file.isDirectory() )                                     // if it is a file directory
			return true ; 
		String fileDir = file.getName();
		String fileExtension = Utils.getFileExtension(fileDir) + ""; // i don't know why i had problems when i didn't put the ""  either giving me error with ( equals() ) or not matching when using ( == ) 
		String stu = "stu" ; 
		
		if (fileExtension.equals(stu)) 
			return true ;                                            // if it is a stu 
		else 
			return false ;		                                     // if it is null or not stu
		
	} 

	@Override
	public String getDescription() {
		return "Student Database Files (*.stu)";
	}

}
