package gui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
	
	public static void main ( String []arg ) {

		// from what i got   //  it is important that you put your program inside this interface that organize the program specially for the multithreading 
		SwingUtilities.invokeLater(new Runnable(){
			public void run () {
				new MainFrame (); 
			}
		});

	}

}