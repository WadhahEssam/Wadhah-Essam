import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame implements ActionListener {

	
	private JLabel firstValue ; 
	private JLabel secondValue ; 
	private JLabel result ;
	private JTextField firstNumField ; 
	private JTextField secondNumField ; 
	private JTextField resultField ; 
	private JPanel fieldsPanel ; 
	private JPanel buttonsPanel ;
	private JButton sum ; 
	private JButton sub ; 
	private JButton mul ; 
	private JButton div ; 
	private JButton reset ; 
	private JButton quit ; 
	
	CalculatorFrame ( String title ) {
		super (title) ; 
		firstValue = new JLabel ( "Enter The First Value : ") ;
		secondValue = new JLabel ( "Enter The Second Value : ") ; 
		result = new JLabel ( "Result : " ) ; 
		firstNumField = new JTextField (10) ; 
		secondNumField = new JTextField (10) ; 
		resultField = new JTextField (10) ; 
		fieldsPanel = new JPanel () ;
		buttonsPanel = new JPanel () ;
		sum = new JButton ("+") ; 
		sub = new JButton ("-") ; 
		mul = new JButton ("*") ; 
		div = new JButton ("/") ; 
		reset = new JButton ("reset") ; 
		quit = new JButton ("quit") ; 
		
		this.setLayout(new BorderLayout()) ; 
		this.add(fieldsPanel , BorderLayout.NORTH); 
		this.add(buttonsPanel , BorderLayout.CENTER );
		
		fieldsPanel.setLayout(new FlowLayout (FlowLayout.CENTER) );	
		fieldsPanel.setPreferredSize(new Dimension (100,130));
		fieldsPanel.add(firstValue);
		fieldsPanel.add(firstNumField);
		fieldsPanel.add(secondValue);
		fieldsPanel.add(secondNumField);
		fieldsPanel.add(result);
		fieldsPanel.add(resultField);
		
		buttonsPanel.setLayout(new FlowLayout (FlowLayout.CENTER) ); 
		buttonsPanel.add(sum);
		buttonsPanel.add(sub);
		buttonsPanel.add(mul);
		buttonsPanel.add(div);
		buttonsPanel.add(reset);
		buttonsPanel.add(quit);
		
		/////////////////// adding listeners /////////////////////
		this.quit.addActionListener(this);
		this.reset.addActionListener(this);
		this.sum.addActionListener(this);
		this.div.addActionListener(this);
		this.mul.addActionListener(this);
		this.sub.addActionListener(this);
		//////////////////////////////////////////////////////////
		
		this.setVisible(true) ; 
		this.setSize(750 , 300);
		this.setResizable(false);
		
	}
	
	public void actionPerformed ( ActionEvent e ) {
		if (e.getSource().equals(quit)){
			System.exit(0);
		}
		else if ( e.getSource().equals(reset) ){ 
			this.firstNumField.setText("");
			this.secondNumField.setText("");
			this.resultField.setText("");
		}
		else if ( e.getSource().equals(sum) ) {
			try {
			int num1 = Integer.parseInt(this.firstNumField.getText());
			int num2 = Integer.parseInt(this.secondNumField.getText()); 
			int result = num1 + num2 ; 
			this.resultField.setText(result + "");
			} catch (Exception ex ) {
				JOptionPane.showMessageDialog(CalculatorFrame.this, "You Shoud Enter Numbers ");
			}
		}
		else if ( e.getSource().equals(sub) ) {
			try {
			int num1 = Integer.parseInt(this.firstNumField.getText());
			int num2 = Integer.parseInt(this.secondNumField.getText()); 
			int result = num1 - num2 ; 
			this.resultField.setText(result + "");
			} catch (Exception ex ) {
				JOptionPane.showMessageDialog(CalculatorFrame.this, "You Shoud Enter Numbers ");
			}
		}
		else if ( e.getSource().equals(mul) ) {
			try {
			int num1 = Integer.parseInt(this.firstNumField.getText());
			int num2 = Integer.parseInt(this.secondNumField.getText()); 
			int result = num1 * num2 ; 
			this.resultField.setText(result + "");
			} catch (Exception ex ) {
				JOptionPane.showMessageDialog(CalculatorFrame.this, "You Shoud Enter Numbers ");
			}
		}
		else if (e.getSource().equals(div) ){
			try {
			int num1 = Integer.parseInt(this.firstNumField.getText());
			int num2 = Integer.parseInt(this.secondNumField.getText()); 
			int result = num1 / num2 ; 
			this.resultField.setText(result + "");
			} catch (Exception ex ) {
				JOptionPane.showMessageDialog(CalculatorFrame.this, "You Shoud Enter Numbers ");
			}
		}
	}
}
