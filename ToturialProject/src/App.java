import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class App {

	private static JFrame mainFrame ; 
	private static JPanel panel , buttonsPanel ; 
	private static JButton calculate , exit ;  
	private static JTextField circleR , rectangleL , rectangleW , squareS , result ;  
	private static JRadioButton circle , rectangle , square ; 
	private static JLabel radius , length , width , side , resultLabel ;
	
	public static void main (String[] args) {
		
		/////////////////////////// instantiation /////////////////////
		/// creating base
		mainFrame = new JFrame ("Area Calculator"); 
		panel = new JPanel () ;
		buttonsPanel = new JPanel () ;
		/// creating Buttons 
		calculate = new JButton ("Calculate") ; 
		exit = new JButton ("Exit") ; 
		/// creating Fields
		circleR = new JTextField(10);
		rectangleL = new JTextField(10);
		rectangleW = new JTextField(10);
		squareS = new JTextField(10);
		result = new JTextField(10);
		/// creating radioes
		circle = new JRadioButton ("Circle");
		circle.setActionCommand("circle");
		rectangle = new JRadioButton ("Rectangle");
		rectangle.setActionCommand("rectangle");
		square = new JRadioButton ("Square");
		square.setActionCommand("square");
		// creating Labels 
		radius = new JLabel ( "Radius" ); 
		length = new JLabel ( "Length" ); 
		width = new JLabel ( "Width" ); 
		side = new JLabel ( "Side" ); 
		resultLabel = new JLabel ( "Result" );
		///////////////////////////////////////////////////////////////
		
		////////////////////////// Layout /////////////////////////////
		mainFrame.setLayout( new BorderLayout () );
		mainFrame.add( panel , BorderLayout.CENTER ); 
		mainFrame.add(buttonsPanel, BorderLayout.SOUTH);
		
		panel.setLayout(new GridBagLayout());
		buttonsPanel.setLayout( new FlowLayout (FlowLayout.CENTER) );
		GridBagConstraints gc = new GridBagConstraints() ; 
		
		// constants 
		int labelSpacing = 10 ; 
		int resultSpacing  = 40  ;
		//////// designing
		gc.fill = GridBagConstraints.NONE ; 
		gc.gridheight = 1 ;
		gc.gridwidth = 1 ; 
		// firstLine
		gc.gridy = 0 ;
		gc.gridx = 0 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(circle, gc);
		// nextLine 
		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,labelSpacing);
		panel.add(radius , gc) ; 
		gc.gridx = 2 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(circleR , gc ) ; 
		// nextLine
		gc.gridy++ ; 
		gc.gridx = 0 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(rectangle, gc);
		// nextLine
		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,labelSpacing);
		panel.add(length , gc) ; 
		gc.gridx = 2 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(rectangleL , gc ) ; 
		// nextLine
		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.insets = new Insets(10,0,0,labelSpacing);
		panel.add(width , gc) ; 
		gc.gridx = 2 ; 
		gc.insets = new Insets(10,0,0,0);
		panel.add(rectangleW , gc ) ; 
		// nextLine 
		gc.gridy++ ; 
		gc.gridx = 0 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(square, gc);
		// nextLine
		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,labelSpacing);
		panel.add(side , gc) ; 
		gc.gridx = 2 ; 
		gc.insets = new Insets(0,0,0,0);
		panel.add(squareS , gc ) ; 
		// nextLine
		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.insets = new Insets(resultSpacing,0,0,labelSpacing);
		panel.add(resultLabel , gc) ; 
		gc.gridx = 2 ; 
		gc.insets = new Insets(resultSpacing,0,0,0);
		panel.add(result , gc ) ; 
		
		
		buttonsPanel.add(calculate);
		buttonsPanel.add(exit);
		
		//////////////////// radioButtons ////////////////////
		ButtonGroup group = new ButtonGroup() ; 
		group.add(circle);
		group.add(rectangle);
		group.add(square);
		
		circle.setSelected(true);
		
		setMainframe () ;
		//////////////////// adding action listeners /////////
		exit.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		calculate.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{
					if ( group.getSelection().getActionCommand().equals("circle")){
						double area = 3.14 * Math.pow(Double.parseDouble(circleR.getText()), 2) ; 
						result.setText(area + "");
					} else if ( group.getSelection().getActionCommand().equals("rectangle") ) {
						double area = Double.parseDouble(rectangleL.getText()) * Double.parseDouble(rectangleW.getText()) ; 
						result.setText(area + "");
					} else if ( group.getSelection().getActionCommand().equals("square") ) {
						double area = Double.parseDouble(squareS.getText()) * Double.parseDouble(squareS.getText()) ; 
						result.setText(area + "");
					}
				} catch ( Exception ex ) {
					JOptionPane.showMessageDialog(mainFrame , "Please enter valid values" );
				}

			}
		});
		
	}

	private static void setMainframe() {
		mainFrame.setSize(300, 350);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
