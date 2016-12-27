import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class TruthTaple {

	private JFrame frame;
	private JTextField textField;
    private JLabel tableText ; 
	public String equation = null ;
	public String text = null ;
	private JTextField tableText1;
	private JTextField tableText2;
	private JTextField tableText4;
	private JTextField tableText3;
	private JTextField tableText5;
	private JTextField tableText7;
	private JTextField tableText6;
	private JTextField tableText9;
	private JTextField tableText8;
	
	public static int line = 1 ; 
	private JButton btnClear;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e ) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TruthTaple window = new TruthTaple();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TruthTaple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static String toNumbers (String equation) {
		
	    char[] arrEquation = equation.toCharArray();
	    
	    for (int i = 0 ; i < arrEquation.length ; i++ ) {
	    	switch (line) {
	    	
	    	case 1 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '0';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '1';
		    		break;
		    	}
		    	break;
		    	
	    	case 2 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '1';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '0';
		    		break;
		    	}
		    	break;
		    	
	    	case 3 :
		    	switch (arrEquation[i]) {
		    	
		    	case 'X' :
		    		arrEquation[i] = '0';
		    	    break;
		    	case 'Y' : 
		    		arrEquation[i] = '1';
		    		break;
		    	case 'Z' :
		    		arrEquation[i] = '0';
		    		break;
		    	case 'x' :
		    		arrEquation[i] = '1';
		    	    break;
		    	case 'y' : 
		    		arrEquation[i] = '0';
		    		break;
		    	case 'z' :
		    		arrEquation[i] = '1';
		    		break;
		    	}
		    	break;
	    	
	    	
    	case 4 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;

    	case 5 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '0';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '1';
	    		break;
	    	}
	    	break;
    	case 6 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;
	    	
	    	
	    case 7 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '0';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '1';
	    		break;
	    	}
	    	break;
	    	
	    case 8 :
	    	switch (arrEquation[i]) {
	    	
	    	case 'X' :
	    		arrEquation[i] = '1';
	    	    break;
	    	case 'Y' : 
	    		arrEquation[i] = '1';
	    		break;
	    	case 'Z' :
	    		arrEquation[i] = '1';
	    		break;
	    	case 'x' :
	    		arrEquation[i] = '0';
	    	    break;
	    	case 'y' : 
	    		arrEquation[i] = '0';
	    		break;
	    	case 'z' :
	    		arrEquation[i] = '0';
	    		break;
	    	}
	    	break;
	    	
	    	}
	    }
	    
	    StringBuilder equation1 = new StringBuilder ("                                                                                       ") ; 
	   
	    for ( int i = 0 ; i < arrEquation.length ; i++ ) {
	    	equation1.setCharAt(i, arrEquation[i]);
	    }
	    String equation12 = equation1.toString();
	    
	    return equation12 ;
	}
	
	private void initialize() {
		 

	    
	    
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAutoRequestFocus(false);
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 659, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setEnabled(false);
		textField.setBounds(46, 29, 551, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(SystemColor.menu);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (text == null ) {
					textField.setText("X");
					text = "X" ;
					equation = "X";
					
				}
				else {
					textField.setText(text + "X");
					text += "X" ;
					equation += "X";
				}
				
			}
		});
		btnX.setBounds(46, 132, 59, 47);
		frame.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBackground(SystemColor.menu);
		btnY.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("Y");
					text = "Y" ;
					equation = "Y";
					
				}
				else {
					textField.setText(text + "Y");
					text += "Y" ;
					equation += "Y";
				}
				
			}
		});
		btnY.setBounds(115, 132, 59, 47);
		frame.getContentPane().add(btnY);
		
		JButton btnXD = new JButton("X'");
		btnXD.setBackground(SystemColor.menu);
		btnXD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnXD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("X'");
					text = "X'" ;
					equation = "x";

					
				}
				else {
					textField.setText(text + "X'");
					text += "X'" ;
					equation += "x";

				}
			}
		});
		btnXD.setBounds(46, 190, 59, 47);
		frame.getContentPane().add(btnXD);
		
		JToggleButton btnYD = new JToggleButton("Y'");
		btnYD.setBackground(SystemColor.menu);
		btnYD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnYD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("Y'");
					text = "Y'" ;
					equation = "y";
					
				}
				else {
					textField.setText(text + "Y'");
					text += "Y'" ;
					equation += "y";

				}
			}
		});
		btnYD.setBounds(115, 190, 59, 47);
		frame.getContentPane().add(btnYD);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBackground(SystemColor.menu);
		btnZ.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("Z");
					text = "Z" ;
					equation = "Z";

					
				}
				else {
					textField.setText(text + "Z");
					text += "Z" ;
					equation += "Z";

				}
			}
		});
		btnZ.setBounds(184, 132, 59, 47);
		frame.getContentPane().add(btnZ);
		
		JButton btnZD = new JButton("Z'");
		btnZD.setBackground(SystemColor.menu);
		btnZD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnZD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("Z'");
					text = "Z'" ;
					equation = "z";

					
				}
				else {
					textField.setText(text + "Z'");
					text += "Z'" ;
					equation += "z";

				}
			}
		});
		btnZD.setBounds(184, 190, 59, 47);
		frame.getContentPane().add(btnZD);
		
		JButton btnB1 = new JButton("(");
		btnB1.setBackground(SystemColor.menu);
		btnB1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("(");
					text = "(" ;
					equation = "(";

					
				}
				else {
					textField.setText(text + "(");
					text += "(" ;
					equation += "(";

				}
			}
		});
		btnB1.setBounds(46, 247, 90, 47);
		frame.getContentPane().add(btnB1);
		
		JButton btnB2 = new JButton(")");
		btnB2.setBackground(SystemColor.menu);
		btnB2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText(")");
					text = ")" ;
					equation = ")";

					
				}
				else {
					textField.setText(text + ")");
					text += ")" ;
					equation += ")";

				}
			}
		});
		btnB2.setBounds(153, 247, 90, 47);
		frame.getContentPane().add(btnB2);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(SystemColor.menu);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("*");
					text = "*" ;
					equation = "*";

					
				}
				else {
					textField.setText(text + "*");
					text += "*" ;
					equation += "*";

				}
			}
		});
		btnMul.setBounds(46, 299, 90, 47);
		frame.getContentPane().add(btnMul);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(SystemColor.menu);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == null ) {
					textField.setText("+");
					text = "+" ;
					equation = "+";

					
				}
				else {
					textField.setText(text + "+");
					text += "+" ;
					equation += "+";

				}
			}
		});
		btnPlus.setBounds(153, 299, 90, 47);
		frame.getContentPane().add(btnPlus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(SystemColor.window);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tableText1.setText(" X | Y | Z |   F(X,Y,Z) "); 
				
			    ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");

			    for ( int i = 0 ; i < 9 ; i ++ ){
				    String equation2 = toNumbers(equation); 
				    
					switch (line) {
					
					case 1 : 
			     	    try {
							tableText2.setText(" 0 | 0 | 0 |        " + (((int)engine.eval(equation2)>0)?1:0 ) );
						} catch (ScriptException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}

					    break;
				
					case 2 :
						try {
							tableText3.setText(" 0 | 0 | 1 |        " + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e7) {
							// TODO Auto-generated catch block
							e7.printStackTrace();
						}

					    
					case 3 :
						try {
							tableText4.setText(" 0 | 1 | 0 |        " + + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e6) {
							// TODO Auto-generated catch block
							e6.printStackTrace();
						}

					    
					case 4 :
						try {
							tableText5.setText(" 0 | 1 | 1 |        " + + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e5) {
							// TODO Auto-generated catch block
							e5.printStackTrace();
						}
	
					    
					case 5 :
						try {
							tableText6.setText(" 1 | 0 | 0 |        " +  (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}

						
					    
					case 6 :
						try {
							tableText7.setText(" 1 | 0 | 1 |        " + + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
					 
					    
					case 7 :
						try {
							tableText8.setText(" 1 | 1 | 0 |        " + + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
				
					case 8 :
						try {
							tableText9.setText(" 1 | 1 | 1 |        " +  + (((int)engine.eval(equation2)>0)?1:0 ));
						} catch (ScriptException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					}
				    line++;
			    }
				
				
				
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEqual.setBounds(282, 221, 90, 99);
		frame.getContentPane().add(btnEqual);
		
		tableText1 = new JTextField();
		tableText1.setForeground(new Color(0, 0, 0));
		tableText1.setBackground(UIManager.getColor("Button.disabledShadow"));
		tableText1.setEnabled(false);
		tableText1.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText1.setText(" X | Y | Z |   F(X,Y,Z) ");
		tableText1.setBounds(403, 110, 194, 32);
		frame.getContentPane().add(tableText1);
		tableText1.setColumns(10);
		
		tableText2 = new JTextField();
		tableText2.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText2.setEnabled(false);
		tableText2.setColumns(10);
		tableText2.setBounds(403, 153, 194, 32);
		frame.getContentPane().add(tableText2);
		
		tableText4 = new JTextField();
		tableText4.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText4.setEnabled(false);
		tableText4.setColumns(10);
		tableText4.setBounds(403, 227, 194, 32);
		frame.getContentPane().add(tableText4);
		
		tableText3 = new JTextField();
		tableText3.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText3.setEnabled(false);
		tableText3.setColumns(10);
		tableText3.setBounds(403, 190, 194, 32);
		frame.getContentPane().add(tableText3);
		
		tableText5 = new JTextField();
		tableText5.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText5.setEnabled(false);
		tableText5.setColumns(10);
		tableText5.setBounds(403, 265, 194, 32);
		frame.getContentPane().add(tableText5);
		
		tableText7 = new JTextField();
		tableText7.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText7.setEnabled(false);
		tableText7.setColumns(10);
		tableText7.setBounds(403, 339, 194, 32);
		frame.getContentPane().add(tableText7);
		
		tableText6 = new JTextField();
		tableText6.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText6.setEnabled(false);
		tableText6.setColumns(10);
		tableText6.setBounds(403, 302, 194, 32);
		frame.getContentPane().add(tableText6);
		
		tableText9 = new JTextField();
		tableText9.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText9.setEnabled(false);
		tableText9.setColumns(10);
		tableText9.setBounds(403, 413, 194, 32);
		frame.getContentPane().add(tableText9);
		
		tableText8 = new JTextField();
		tableText8.setFont(new Font("Tahoma", Font.BOLD, 17));
		tableText8.setEnabled(false);
		tableText8.setColumns(10);
		tableText8.setBounds(403, 376, 194, 32);
		frame.getContentPane().add(tableText8);
		
		btnClear = new JButton("Clear");
		btnClear.setBackground(SystemColor.menu);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = null ; 
				textField.setText("");
				line = 1 ; 
				tableText2.setText("");
				tableText3.setText("");
				tableText4.setText("");
				tableText5.setText("");
				tableText6.setText("");
				tableText7.setText("");
				tableText8.setText("");
				tableText9.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(46, 357, 197, 60);
		frame.getContentPane().add(btnClear);
		

	}
}
