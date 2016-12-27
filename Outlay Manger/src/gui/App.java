package gui;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
	
	private static MainFrame mainFrame ;
	
	public static void main ( String [] args ) {

		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				mainFrame = new MainFrame () ;
			}
		});
	}
	public static MainFrame getMainFrameInstance () {
		return mainFrame ; 
	}

}
