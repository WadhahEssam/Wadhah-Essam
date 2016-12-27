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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JButton buttonCE;
	private double ans ;
	
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
		frame.setAutoRequestFocus(false);
		frame.getContentPane().setBackground(SystemColor.window);
		
		mainTextBox = new JTextField();
		mainTextBox.setHorizontalAlignment(SwingConstants.LEFT);
		mainTextBox.setForeground(new Color(255, 255, 255));
		mainTextBox.setBackground(new Color(165, 42, 42));
		mainTextBox.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 31));
		mainTextBox.setEnabled(true);
		mainTextBox.setEditable(false);
		mainTextBox.setColumns(10);
		
		button1 = new JButton("1");
		button1.setBackground(new Color(240, 128, 128));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		button1.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
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
		button2.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button2.setBackground(new Color(240, 128, 128));
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		button3.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button3.setBackground(new Color(240, 128, 128));
		
		button4 = new JButton("4");
		button4.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button4.setBackground(new Color(240, 128, 128));
		
		button5 = new JButton("5");
		button5.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button5.setBackground(new Color(240, 128, 128));
		
		button6 = new JButton("6");
		button6.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button6.setBackground(new Color(240, 128, 128));
		
		button7 = new JButton("7");
		button7.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button7.setBackground(new Color(240, 128, 128));
		
		button8 = new JButton("8");
		button8.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button8.setBackground(new Color(240, 128, 128));
		
		button9 = new JButton("9");
		button9.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button9.setBackground(new Color(240, 128, 128));
		
		button0 = new JButton("0");
		button0.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		button0.setBackground(new Color(240, 128, 128));
		
		buttonDot = new JButton(".");
		buttonDot.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 24));
		buttonDot.setBackground(new Color(240, 128, 128));
		
		buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( opr == "sum" && opr == "sum1" ) {
					
				}
					if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						textBox = null ;
					}
					if ( ans == 0 ) {
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2;
						mainTextBox.setText(ans + "");
						opr = "done";
					//}
					//else {
					//	num2 = Double.parseDouble(mainTextBox.getText());
					//	ans = ans + num2 ;
					//	mainTextBox.setText(ans + "");
					//	opr = "done";
					//}
				//}
				//else if ( opr == "sub" ) {
				//	num2 = Double.parseDouble(mainTextBox.getText());
				//	ans = num1 - num2;
				//	mainTextBox.setText(ans + "");
				}
			}
		});
		buttonEqual.setForeground(new Color(255, 255, 255));
		buttonEqual.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonEqual.setBackground(new Color(128, 0, 0));
		
		buttonMul = new JButton("X");
		buttonMul.setForeground(Color.WHITE);
		buttonMul.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonMul.setBackground(new Color(128, 0, 0));
		
		buttonDiv = new JButton("/");
		buttonDiv.setForeground(Color.WHITE);
		buttonDiv.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonDiv.setBackground(new Color(128, 0, 0));
		
		buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 try {
					
					if ( opr == "sub" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 - num2;
						mainTextBox.setText(ans + "");
						textBox = null ;
					}
										
					else {
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "sub";
						textBox = null ; 
						mainTextBox.setText("");
					}
					
					
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! ");
				}
			}
		});
		buttonSub.setForeground(Color.WHITE);
		buttonSub.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonSub.setBackground(new Color(128, 0, 0));
		
		buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if ( opr == "sum" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num1 + num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
					}
					
					else if ( opr == "sum1" ){
						num2 = Double.parseDouble(mainTextBox.getText());
						ans = num2 + ans;
						mainTextBox.setText(ans + "");
						opr = "sum1" ;
						textBox = null ;
					}
					
					else {
						num1 = Double.parseDouble(mainTextBox.getText()) ;
						opr = "sum";
						textBox = null; 
						mainTextBox.setText("");
					}
				}catch (Exception eSum) {
					JOptionPane.showMessageDialog(null , "SOMETHING WENT WRONG TRY AGAIN!! ");
				}
			}
		});
		buttonSum.setForeground(Color.WHITE);
		buttonSum.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonSum.setBackground(new Color(128, 0, 0));
		
		buttonCE = new JButton("CE");
		buttonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=0 ;
				num2=0 ; 
				ans = 0 ;
				opr = null ;
				textBox = null;
				mainTextBox.setText("");
			}
		});
		buttonCE.setForeground(Color.WHITE);
		buttonCE.setFont(new Font("Monospaced", Font.BOLD, 20));
		buttonCE.setBackground(new Color(128, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(mainTextBox, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(buttonEqual, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonDot, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button0, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(buttonDiv, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
								.addComponent(buttonSub, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
								.addComponent(buttonSum, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
								.addComponent(buttonMul, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
							.addGap(16))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(buttonCE, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(buttonCE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(mainTextBox, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button1)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(buttonMul, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonDiv, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonSub, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonDot, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonEqual, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
						.addComponent(buttonSum, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBackground(SystemColor.window);
		frame.setBounds(100, 100, 273, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
