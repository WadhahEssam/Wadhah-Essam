package gui;
import java.awt.Dimension ;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border; 

public class FormPanel extends JPanel implements ActionListener {

	private JLabel nameLabel ; 
	private JLabel ocLabel ; 
	private JTextField nameField ; 
	private JTextField ocField ; 
	private JButton doneBtn ; 
	private FormListener formListener ; 
	private JList ageList ; 
	private JComboBox comboBox ; 
	private JCheckBox kSUMember ; 
	private JTextField iDText ; 
	private JLabel iDLabel ;
	private JRadioButton isMale ; 
	private JRadioButton isFemale ; 
	private ButtonGroup genderGroup ;
	
	public FormPanel () {

		Dimension dim = this.getPreferredSize() ;
		dim.width = 250 ;
		this.setPreferredSize(dim);
		
		nameLabel = new JLabel ("Student Name: ");
		ocLabel = new JLabel ("Occupation: ");
		nameField = new JTextField (10) ;
		ocField = new JTextField (10) ; 
		doneBtn = new JButton ("Done");
		ageList = new JList ();
		comboBox = new JComboBox() ;
		kSUMember = new JCheckBox() ;
		iDText = new JTextField (10); 
		iDLabel = new JLabel ("ID :") ;
		isMale = new JRadioButton ("Male");
		isFemale = new JRadioButton ("Female");
	    genderGroup = new ButtonGroup () ;
		
	    this.createMnemonics();
	    this.createRadioButtons();
		this.createCheckBox();
		this.createAgeList();
		this.createComboBox();
		doneBtn.addActionListener(this);
		this.setBorder();
		this.layoutManage(); 
		this.kSUMember.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//////////////////// done button clicked
		if (arg0.getSource().equals(doneBtn)  ) {
			String name = nameField.getText() ; 
			String oc = ocField.getText() ; 
			AgeCategory ageL =  (AgeCategory) ageList.getSelectedValue() ;
			String education = (String) comboBox.getSelectedItem() ; 
			boolean isKSUMember = this.kSUMember.isSelected() ; 
			String iD = this.iDText.getText() ; 
			String gender = genderGroup.getSelection().getActionCommand() ; 
			
			FormEvent ev = new FormEvent (this, name , oc , ageL , education , isKSUMember , iD , gender );
			
			if ( formListener != null ) {              // this is only checking that the value of the form Listener has been assigned 
				formListener.formEventOccured(ev);
			}
		}
		
		//////////////////// check box clicked
		else if ( arg0.getSource().equals(kSUMember)) {
			boolean isSelected = kSUMember.isSelected();
			if (isSelected) {
				iDLabel.setEnabled(true);
				iDText.setEnabled(true);
			}
			else {
				iDLabel.setEnabled(false);
				iDText.setEnabled(false);
			}
		}

	}
	
