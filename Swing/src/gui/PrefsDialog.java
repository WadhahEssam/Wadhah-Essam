package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class PrefsDialog extends JDialog {
	
	private JTextField userField ; 
	private JPasswordField passwordField ; 
	private JButton okButton ; 
	private JButton cancelButton ; 
	private JSpinner portSpinner ;
	private JPanel fieldsPanel ; 
	private JPanel buttonsPanel ; 
	private PrefsListener prefsListener ; 
	
	public PrefsDialog ( JFrame parent ) {
		super(parent, "Preferences", false);
		
		userField = new JTextField (10) ; 
		passwordField = new JPasswordField (10) ;
		okButton = new JButton ("OK") ;
		cancelButton = new JButton ("Cancel");
		
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(3306 , 0 , 9999 , 1 ); // so you limit the options inside the spinners from 0 to 9999 and the default is 3306 and the spinning is by 1 
		portSpinner = new JSpinner ( spinnerModel ) ;
		
		////////////////// listener /////////////////////
		okButton.addActionListener( new ActionListener() {
			public void actionPerformed ( ActionEvent e ) {
				Integer portNumber = (Integer) spinnerModel.getValue() ; 
				
				String userName = userField.getText() ; 
				// String password = passwordField.getText() ;   // i don't know why jone didn't use it but it is working for me 
				char[] password = passwordField.getPassword() ; 
				
				prefsListener.getPrefs(userName, new String (password), portNumber );
				setVisible(false); 
			}
		}); 	
		
		cancelButton.addActionListener( new ActionListener() {
			public void actionPerformed ( ActionEvent e ) {
				setVisible(false); 
			}
		}); 
		
		this.layoutManger();
		this.setSize(320 , 220 );
		this.setResizable(false);
		this.setLocationRelativeTo(parent);
	}
	
	public void setPrefsListener ( PrefsListener prefsListener ) {
		this.prefsListener = prefsListener ; 
	}
	
	public void setDefaults ( String user , String password , int portNumber ) {
		this.userField.setText(user);
		this.passwordField.setText(password);
		this.portSpinner.setValue(portNumber);
	}
	
	public void layoutManger () {


		
		////////////////// Fields Panel ///////////////////
		fieldsPanel = new JPanel () ;
		fieldsPanel.setLayout(new GridBagLayout () );
		Border innerBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY) ;
		int space1 = 15 ;
		Border outerBorder = BorderFactory.createEmptyBorder(space1 , space1 , space1 , space1);
		fieldsPanel.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		GridBagConstraints gc = new GridBagConstraints () ; 
		
		gc.gridy = 0 ; 
		
		int space = 20 ; 
		gc.weighty = 1 ;
		gc.weightx = 1 ; 
		gc.fill = GridBagConstraints.NONE ; 
		
		gc.gridx = 0 ; 
		gc.anchor = GridBagConstraints.LINE_END ; 
		gc.insets = new Insets ( 0, 0, 0 , space );
		fieldsPanel.add(new JLabel ( "User Name : " ) , gc ); 
		
		gc.gridx = 1 ; 
		gc.anchor = GridBagConstraints.LINE_START ; 
		gc.insets = new Insets ( 0, space , 0 , 0 );
		fieldsPanel.add( userField , gc );
		
		////////////next row /////////////
				
		gc.gridy ++ ;
		
		gc.gridx = 0 ; 
		gc.anchor = GridBagConstraints.LINE_END ; 
		gc.insets = new Insets ( 0, 0, 0 , space );
		fieldsPanel.add(new JLabel ( "Password : " ) , gc ); 
			
		gc.gridx = 1 ; 
		gc.anchor = GridBagConstraints.LINE_START ; 
		gc.insets = new Insets ( 0, space , 0 , 0 );
		fieldsPanel.add( passwordField , gc );
			
		//////////// next row /////////////
		
		gc.gridy ++ ;
		
		gc.gridx = 0 ; 
		gc.anchor = GridBagConstraints.LINE_END ; 
		gc.insets = new Insets ( 0, 0, 0 , space );
		fieldsPanel.add(new JLabel ( "Port : " ) , gc ); 
		
		gc.gridx = 1 ; 
		gc.anchor = GridBagConstraints.LINE_START ; 
		gc.insets = new Insets ( 0, space , 0 , 0 );
		fieldsPanel.add( portSpinner , gc );
		
		/////////////////// Buttons Panel ///////////////////
		
		buttonsPanel = new JPanel() ;
		buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		Dimension cancelButtonSize = cancelButton.getPreferredSize() ; 
		okButton.setPreferredSize(cancelButtonSize);  /// making both the cancel and the ok buttons having the same size 
		buttonsPanel.add(this.okButton);
		buttonsPanel.add(this.cancelButton);
		
		////////////////////////////////////////////////////
		this.setLayout(new BorderLayout());
		this.add(fieldsPanel , BorderLayout.CENTER);
		this.add(buttonsPanel, BorderLayout.SOUTH);
	}

}
