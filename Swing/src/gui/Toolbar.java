package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener  {
	
	private JButton btn ; 
	private JButton btn1 ; 
	private TextPanel mainTextPanel ;
	private StringListener stringListener ; // if you want to make a lot of action listeners   , you can do an array list of it here 
	
	public Toolbar () {
		
		btn = new JButton ( " hello " );
		btn.addActionListener(this); 
		btn1 = new JButton ( " Good Bye " ) ;
		btn1.addActionListener(this);

		
		this.setLayout(new FlowLayout(FlowLayout.LEFT) );
		this.add(btn);
		this.add(btn1);
		this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
	}
	
	public void setStringListener ( StringListener listener ) {
		this.stringListener = listener ; 
	}


	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == btn ) { // getSoource returns the object that called this method 
		    if ( stringListener != null ) {
		    	stringListener.append("Hello\n");
		    }
		}
		else 
		    if ( stringListener != null ) {
		    	stringListener.append("Good Bye\n");
		    }
		
	}

}
