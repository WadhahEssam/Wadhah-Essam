package gui;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToolBar extends JPanel implements ActionListener {

	private JComboBox currency ;
	private JTextField standardSpendingField ;
	private JButton saveBtn ;
	
	public ToolBar () {

		///////////// Instantiation /////////////
		currency = new JComboBox () ;
		standardSpendingField = new JTextField(4) ;
		saveBtn = new JButton ("Save") ;
		
		///////////// Method Calls //////////////
		this.setToolBarSize() ;
		this.setToolBarBorder() ;
		this.layoutManger() ; //  here where I added the components // and here i created the border 
		this.createComboBox() ;
		this.createButton() ;
		this.createField();
		
		///////////// Add Listeners //////////////
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	private void layoutManger () {
		/////////////Border
		this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.add(saveBtn);
		this.add(new JPanel () ); // just a free panel for orgnization 
		this.add(new JLabel("Currency :"));
		this.add(currency);
		this.add(new JLabel("Standard Spending :"));
		this.add(standardSpendingField);

	}
	
	private void setToolBarSize () {
		// for now i don't need to set the size 
	}
	private void setToolBarBorder () {
		
	}

	private void createComboBox() {
		DefaultComboBoxModel currencyModel = new DefaultComboBoxModel () ;
		currencyModel.addElement("SAR");
		currencyModel.addElement("US");
		currencyModel.addElement("YER");
		
		this.currency.setModel(currencyModel);
		this.currency.setPreferredSize(new Dimension ( 60 ,25));
	}
	
	private void createButton () {
		this.saveBtn.setPreferredSize(new Dimension ( 70 ,25));
	}
	
	private void createField () {
		this.standardSpendingField.setPreferredSize(new Dimension ( 60 ,25));
	}

}
