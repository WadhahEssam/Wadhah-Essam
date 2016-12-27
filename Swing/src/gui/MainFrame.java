package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.prefs.Preferences;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import controllers.Controller;

public class MainFrame extends JFrame {
	
	// only panels which can be attached to the main frame 
	
    private Controller controller  ; // very important that the controller should be before any other component that uses it or you will get a null pointer exception
	private TextPanel textPanel ; 
	private TablePanel tablePanel ; 
    private Toolbar toolBar ; 
    private FormPanel formPanel ; 
    private JFileChooser fileChooser ;
    private PrefsDialog prefsDialog ; 
    private Preferences prefs ; 
    
	public MainFrame() {
		
		
		super("Educational Gate");
		this.setJMenuBar(createMenuBar());
		getContentPane().setLayout( new BorderLayout() );
		
	    controller = new Controller () ;
		textPanel = new TextPanel ();
		tablePanel = new TablePanel () ;
		tablePanel.setTableData(controller.getStudents());  // very important step  , it is passing the information of the array list that i made to the tablePanel throw the controller
		tablePanel.setStudentDeletedLister(new StudentDeletedListener (){ // greate idea to put a listener so if you want for example to delete a stuedent from the toolbar or anywhere else it is easier to just implement the mehtod
			public void studentDeleted(int row) {
				controller.deleteStudent(row) ;
			}
		});
	    toolBar = new Toolbar () ;
	    formPanel = new FormPanel () ;
	    fileChooser = new JFileChooser () ;
	    fileChooser.addChoosableFileFilter(new StudentFileFilter() );
	    prefsDialog = new PrefsDialog(MainFrame.this);
	    prefs = Preferences.userRoot().node("db"); // that is how you instaniate the preferences in java ,, ("db") it can be any thing and alot of people just make it the name of the class 
	    
	    ////////////////////// Listeners ////////////////////////
	    
	    prefsDialog.setPrefsListener(new PrefsListener() {
	    	public void getPrefs ( String user , String password , int portNumber ) {
	    		prefs.put("user", user); // 1st argument is the key  , 2nd argument is the value 
	    		prefs.put("password", password );
	    		prefs.putInt("portNumber", portNumber); // putInt receives an int 
	    	}
	    });
	    
	    // the preferences and setting them 
	    String user = prefs.get("user", "") ; // the second argument is just the default value if the "user" key doesn't have any value  
	    String password = prefs.get("password", "");
	    int portNumber = prefs.getInt("portNumber", 3306 ) ;
	    prefsDialog.setDefaults(user, password, portNumber);
	    //
	    
	    toolBar.setStringListener(new StringListener () {
			public void append(String s) {
				textPanel.append(s);
			}
	    }); 
	    
	    formPanel.setFormListener(new FormListener () {
			public void formEventOccured (FormEvent e) {
//				String name = e.getName() ; 
//				String oc = e.getOc() ;
//				int ageId = e.getAgeId() ; 
//				String education = e.getEducation() ; 
//				boolean isKSUMember = e.isKSUMember() ; 
//				String iD = e.getiD() ;
//				boolean isMale = false ; 
//				if ( e.getGender().equals("Male")) {
//					isMale = true ; 
//				}
				
				controller.addStudent(e);
				tablePanel.refresh() ;
				
//				textPanel.append( name + " : " + oc + " and " + ((isMale)?"his":"her" ) + " age is " + ageId + " and " + ( (isMale)?"he":"she" ) + " is in " + education + "\n" 
//				+ ((isKSUMember)?( ( (isMale)?"He":"She" ) + " is a KSU Memebr and his ID is " + iD ) :( (isMale)?"He":"She" ) + " is not a KSU Member")+ "\n");
			}
	    });

	    //////////////////////////////////////////////////////////
	
	    getContentPane().add( formPanel , BorderLayout.WEST );
	    getContentPane().add( toolBar , BorderLayout.NORTH );
	    getContentPane().add( tablePanel , BorderLayout.CENTER );
	    getContentPane().add(new JPanel() , BorderLayout.EAST ); //// this is just something to make the program look better only 
	    getContentPane().add(new JPanel() , BorderLayout.SOUTH );
		this.setSize(1050, 600);
		this.setMinimumSize(new Dimension(1000, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this makes the program close when you click the X 
	    this.setLocationRelativeTo(null); // this makes the frame appear in the middle
		this.setVisible(true);
	}
	
	private JMenuBar createMenuBar () {
		
		
        JMenu fileMenu = new JMenu ("File") ; 
        JMenuItem importItem = new JMenuItem ("Import...") ; 
        JMenuItem exportItem = new JMenuItem ("Export...") ;
        JMenuItem exitItem = new JMenuItem ("Exit");
        
        fileMenu.add(importItem); 
        fileMenu.add(exportItem); 
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu windowMenu = new JMenu ("Window") ; 
        JMenu showItem = new JMenu ("Show"); /// if it contains other menus inside it   ,,, it should be a menu too not a Menu Item .... 
        
//        JMenuItem showPersonForm = new JMenuItem ("Person Form"); // i can say that the menu item  ,,, are the object that perform action when you press them ....
        JCheckBox showPersonForm = new JCheckBox ("Person Form");
        JMenuItem showPrefsItem = new JMenuItem ("Preferences...");
        showPersonForm.setSelected(true);
        showItem.add(showPersonForm);
        windowMenu.add(showItem);
        windowMenu.add(showPrefsItem) ;
        
		JMenuBar menu = new JMenuBar () ; 
		menu.add(fileMenu);
		menu.add(windowMenu);
		
		//set mnemonics 
		
		fileMenu.setMnemonic(KeyEvent.VK_F);   ///  you can do either by putting a char or a keyEvent 
		exitItem.setMnemonic('X');    
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));     // what i get that the key stroke allows you to make more than one key as an action 
		importItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
		showPrefsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P , ActionEvent.CTRL_MASK ) );
		
		//////////////////////////// Action Listeners ////////////////////////////
		

        showPersonForm.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (formPanel.isVisible()) {
					formPanel.setVisible(false); 
				}
				else {
					formPanel.setVisible(true);
				}
			}
        });
        
        exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog( MainFrame.this , "Do you really want to exit the application" , "Confirm Exit" , JOptionPane.OK_OPTION /* the type of the confirm dialog */ );
				if ( confirm == JOptionPane.OK_OPTION ) {
					System.exit(0);
				}
			}
        });
        
        // importing a file from the computer 
        importItem.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				if ( fileChooser.showOpenDialog(MainFrame.this) == fileChooser.APPROVE_OPTION ){
					try {
						controller.loadFromFile(fileChooser.getSelectedFile());
						tablePanel.refresh();
					} catch (IOException e) {
						JOptionPane.showMessageDialog(MainFrame.this , "Couldn't load data from file", "Error" ,  JOptionPane.ERROR_MESSAGE );
					}
				}
			}
        });
        
        // exporting a file to the computer  
        exportItem.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if ( fileChooser.showSaveDialog(MainFrame.this) == fileChooser.APPROVE_OPTION ) {
					try {
						controller.saveToFile(fileChooser.getSelectedFile());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(MainFrame.this , "Couldn't save data to file", "Error" ,  JOptionPane.ERROR_MESSAGE );
					} 
					
				}
			}
        });
        
        // showing the preferences dialog box
        showPrefsItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prefsDialog.setVisible(true) ; 
			}
        });
        
        /////////////////////////////////////////////////////////////////////////////
        
		return menu ; 
	}

}
