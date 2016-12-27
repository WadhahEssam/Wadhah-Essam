import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {

	private JFrame frame;
	private JTextField mainTextBox;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonEqual;
	private JButton buttonSum;
	private JButton buttonDiv;
	private JButton buttonSub;
	private JButton buttonMul;
	private JButton buttonDot;
	private double num1;
	private double num2;
	private String textBox;
	private String opr = "done" ;
	private boolean c = false ; 
	private JButton buttonCE;
	private double ans ;
	private JLabel lblNewLabel ;
	
	
	private void checkDone () {
		if ( opr == "done" || opr == "load"){
			num1=0 ;
			num2=0 ; 
			ans = 0 ;
			opr = null ;
			textBox = null;
			mainTextBox.setText("0");
			lblNewLabel.setText("@ Wadah Esam");
		}
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		frame.setAutoRequestFocus(false);
		frame.getContentPane().setBackground(SystemColor.window);
		
		mainTextBox = new JTextField();
		mainTextBox.setBounds(10, 11, 261, 54);
		mainTextBox.setText("0");
		mainTextBox.setHorizontalAlignment(SwingConstants.LEFT);
		mainTextBox.setForeground(new Color(255, 255, 255));
		mainTextBox.setBackground(new Color(165, 42, 42));
		mainTextBox.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 36));
		mainTextBox.setEnabled(true);
		mainTextBox.setEditable(false);
		mainTextBox.setColumns(10);
		
		button1 = new JButton("1");
		button1.setForeground(new Color(139, 0, 0));
		button1.setBounds(10, 107, 45, 54);
		button1.setBackground(new Color(240, 128, 128));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "1");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "1" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button1.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		
		button2 = new JButton("2");
		button2.setForeground(new Color(139, 0, 0));
		button2.setBounds(65, 107, 45, 54);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				checkDone();
				
			    if ( textBox == null ) {
					textBox = ( "2");
					mainTextBox.setText(textBox);
				}
			    else {
			    	textBox = ( textBox +"2" );
			    	mainTextBox.setText(textBox);
			    }
				
			}
		});
		button2.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button2.setBackground(new Color(240, 128, 128));
		
		button3 = new JButton("3");
		button3.setForeground(new Color(139, 0, 0));
		button3.setBounds(120, 107, 45, 54);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "3");
					mainTextBox.setText(textBox);
				}
			    else { 
			    	textBox = ( textBox +"3" );
					mainTextBox.setText(textBox);
			    }
			}
		});
		button3.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button3.setBackground(new Color(240, 128, 128));
		
		button4 = new JButton("4");
		button4.setForeground(new Color(139, 0, 0));
		button4.setBounds(10, 169, 45, 54);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "4");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "4" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button4.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button4.setBackground(new Color(240, 128, 128));
		
		button5 = new JButton("5");
		button5.setForeground(new Color(139, 0, 0));
		button5.setBounds(65, 169, 45, 54);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "5");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "5" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button5.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button5.setBackground(new Color(240, 128, 128));
		
		button6 = new JButton("6");
		button6.setForeground(new Color(139, 0, 0));
		button6.setBounds(120, 169, 45, 54);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "6");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "6" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button6.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button6.setBackground(new Color(240, 128, 128));
		
		button7 = new JButton("7");
		button7.setForeground(new Color(139, 0, 0));
		button7.setBounds(10, 231, 45, 54);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkDone();
				
				if ( textBox == null ) {
				textBox = ( "7");
				mainTextBox.setText(textBox);
			}
			else { 
				textBox = ( textBox + "7" );
			   mainTextBox.setText(textBox);
			}
			
			}
		});
		button7.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button7.setBackground(new Color(240, 128, 128));
		
		button8 = new JButton("8");

		button8.setForeground(new Color(139, 0, 0));
		button8.setBounds(65, 231, 45, 54);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "8");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "8" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button8.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button8.setBackground(new Color(240, 128, 128));
		
		button9 = new JButton("9");		
		button9.setForeground(new Color(139, 0, 0));
		button9.setBounds(120, 231, 45, 54);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					textBox = ( "9");
					mainTextBox.setText(textBox);
				}
				else { 
					textBox = ( textBox + "9" );
				   mainTextBox.setText(textBox);
				}
				
			}
		});
		button9.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button9.setBackground(new Color(240, 128, 128));
		
		button0 = new JButton("0");
		button0.setForeground(new Color(139, 0, 0));
		button0.setBounds(65, 293, 100, 39);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkDone();
				
				if ( textBox == null ) {
					mainTextBox.setText("0");
				}
				
				// „ ⁄œ„œ ÌﬂÊ‰ ›«÷Ì
				
				else if (textBox == "0") {
					
				}
				
				else { 
					textBox = ( textBox + "0" );
				   mainTextBox.setText(textBox);
				}
				

				
			}
		});
		button0.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		button0.setBackground(new Color(240, 128, 128));
		
		buttonDot = new JButton(".");
		buttonDot.setForeground(new Color(139, 0, 0));
		buttonDot.setBounds(10, 293, 45, 39);
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if ( textBox == null ) {
					textBox = ( "0.");
					mainTextBox.setText(textBox);
				}
			    else { 
			    	if ( mainTextBox.getText().indexOf(".") < 0  ){
			    		textBox = ( textBox +"." );
						mainTextBox.setText(textBox);
			    	}		    	
			    }
				
			}
		});
		buttonDot.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 32));
		buttonDot.setBackground(new Color(240, 128, 128));
		
		buttonEqual = new JButton("=");
		buttonEqual.setBounds(10, 343, 197, 47);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						textBox = null ;
						opr = "load" ;
					}
					
					else if ( opr == "sum" ) {
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2;
						mainTextBox.setText(ans + "");
						opr = "done";
			    	}
				
									
					////////////////////////////////////////////////////////////
					
					else if  ( opr == "sub1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans - num2 ;
						mainTextBox.setText(ans + "");
						textBox = null ;
						opr = "load" ;
					}
					else if ( opr == "sub" ) {
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 - num2;
						mainTextBox.setText(ans + "");
						opr = "done";
					}
					
					////////////////////////////////////////////////////////////////
					
					else if  ( opr == "mul1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans * num2 ;
						mainTextBox.setText(ans + "");
						textBox = null ;
						opr = "load" ;
					}
					else if ( opr == "mul" ) {
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 * num2;
						mainTextBox.setText(ans + "");
						opr = "done";
					}
					
					////////////////////////////////////////////////////////////////
					
					else if  ( opr == "div1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans / num2 ;
						mainTextBox.setText(ans + "");
						textBox = null ;
						opr = "load" ;
					}
					else if ( opr == "div" ) {
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 / num2;
						mainTextBox.setText(ans + "");
						opr = "done";
					}
					
					////////////////////////////////////////////////////////////////
					
					int ansInt = (int) ans ; 		
					if (  ans - ansInt  == 0  ) {
						mainTextBox.setText( ansInt + "");	
					}
					
					if ( ansInt == 551292881 ) {
						lblNewLabel.setText("What !! How !?");
					}
					
					c = true ; 
					
					
					
					
			}
		});
		buttonEqual.setForeground(new Color(255, 255, 255));
		buttonEqual.setFont(new Font("Monospaced", Font.BOLD, 18));
		buttonEqual.setBackground(new Color(128, 0, 0));
		
		buttonMul = new JButton("X");
		buttonMul.setBounds(175, 107, 45, 54);
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   try {
					
					if ( opr == "mul" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 * num2 ;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;

						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
						
					}
					
					else if ( opr == "mul1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans * num2 ;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;

						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
						
					}
					
					else if ( opr == "load" ) {
						mainTextBox.setText("");
						textBox = null ;
						opr = "mul1" ;
					}
					
					/////////////////////////////////////////////////////////////////////////////////

					else if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "sum" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					

					else if ( opr == "sub" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 - num2 - ans;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
               	 else if ( opr == "sub1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans - num2 ;
						mainTextBox.setText(ans + "");
						opr = "mul1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
                	 
					else if ( opr == "div" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "mul1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
 					
 					else if ( opr == "div1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "mul1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
                	 

					/////////////////////////////////////////////////////////////////////////////////
					
					 else {						
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "mul";
						textBox = null; 
						mainTextBox.setText("0");
					}
					

					
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! RESTART YOUT CALCULATION ");
					num1=0 ;
					num2=0 ; 
					ans = 0 ;
					opr = null ;
					textBox = null;
					mainTextBox.setText("0");

				}
			}
		});
		buttonMul.setForeground(Color.WHITE);
		buttonMul.setFont(new Font("Dialog", Font.BOLD, 15));
		buttonMul.setBackground(new Color(128, 0, 0));
		
		buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                try {
					
					if ( opr == "div" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 / num2 ;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "div1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans / num2 ;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "load" ) {
						mainTextBox.setText("");
						textBox = null ;
						opr = "div1" ;
					}
					///////////////////////////////////////////////////////////////////////////////////////

					else if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "sum" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					

					else if ( opr == "sub" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 - num2 - ans;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
               	 else if ( opr == "sub1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans - num2 ;
						mainTextBox.setText(ans + "");
						opr = "div1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
                	 
                	 
 					else if ( opr == "mul" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "div1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
 					
 					else if ( opr == "mul1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "div1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
					///////////////////////////////////////////////////////////////////////////////////////
					

					
					 else {						
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "div";
						textBox = null; 
						mainTextBox.setText("0");	
					}
					
					
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! RESTART YOUT CALCULATION ");
					num1=0 ;
					num2=0 ; 
					ans = 0 ;
					opr = null ;
					textBox = null;
					mainTextBox.setText("0");
				}
			}
		});
		buttonDiv.setBounds(228, 107, 43, 54);
		buttonDiv.setForeground(Color.WHITE);
		buttonDiv.setFont(new Font("Dialog", Font.BOLD, 15));
		buttonDiv.setBackground(new Color(128, 0, 0));
		
		buttonSub = new JButton("-");
		buttonSub.setBounds(228, 169, 43, 116);
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 try {
                	 
                	 if ( opr == "sub" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 - num2 - ans;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
                	 else if ( opr == "sub1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans - num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
					
					
					else if ( opr == "load" ) {
						mainTextBox.setText("");
						textBox = null ;
						opr = "sub1" ;
					}
                	 
                	 ///////////////////////////////////////////////////////////////////////////
					else if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sub1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "sum" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sub1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
                	 
					else if ( opr == "div" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
 					
 					else if ( opr == "div1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
                	 
 					else if ( opr == "mul" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
 					
 					else if ( opr == "mul1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sub1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
                	 
					///////////////////////////////////////////////////////////////////////////////
					 else {						
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "sub";
						textBox = null; 
						mainTextBox.setText("0");
					}
                	 
					
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! RESTART YOUT CALCULATION ");
					num1=0 ;
					num2=0 ; 
					ans = 0 ;
					opr = null ;
					textBox = null;
					mainTextBox.setText("0");
				}
			}
		});
		buttonSub.setForeground(Color.WHITE);
		buttonSub.setFont(new Font("Dialog", Font.BOLD, 15));
		buttonSub.setBackground(new Color(128, 0, 0));
		
		buttonSum = new JButton("+");
		buttonSum.setBounds(175, 169, 45, 116);
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					

					 if ( opr == "sum" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
					
					else if ( opr == "load" ) {
						mainTextBox.setText("");
						textBox = null ;
						opr = "sum1" ;
					}
					
					/////////////////////////////////////////////////////////////////////////////////
					

					else if ( opr == "sub" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 - num2 - ans;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
               	 else if ( opr == "sub1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = ans - num2 ;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
						
						int ansInt = (int) ans ; 		
						if (  ans - ansInt  == 0  ) {
							mainTextBox.setText( ansInt + "");	
						}
					}
                	 
					else if ( opr == "div" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sum1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
 					
 					else if ( opr == "div1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans / num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sum1" ;
 						textBox = null ;
 						
 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 					}
                	 
 					else if ( opr == "mul" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = num1 * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sum1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
 					
 					else if ( opr == "mul1" ){
 						num2 = Double.parseDouble(mainTextBox.getText());
 						ans = ans * num2 ;
 						mainTextBox.setText(ans + "");
 						opr = "sum1" ;
 						textBox = null ;

 						int ansInt = (int) ans ; 		
 						if (  ans - ansInt  == 0  ) {
 							mainTextBox.setText( ansInt + "");	
 						}
 						
 					}
					
					/////////////////////////////////////////////////////////////////////////////////
					
					 else {						
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "sum";
						textBox = null; 
						mainTextBox.setText("0");
					 }
						
						
					
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! RESTART YOUT CALCULATION ");
					num1=0 ;
					num2=0 ; 
					ans = 0 ;
					opr = null ;
					textBox = null;
					mainTextBox.setText("0");
					
				}
			}
		});
		buttonSum.setForeground(Color.WHITE);
		buttonSum.setFont(new Font("Dialog", Font.BOLD, 15));
		buttonSum.setBackground(new Color(128, 0, 0));
		
		buttonCE = new JButton("CE");
		buttonCE.setBounds(217, 344, 54, 46);
		buttonCE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				num1=0 ;
				num2=0 ; 
				ans = 0 ;
				opr = null ;
				textBox = null;
				mainTextBox.setText("0");
				lblNewLabel.setText("@ Wadah Esam");
				c = false ;
			}
			
		});
		buttonCE.setForeground(new Color(255, 102, 102));
		buttonCE.setFont(new Font("Monospaced", Font.BOLD, 14));
		buttonCE.setBackground(new Color(128, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(mainTextBox);
		frame.getContentPane().add(button7);
		frame.getContentPane().add(buttonDot);
		frame.getContentPane().add(button0);
		frame.getContentPane().add(button8);
		frame.getContentPane().add(button9);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(button3);
		frame.getContentPane().add(button4);
		frame.getContentPane().add(button5);
		frame.getContentPane().add(button6);
		frame.getContentPane().add(buttonCE);
		frame.getContentPane().add(buttonEqual);
		frame.getContentPane().add(buttonSum);
		frame.getContentPane().add(buttonDiv);
		frame.getContentPane().add(buttonSub);
		frame.getContentPane().add(buttonMul);
		
		lblNewLabel = new JLabel("@ Wadah Esam");

		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 9));
		lblNewLabel.setBounds(111, 401, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				if ( textBox == null ) {
					mainTextBox.setText("0");
				}
				
				// „ ⁄„œ ÌﬂÊ‰ ›«÷Ì
				
				else if (textBox == "0" ) {
					
				}
				
				else if ( c == true ) {
					num1=0 ;
					num2=0 ; 
					ans = 0 ;
					opr = null ;
					textBox = null;
					mainTextBox.setText("0");
					lblNewLabel.setText("@ Wadah Esam");
					c = false ;
				}
				
				else if ( ( textBox.length() ) == 1 && ( mainTextBox.getText().length() == 1 ) ) {
					mainTextBox.setText("0");
					textBox = null ;
				}
					
				else {
				
				String theBox = mainTextBox.getText()	;
                StringBuilder theNewBox = new StringBuilder ( theBox );
                theNewBox.deleteCharAt(theBox.length()-1); 
                theBox = theNewBox.toString() ; 
                
                mainTextBox.setText(theBox);
                textBox = theBox ; 
				}
				
			}
		});
		btnC.setForeground(new Color(240, 128, 128));
		btnC.setFont(new Font("Monospaced", Font.BOLD, 17));
		btnC.setBackground(new Color(128, 0, 0));
		btnC.setBounds(175, 291, 96, 41);
		frame.getContentPane().add(btnC);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 76, 262, 20);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBackground(SystemColor.window);
		frame.setBounds(100, 100, 288, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
