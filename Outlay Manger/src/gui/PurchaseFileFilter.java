package gui;
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PurchaseFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) {
		// checking if it is a folder not a file 
		if (file.isDirectory()){
			return true ;
		}
		
		String fileDir = file.getName() ;
		String fileExtension = Utils.getFileExtension(fileDir) + "";    // i don't know why i had problems when i didn't put the ""  either giving me error with ( equals() ) or not matching when using ( == ) 
		if (fileExtension.equals("pur")){
			return true;
		} else {
			return false ;
		}
	}

	@Override
	public String getDescription() {
		return "Purchasing Data (.pur)";
	}

}
