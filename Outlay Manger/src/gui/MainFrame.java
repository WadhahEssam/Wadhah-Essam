package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controllers.Controller;

public class MainFrame extends JFrame {

	private Controller controller ;
	private WorkPanel workPanel ;
	private TablePanel tablePanel ;
	private ToolBar toolBar ;
	private AddPanel addPanel ; 
	private JFileChooser fileChooser ;
	private MyMenuBar menuBar;
	private Preferences prefs ;
	
	public MainFrame () {
		
		//////////// Instantiation /////////////
		controller = new Controller () ;                            // the only controller in the whole application
		menuBar = new MyMenuBar () ;
		workPanel = new WorkPanel () ;
		tablePanel = new TablePanel () ;
		toolBar = new ToolBar () ;
		addPanel = new AddPanel () ;
		fileChooser = new JFileChooser () ;
		prefs = Preferences.userRoot().node("db");
		
		///////////// Method Calls /////////////
		this.createMenuBar();
		this.setMainFrame();
		this.layoutManger();
		this.addListeners();        // here I added all the listeners
		this.setTablePanel();
	}
	
	private void layoutManger() {
		/////////// Adding - Design ////////////
		this.getContentPane().add( addPanel ,  BorderLayout.WEST );
		this.getContentPane().add( toolBar ,  BorderLayout.NORTH );
		this.getContentPane().add( tablePanel , BorderLayout.CENTER) ;     // just for now 
		this.getContentPane().add( new JPanel (),  BorderLayout.SOUTH ); 
		//this.getContentPane().add( workPanel ,  BorderLayout.PAGE_END);  // not needed right now
	}
	
	private void addListeners () {
		/////////// Add Listeners //////////////
		addPanel.setAddPanelListener (new AddPanelListener () {   // when the ok button is cliecked
			@Override
			public void FormEventOccured(AddPanelEvent e) {
				controller.addPurchase(e);
				tablePanel.refresh() ;
			}
		});
		
		menuBar.setMenuBarListener(new MenuBarListener () {
			public void MenuBarEventOccured ( MenuBarEvent e ) {
				boolean showAddPurshase = e.getShowAddPurchase() ;
				addPanel.setVisible(showAddPurshase);
			}
		});
		
		menuBar.setSaveImportListener(new SaveImportListener () {
			@Override // saving a file 
			public void save(File file) {
				try {
					controller.saveToFile(file);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(MainFrame.this, "Could not save the file", "Error", JOptionPane.ERROR_MESSAGE );
					e.printStackTrace();
				}
			}
			@Override // loading a file
			public void load(File file) {
				try {
					controller.loadFromFile(file);
					tablePanel.refresh();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(MainFrame.this, "Could not load the file", "Error", JOptionPane.ERROR_MESSAGE );
				}
			}
		});
		
		tablePanel.setDeletePurchaseListener(new DeletePurchaseListener () {
			@Override
			public void deletePurchase(int row) {
				controller.deletePurchase(row);
				tablePanel.refresh();
			}
		});
	}
	
	public void savePrefs ( String user , String password , int port ) {  // called by class MyMenuBar method savePrefs
		prefs.put("username", user);
		prefs.put("password", password);
		prefs.putInt("port" , port); 
	}
	
	private void loadPrefs () {                          // called by set main frame ( called by constructor ) 
		String username = prefs.get("username", "");
		String password = prefs.get("password", "");
		int port = prefs.getInt("port" , 3306);
		this.menuBar.loadPrefs(username , password , port);
	}
	
	private void createMenuBar () {
		////// creating Menu Bar
		this.setJMenuBar(menuBar);
	}
	
	/////// providing the details of the MainFrame 
	private void setMainFrame () {
		this.loadPrefs(); // loading the prefs of the program
		this.getContentPane().setLayout(new BorderLayout ()); 
		this.setMinimumSize(new Dimension (800 , 650));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(new Dimension (1200,700));
		this.setLocationRelativeTo(null);
	    setVisible(true);
	}
	
	public void saveToFile (File file) {

	}
	
	public void loadFromFile (File file) {
	}
	
	public void setTablePanel() {
		tablePanel.setPurchases(controller.getPurchases()); 
	}

}