	// designing the Panel 
	public void layoutManage () {

		this.setLayout(new GridBagLayout() );
		GridBagConstraints gc = new GridBagConstraints () ; // gc from grid Constranis
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////// First Row ////////////////////////////
		
		gc.gridy = 0 ;
		gc.gridx = 0 ;
		gc.weightx = 1 ;
		gc.weighty = .1 ;
		gc.fill = GridBagConstraints.NONE ; // i will try the program with out it then 
		gc.anchor = GridBagConstraints.LINE_END ;
		gc.insets = new Insets(0,0,0,5);
		this.add( nameLabel , gc);
		
		gc.gridx = 1 ; 
		gc.gridy = 0 ; 
		gc.anchor = GridBagConstraints.LINE_START ;
		gc.insets = new Insets(0,0,0,0);

		this.add(nameField , gc ) ; 
		
		
		///////////////// Second Row ////////////////////////////

		gc.gridy++ ; 
		gc.gridx = 0 ;
		gc.anchor = GridBagConstraints.LINE_END ;
		gc.insets = new Insets(0,0,0,5);
		this.add(ocLabel , gc); 
		
		gc.gridx = 1 ; 
		gc.gridy = 1 ; 
		gc.anchor = GridBagConstraints.LINE_START ;
		gc.insets = new Insets(0,0,0,0);
		this.add( ocField , gc ) ; 
		
		///////////////// Third Row ////////////////////////////

		gc.gridy++ ;
		
		gc.gridx = 0 ;
		gc.anchor = GridBagConstraints.FIRST_LINE_END ;
		gc.insets = new Insets(0,0,0,5);
		this.add(new JLabel ("Age: ") , gc);
		
		gc.gridx = 1 ;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(ageList , gc); 
	    
		///////////////// Forth Row ////////////////////////////

		gc.gridy++ ;
		
		gc.gridx = 0 ;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(3,0,0,5);
		this.add(new JLabel ("Education: ") , gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(comboBox , gc); 
	    
		///////////////// Fifth Row ////////////////////////////
	    
		gc.gridy++ ;
		
		gc.gridx = 0 ;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0,0,0,5);
		this.add(new JLabel ("KSU member: ") , gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(kSUMember , gc); 
	    
		///////////////// Sixth Row ////////////////////////////
	    
	    gc.gridy++ ;
		
		gc.gridx = 0 ;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0,0,0,5);
		this.add(iDLabel , gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(iDText , gc); 

	    
		/////////////////  7th Row ////////////////////////////
	    
		gc.gridy++ ;
		
		gc.gridx = 0 ;
		gc.weighty = 0.05;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		this.add(new JLabel ( "Gender: ") , gc);
		
		gc.gridx = 1 ; 
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(isMale , gc); 

		/////////////////  8th Row ////////////////////////////

	    gc.gridy++ ;
		
		gc.gridx = 1 ; 
		gc.weighty = 0.1;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
	    this.add(isFemale , gc); 
	    
		/////////////////  9th Row ////////////////////////////

		gc.gridy++; 
		gc.gridx = 1 ; 
		gc.weighty = 3 ; 
		gc.anchor = GridBagConstraints.BASELINE; 
		gc.anchor = GridBagConstraints.FIRST_LINE_START ;	
		gc.insets = new Insets(3,0,0,0);
		this.add( doneBtn , gc  ) ; 
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}
	
	private void createRadioButtons () {
		this.genderGroup.add(this.isMale);
		this.genderGroup.add(this.isFemale);
		this.isMale.setActionCommand("Male");
		this.isFemale.setActionCommand("Female");
		this.isMale.setSelected(true);
		
	}
	
	private void createComboBox () {
		DefaultComboBoxModel eduModel = new DefaultComboBoxModel () ;
		eduModel.addElement("Elementry");
		eduModel.addElement("High School");
		eduModel.addElement("Collage");
		comboBox.setModel(eduModel);  // from here actually you can know the type of the model you can use to create the list 
	    comboBox.setSelectedIndex(0);
	}
	
	private void createCheckBox () {
		this.kSUMember.setSelected(false);
		this.iDLabel.setEnabled(false);
		this.iDText.setEnabled(false);

	}
	
	private void createAgeList () {
		DefaultListModel ageModel = new DefaultListModel () ; 
		ageModel.addElement(new AgeCategory ( 0 , "Under 18"));
		ageModel.addElement(new AgeCategory ( 1 , "18 to 65"));
		ageModel.addElement(new AgeCategory ( 2 , "Over 65"));
		ageList.setModel(ageModel);
		ageList.setPreferredSize(new Dimension (114, 58));
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setSelectedIndex(1);
	}
	
	private void setBorder() {
		Border innerBorder = BorderFactory.createTitledBorder("Add Student");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5) ; 
		this.setBorder(BorderFactory.createCompoundBorder(outerBorder , innerBorder));
	}
	
	public void setFormListener ( FormListener f ) {
		this.formListener = f ; 
	}
	
	public void createMnemonics () {
	    nameLabel.setDisplayedMnemonic(KeyEvent.VK_S);
	    nameLabel.setLabelFor(nameField);
	    doneBtn.setMnemonic(KeyEvent.VK_D);
	}

}

class AgeCategory {
	private int id ; 
	private String text ; 
	
	public AgeCategory ( int id , String text ) {
		this.id = id ; 
		this.text = text ;
	}
	
	public String toString () {
		return this.text ; 
	}
	
	public int getId () {
		return this.id ;
	}
}
