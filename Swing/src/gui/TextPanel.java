package gui;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	private JTextArea textArea ; 
	
	public TextPanel  () {
		
		this.setLayout(new BorderLayout() );
		textArea = new JTextArea () ;
		this.add( new JScrollPane(textArea) , BorderLayout.CENTER );  /// you actually should wrap the textArea to the Scroll bar in order to add one 
		
	}
	
	public void append ( String s ) {
		textArea.append(s);
	}
}
