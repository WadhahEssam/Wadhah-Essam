package gui;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class PreferencesDialog extends JDialog implements ActionListener {

	private JPanel controllPanel ;
	private JPanel buttonsPanel ; 
	private JTextField nameTextField ; 
	private JPasswordField passwordField ; 
	private JButton okButton ; 
	private JButton cancelButton ;
	private JSpinner portSpinner ; 
	private PreferencesListener preferencesListener ;
	
	public PreferencesDialog( JFrame parent) {
		super(parent);
		
		//////////// Instantiation /////////////
		controllPanel = new JPanel() ;
		buttonsPanel = new JPanel() ; 
		nameTextField = new JTextField(10) ;
		passwordField = new JPasswordField(10) ;
		okButton = new JButton("OK") ;
		cancelButton = new JButton("Cancel");
		portSpinner = new JSpinner () ;
		
		///////////// Method Calls /////////////
		this.setSpinner() ;
		this.layoutManger();
		this.setDialog() ;

		/////////// Add Listeners //////////////
		this.okButton.addActionListener(this);
		this.cancelButton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource().equals(okButton) ) {
			String username = this.nameTextField.getText() ; 
			String password = new String (this.passwordField.getPassword()) ;
			int port = (int) this.portSpinner.getModel().getValue() ;
			this.preferencesListener.savePrefs(username , password, port); // saving the prefs by sending them into the MyMenuBar useing Interface and then sending it to the MainFrame using regular instance 
			this.setVisible(false);
		}
		else if (e.getSource().equals(cancelButton)) {
			this.setVisible(false);
		}
	}

	private void layoutManger () {
		
		//////////// Controll Panel Layout ///////////////
		controllPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints ();
		int space = 7 ; 
		
		gc.weightx = 1 ;
		gc.weighty = 1 ;
		gc.fill = GridBagConstraints.NONE; 
		
		//////////// First Line
		gc.gridy = 0 ; 
		gc.gridx = 0 ;
		gc.insets = new Insets(0,0,0,space) ;
		gc.anchor = GridBagConstraints.LINE_END ;
		controllPanel.add(new JLabel("Username :"), gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,space,0,0) ;
		gc.anchor = GridBagConstraints.LINE_START ;
		controllPanel.add(this.nameTextField, gc);

		//////////// next Line
		gc.gridy++ ;
		gc.gridx = 0 ; 
		gc.insets = new Insets(0,0,0,space) ;
		gc.anchor = GridBagConstraints.LINE_END ;
		controllPanel.add(new JLabel("Password :"), gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,space,0,0) ;
		gc.anchor = GridBagConstraints.LINE_START ;
		controllPanel.add(this.passwordField, gc);	
		
		//////////// next Line
		gc.gridy++ ;
		gc.gridx = 0 ; 
		gc.insets = new Insets(0,0,0,space) ;
		gc.anchor = GridBagConstraints.LINE_END ;
		controllPanel.add(new JLabel("Port :"), gc);
		
		gc.gridx = 1 ; 		
		gc.insets = new Insets(0,space,0,0) ;
		gc.anchor = GridBagConstraints.LINE_START ;
		controllPanel.add(this.portSpinner , gc);	
		
		//////////// Buttons Panel Layout ///////////////
		buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT) );
		buttonsPanel.add(okButton);
		buttonsPanel.add(cancelButton);
		
		///////////// Main Dialog Layout ///////////////
		this.setLayout(new BorderLayout() );
		this.add(controllPanel , BorderLayout.CENTER ) ;
		this.add(buttonsPanel, BorderLayout.SOUTH );
		
	}
	
	private void setSpinner () {
		SpinnerModel portSpinnerModel = new SpinnerNumberModel(3306, 0, 9999, 1);
		this.portSpinner.setModel(portSpinnerModel);
	}
	
	public void loadPrefs(String username , String password , int port ) { // called by class MyMenuBar method loadPrefs
		this.nameTextField.setText(username);
		this.passwordField.setText(password);
		this.portSpinner.getModel().setValue(port);
	}
	
	private void setDialog() {
		this.setBorders();
		this.setSize(400,250);
		this.setLocationRelativeTo(App.getMainFrameInstance());
	}
	
	private void setBorders() {
		int space = 10 ; 
		Border innerBorder = BorderFactory.createEmptyBorder(space,space,space,space) ; 
		Border outerBorder = BorderFactory.createTitledBorder("User Info");
		this.controllPanel.setBorder(BorderFactory.createCompoundBorder(innerBorder , outerBorder));
		
		this.buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	}
	
	public void setPreferencesListener (PreferencesListener preferencesListener) {
		this.preferencesListener = preferencesListener ;
	}

}
