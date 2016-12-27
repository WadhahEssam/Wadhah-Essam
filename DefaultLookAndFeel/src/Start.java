import javax.swing.* ; 
public class Start {

	public static void main ( String [] args ) {
		
		/////// i should only take this code and but it in the main ///////
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e ) {
			e.printStackTrace();
		}
		//////////////////////////////////////////////////////////////////
		
		
		JFrame window = new JFrame ( "Look And Feel") ;
		window.setVisible(true); 
		window.setSize(500 , 500); 
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel () ;
		window.add(panel) ; 
		
		JButton button = new JButton ( "Look And Feel" ) ; 
		panel.add(button) ; 
		JProgressBar pb = new JProgressBar () ;
		pb.setValue(75);
		panel.add(pb);
	}
}
