package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MyMenuBar extends JMenuBar implements ActionListener , PreferencesListener {

	private JMenu fileMenu ;
	private JMenu windowMenu ;
	private JMenu showMenu ;
	private JMenuItem exportItem ;
	private JMenuItem importItem ;
	private JMenuItem exitItem ;
	private JMenuItem prefsMenuItem ; 
	private JCheckBox showAddPurchase ;
	private PreferencesDialog prefsDialog;
	private MenuBarListener menuBarListener ;
	private JFileChooser fileChooser ; 
	private SaveImportListener saveImportListener ; 
	
	public MyMenuBar () {
		//////////// Instantiation /////////////
		fileMenu = new JMenu ("File"); 
		importItem = new JMenuItem("Import...") ;
		exportItem = new JMenuItem("Export...");
		exitItem = new JMenuItem("Exit");
		prefsMenuItem = new JMenuItem ("Preferences...");
		windowMenu = new JMenu ("Window");
		showMenu = new JMenu("Show");
		showAddPurchase = new JCheckBox ("Add Purchase Panel") ;
		prefsDialog = new PreferencesDialog(App.getMainFrameInstance());
		fileChooser = new JFileChooser () ;
		
		///////////// Method Calls /////////////
		this.creatingMenuBar() ;
		this.setMnemnicsAndAccelerator();
		this.setFileChooser();
		
		/////////// Add Listeners //////////////
		exitItem.addActionListener(this);
		showAddPurchase.addActionListener(this);
		prefsMenuItem.addActionListener(this);
		exportItem.addActionListener(this);
		importItem.addActionListener(this);
		this.prefsDialog.setPreferencesListener(this);
	}
	
	@Override
	public void actionPerformed( ActionEvent e) {
		
		if ( e.getSource().equals(showAddPurchase)) {
			boolean showAddPurchase = this.showAddPurchase.isSelected() ;
			MenuBarEvent ev = new MenuBarEvent ( App.getMainFrameInstance() , showAddPurchase  ) ;
			if ( this.menuBarListener != null ) {
				menuBarListener.MenuBarEventOccured(ev);
			}
		}
		 if (e.getSource().equals(exitItem) ) { 
			int confirm = JOptionPane.showConfirmDialog(App.getMainFrameInstance() , "Do you really want to exit the application" , "Confirm Exit" , JOptionPane.OK_OPTION ) ;
			if ( confirm == JOptionPane.OK_OPTION){
				System.exit(0);
			}
		}
		else if ( e.getSource().equals(importItem)) { 
			if ( fileChooser.showOpenDialog(App.getMainFrameInstance()) == fileChooser.APPROVE_OPTION ) {
				this.saveImportListener.load(fileChooser.getSelectedFile());
				}
			}
		else if ( e.getSource().equals(exportItem)) {
			if ( fileChooser.showSaveDialog(App.getMainFrameInstance()) == fileChooser.APPROVE_OPTION ){
				this.saveImportListener.save(fileChooser.getSelectedFile());
				}
			}
		else if ( e.getSource().equals(prefsMenuItem)){
			this.prefsDialog.setVisible(true);
		}
	}
	
	@Override
	public void savePrefs(String username , String password , int port ) {  // called by class PreferencsDialog 
		App.getMainFrameInstance().savePrefs(username , password, port) ; 	// calling class MainFrame Directly << maybe I will want to change this
	}
	
	public void loadPrefs(String username , String password , int port ) {  // called by class MainFrame method loadPrefs
		this.prefsDialog.loadPrefs(username , password , port ) ;
	}
	
	private void creatingMenuBar() {
		
		////////////////////// Adding ///////////////////////
		this.add(fileMenu);
		fileMenu.add(importItem);
		fileMenu.add(exportItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		this.add(windowMenu);
		windowMenu.add(showMenu);
		windowMenu.add(prefsMenuItem);
		showMenu.add(showAddPurchase);
		
		
		this.showAddPurchase.setSelected(true);
	}
	
	private void setMnemnicsAndAccelerator () {
		
		/////////////////// Mnemonics /////////////////////////
		fileMenu.setMnemonic('F');
		windowMenu.setMnemonic('W');
		importItem.setMnemonic('I');
		exportItem.setMnemonic('E');
		exitItem.setMnemonic('X');
		showMenu.setMnemonic('S');
		showAddPurchase.setMnemonic('P');
		
		///////////////// Accelerator //////////////////////////
		exitItem.setAccelerator(KeyStroke.getKeyStroke('X',ActionEvent.CTRL_MASK));
		importItem.setAccelerator(KeyStroke.getKeyStroke('I',ActionEvent.CTRL_MASK));
	}
	
	public void setMenuBarListener (MenuBarListener menuBarListener) {
		this.menuBarListener = menuBarListener; 
	}
	
	public void setSaveImportListener (SaveImportListener saveImportListener ) {
		this.saveImportListener = saveImportListener ;
	}
	
	public void setFileChooser () {
		PurchaseFileFilter purchaseFileFilter = new PurchaseFileFilter () ;
		fileChooser.addChoosableFileFilter(purchaseFileFilter);
		fileChooser.setFileFilter(purchaseFileFilter); // setting the default file filter 
	}
}
