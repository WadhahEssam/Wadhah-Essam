package gui;
import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class WorkPanel extends JPanel {

	private TextArea textArea ;
	
	public WorkPanel () {
		
		this.setLayout(new BorderLayout () );
		textArea = new TextArea () ;
		this.add(new JScrollPane (textArea), BorderLayout.CENTER );
		
	}
	
	public void append (String text) {
		textArea.append(text);
	}
}