package gui;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class AddPanel extends JPanel implements ActionListener , KeyListener {
	
	private JComboBox typeBox ;
	private JComboBox dateBox ; 
	private JLabel nameLabel ;
	private JLabel toLabel ;
	private JTextField nameField ; 
	private JTextField priceField ;
	private JTextField quantityField; 
	private JTextField totalField ; 
	private JTextField toField ; 
	private JTextArea descArea ;
	private JRadioButton veryImportantButton ; 
	private JRadioButton importantButton ;
	private JRadioButton lessImportantButton ; 
	private JRadioButton notImportantButton ;
	private ButtonGroup importanceGroup ;
	private JButton addButton ;
	private AddPanelListener addPanelListener ; 
	private static double total ; 
	private static final String currency = "SAR" ;
	
	public AddPanel () { 
		
		///////////// Instantiation /////////////
		typeBox = new JComboBox() ;
		dateBox = new JComboBox() ;
		nameLabel = new JLabel ("Name :");
		toLabel = new JLabel ("To :");
		nameField = new JTextField(10) ;
		priceField = new JTextField(7);
		quantityField = new JTextField(3); 
		totalField = new JTextField(10);
		toField =new JTextField(10);
		descArea = new JTextArea() ; 
		veryImportantButton = new JRadioButton ("Very Important");
		importantButton = new JRadioButton ("Important");
		lessImportantButton = new JRadioButton ("Less Important");
		notImportantButton = new JRadioButton ("Not Important");
		importanceGroup = new ButtonGroup () ;
		addButton = new JButton("Add");
		total = 0.0 ;
		
		///////////// Method Calls //////////////
		this.setFields(); 
		this.setLabels(); 
		this.createRadioButtons();
		this.setTextArea();
		this.setAddPanel();
		this.setBorder();
		this.layoutManger();
		this.createComboBox();
		this.Update();
		this.setMnemonics();
		
		/////////// Add Listeners ///////////
		this.addButton.addActionListener(this);
 		priceField.addKeyListener(this);
 		quantityField.addKeyListener(this);
 		typeBox.addActionListener(this);
	}
	
	///////////////////////////////////////// Design /////////////////////////////////////////////////
	
	private void layoutManger() {
		
		this.setLayout(new GridBagLayout () );
		GridBagConstraints c = new GridBagConstraints () ; 
		
		///////////////////// 1st Row ///////////////////////
		
		c.gridy = 1 ; 
		c.gridx = 0 ; 
		c.weightx = 1 ; 
		c.weighty = 0.08 ; 
		c.fill = GridBagConstraints.NONE ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(new JLabel ("Type :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.LINE_START ;
		c.insets = new Insets(0,0,0,0);
		this.add( typeBox , c ) ;
		
		///////////////////// 2nd Row ///////////////////////
		
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(nameLabel, c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.LINE_START ; 
		c.insets = new Insets(0,0,0,0);
		this.add( nameField , c ) ;
		
		///////////////////// 3rd Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add( toLabel , c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.LINE_START ; 
		c.insets = new Insets(0,0,0,0);
		this.add( toField , c ) ;
		
		///////////////////// 4th Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(new JLabel ("Price :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.LINE_START ; 
		c.insets = new Insets(0,0,0,0);
		this.add( priceField , c ) ;
		c.anchor = GridBagConstraints.CENTER ;
		c.insets = new Insets(0,50,0,0);
		this.add(new JLabel(currency) , c);
				
		///////////////////// 5th Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(new JLabel ("Quantity :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.LINE_START ; 
		c.insets = new Insets(0,0,0,0);
		this.add( quantityField , c ) ;

		///////////////////// 6th Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(new JLabel ("Total :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(0,0,0,0);
		this.add( totalField , c);
				
		///////////////////// 7th Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,10);
		this.add(new JLabel ("Date : "), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(0,0,0,0);
		this.add( dateBox , c);
		
		///////////////////// 8th Row ///////////////////////
				
		c.gridy++ ; 
		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.LINE_END;
		c.insets = new Insets(0,0,0,15);
		this.add(new JLabel ("Importance :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(5,0,0,0);
				this.add( this.veryImportantButton , c);
				
		///////////////////// 9th Row ///////////////////////
	
		c.gridy++ ; 
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(0,0,0,0);
		this.add( this.importantButton , c);
		
		///////////////////// 10th Row ///////////////////////
		
		c.gridy++ ; 
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(0,0,0,0);
		this.add( this.lessImportantButton , c);
		
		///////////////////// 11th Row ///////////////////////
		
		c.gridy++ ; 
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.WEST ; 
		c.insets = new Insets(0,0,0,0);
		this.add( this.notImportantButton , c);
			
		///////////////////// 12th Row ///////////////////////
				 
		c.gridy++ ; 
		 

		c.gridx = 0 ; 
		c.anchor = GridBagConstraints.FIRST_LINE_END;
		c.insets = new Insets(5,0,0,15);
		this.add(new JLabel ("Description :"), c );
		
		c.gridx = 1 ;
		c.anchor = GridBagConstraints.FIRST_LINE_START ; 
		c.insets = new Insets(5,0,0,0);
		this.add( descArea , c);
		
		///////////////////// 13th Row ///////////////////////
		
		c.gridy++ ; 
		
		c.gridx = 1 ;
		c.weighty = 4.5 ; 
		c.anchor = GridBagConstraints.FIRST_LINE_START ; 
		c.insets = new Insets(10,0,0,0);
		this.add( addButton , c ) ;
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public void actionPerformed ( ActionEvent e ) {
		
		/////////////////////////////////////////////////////////// Add Button ///////////////////////////////
		if ( e.getSource().equals(addButton)) {
			TypeList type = (TypeList) this.typeBox.getItemAt(typeBox.getSelectedIndex()) ;
			String name = nameField.getText() ; 
			String to = toField.getText() ; 
			DateItem date = (DateItem) dateBox.getSelectedItem() ; 
			String importance = this.importanceGroup.getSelection().getActionCommand() ;
			String description = descArea.getText(); 
			
			//////////////////////// Price & Quantity ////////////////////////
			double	price = 1 ; 
			int quantity = 0 ; 
			try {
			price = Double.parseDouble(priceField.getText());  ///// those will throw an exception if the fields are empty 
			quantity = Integer.parseInt(quantityField.getText());
			}
			catch (Exception ex){
				JOptionPane.showMessageDialog(AddPanel.this, "             Invalid Input \n(Check Price And Quantity)"); 
				return; //// stops the method if the values are invalid
			}
			
			try{
				AddPanelEvent addEvent = new AddPanelEvent (this , name , type , to , price , quantity , this.total , date , importance , description) ;
				if  ( addPanelListener != null )
					addPanelListener.FormEventOccured(addEvent);
				clear() ;
			} catch ( Exception ex ) {
				JOptionPane.showMessageDialog(App.getMainFrameInstance(), ex.getMessage() , "Error" , JOptionPane.ERROR_MESSAGE );
			}

		}
		
		/////////////////////////////////////////////////////////// TypeBox Selection ///////////////////////////////
		if (e.getSource().equals(typeBox)) {
			if ( typeBox.getSelectedItem().toString() == "Item" ) {
				nameField.setEnabled(true);
				nameLabel.setEnabled(true);
				toField.setEnabled(false);
				toLabel.setEnabled(false);
				clear();
			}
			else if (typeBox.getSelectedItem().toString() == "Service") {
				nameField.setEnabled(true);
				nameLabel.setEnabled(true);
				toField.setEnabled(false);
				toLabel.setEnabled(false);
				clear();
			}
			else if(typeBox.getSelectedItem().toString() == "Advance") {
				nameField.setEnabled(false);
				nameLabel.setEnabled(false);
				toField.setEnabled(true);
				toLabel.setEnabled(true);
				clear();
			}
			else if (typeBox.getSelectedItem().toString() == "Lost") {
				nameField.setEnabled(false);
				nameLabel.setEnabled(false);
				toField.setEnabled(false);
				toLabel.setEnabled(false);
				clear();
			}
			else {
				nameField.setEnabled(true);
				nameLabel.setEnabled(true);
				toField.setEnabled(false);
				toLabel.setEnabled(false);
				clear();
			}
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		////////////// price Field
		if ( e.getSource().equals(priceField)){
			
			boolean isDot = ( e.getKeyChar() == '.' )  ;
			boolean isOnlyDot = !( priceField.getText().contains("."));
			boolean priceLimit =  priceField.getText().length() > 9 ;
			
			if ( isDot && isOnlyDot){
				/// the char will not be consumed
			}
			else if( isCharNumber(e.getKeyChar()) || priceLimit ) {
				e.consume();
			}
			
		}
		
		////////////// quantity Field
		else if (e.getSource().equals(quantityField)){
			
			boolean quantityLimit =  quantityField.getText().length() > 2 ;

			if ( isCharNumber(e.getKeyChar()) || quantityLimit ) {
				e.consume();
			}
		}

	}
	
	private void createComboBox () {
		
		//////////////////////////// Type ComboBox //////////////////////////////////
		DefaultComboBoxModel types = new DefaultComboBoxModel<String> () ;
		types.addElement(new TypeList (0 , "Item"));
		types.addElement(new TypeList (1 , "Service"));
		types.addElement(new TypeList (2 , "Advance"));
		types.addElement(new TypeList (3 , "Lost"));
		types.addElement(new TypeList (4 , "Other"));
		typeBox.setModel(types);
		typeBox.setSelectedIndex(0);
	    Dimension d = typeBox.getSize() ; 
	    d.width = 50 ; 
	    typeBox.setSize(d);
	    
	    //////////////////////////// Date ComboBox ///////////////////////////////////
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.DAY_OF_YEAR , -7 );
	    for ( int i = 0 ; i < 14 ; i++ ) {
	    	dateBox.addItem(new DateItem (calendar.getTime()));
	    	calendar.roll(Calendar.DAY_OF_YEAR, 1);
	    }
	    dateBox.setSelectedIndex(7);
		 
	}
	
	private void createRadioButtons () {
		importanceGroup.add(this.importantButton);
		importanceGroup.add(this.veryImportantButton);
		importanceGroup.add(this.lessImportantButton);
		importanceGroup.add(this.notImportantButton);
		
		this.importantButton.setActionCommand("Important");
		this.veryImportantButton.setActionCommand("Very Important");
		this.lessImportantButton.setActionCommand("Less Important");
		this.notImportantButton.setActionCommand("Not Important");
		
		importantButton.setPreferredSize(new Dimension (130,15));
		veryImportantButton.setPreferredSize(new Dimension (130,15));
		lessImportantButton.setPreferredSize(new Dimension (130,15));
		notImportantButton.setPreferredSize(new Dimension (130,15));
		
		this.importantButton.setSelected(true);
	}
	
	private void setTextArea() {
		descArea.setPreferredSize(new Dimension (130 , 100)); /// just setting the description text area size   nothing special 
		descArea.setWrapStyleWord(true);
		descArea.setLineWrap(true);
		Border descBorder = BorderFactory.createEtchedBorder();
		descArea.setBorder(descBorder);
		
	}
	
	private void setAddPanel () {
		Dimension d = this.getPreferredSize() ;
		d.width = 250 ; 
		this.setPreferredSize(d);
	}
	
	private void setBorder () {
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5) ; 
		Border innerBorder = BorderFactory.createTitledBorder("Add Purchase");
		CompoundBorder border = BorderFactory.createCompoundBorder(outerBorder , innerBorder ) ;
		this.setBorder(border);
	}
	
	public void setAddPanelListener (AddPanelListener addPanelListener) {
		this.addPanelListener = addPanelListener ; 
	}
	
	private void setFields (){
		////// Set To Field 
		toField.setEnabled(false);
		////// Set Total Field
		totalField.setEditable(false);
		////// Set Price Filed 
		priceField.setText("0");
		////// Set Quantity Field
		quantityField.setText("1");
	}
	private void setLabels() {
		////// Set To Label 
		toLabel.setEnabled(false);
	}
	
	private void Update () {
		Timer t = new Timer();
		t.schedule(new TimerTask(){
			@Override
			public void run() {
				
				////////////////////////// this is for calculating the total /////////////////////
				double	price = 1 ; 
				int quantity = 0 ; 
				
				try {
					price = Double.parseDouble(priceField.getText());
					quantity = Integer.parseInt(quantityField.getText());
				}
				catch ( Exception e ) {
					
				}

				total = price*quantity ;
				totalField.setText(""+total+ "  " +currency);
				//////////////////////////////////////////////////////////////////////////////////
			}
		},0,50); ///// it is going to be updating every 50 milliseconds 
		
		
	}
	
	private void clear() {
		this.nameField.setText("");
		this.toField.setText("");
		this.priceField.setText("0");
		this.quantityField.setText("1");
		this.dateBox.setSelectedIndex(7);
		this.importantButton.setSelected(true);
		this.descArea.setText("");
	}
	
	private void setMnemonics () {
		nameLabel.setLabelFor(nameField);
		nameLabel.setDisplayedMnemonic('N');
		
		addButton.setMnemonic('A');
	}

	private boolean isCharNumber (char c) {
		return ( c > '9' || c < '0'  && c != '\b' );
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

}
