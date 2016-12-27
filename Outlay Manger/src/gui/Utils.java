package gui;

public class Utils { 
	public static String getFileExtension (String fileDir) {
		
		int pointIndex = fileDir.lastIndexOf('.');
		if ( pointIndex == -1 )                                    // if it is a file or has no extension 
			return null ; 
		
		else if ( pointIndex == fileDir.length()-1 )                           // if it has no extension
			return null ;
		
		else 
			return fileDir.substring( pointIndex+1 , fileDir.length() );      // returns the extension 
	}
}
