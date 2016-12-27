import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TestGUI {

	private JFrame frame;
	private JTextField textBox1;
	private JTextField textBox2;
	private JButton Button1;
	private JButton Button2;
	private JTextField textBoxAnswer;
	private JLabel AnsLabel;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textBox1 = new JTextField();
		textBox1.setHorizontalAlignment(SwingConstants.CENTER);
		textBox1.setBounds(80, 47, 181, 37);
		frame.getContentPane().add(textBox1);
		textBox1.setColumns(10);
		
		textBox2 = new JTextField();
		textBox2.setHorizontalAlignment(SwingConstants.CENTER);
		textBox2.setBounds(331, 47, 181, 37);
		frame.getContentPane().add(textBox2);
		textBox2.setColumns(10);
		
		Button1 = new JButton("ADD");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int sum = Integer.parseInt(textBox1.getText()) + Integer.parseInt(textBox2.getText());
					 textBoxAnswer.setText(""+sum);			
				}
				catch(Exception E) {
					JOptionPane.showMessageDialog(null, "PLEASE ENTER A VALID NUMBERS !!");
				}							 
			}
		});
		Button1.setBackground(SystemColor.inactiveCaption);
		Button1.setBounds(80, 95, 181, 37);
		frame.getContentPane().add(Button1);
		
		Button2 = new JButton("SUB");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int sub = Integer.parseInt(textBox1.getText()) - Integer.parseInt(textBox2.getText());
					 textBoxAnswer.setText(""+sub);
				} catch (Exception EN){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER A VALID NUMBERS !!");
				}
		     
			}
		});
		Button2.setBackground(SystemColor.inactiveCaption);
		Button2.setBounds(331, 95, 181, 37);
		frame.getContentPane().add(Button2);
		
		textBoxAnswer = new JTextField();
		textBoxAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		textBoxAnswer.setEditable(false);
		textBoxAnswer.setBounds(224, 186, 146, 37);
		frame.getContentPane().add(textBoxAnswer);
		textBoxAnswer.setColumns(10);
		
		AnsLabel = new JLabel("Ans");
		AnsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AnsLabel.setBounds(286, 149, 32, 26);
		frame.getContentPane().add(AnsLabel);
	}
}
