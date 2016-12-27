package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Student;

public class TablePanel extends JPanel {

	private StudentTableModel studentTableModel ; 
	private JTable studentTable ;
	private JPopupMenu popup ;
	private StudentDeletedListener studentDeletedListener ;
	
	public TablePanel () {
		studentTableModel = new StudentTableModel ();
		studentTable = new JTable (studentTableModel) ;
		popup = new JPopupMenu () ;
		JMenuItem deleteRowItem = new JMenuItem("Delete row");
		popup.add(deleteRowItem);
		
		this.setLayout(new BorderLayout ());
		this.add( new JScrollPane (studentTable) , BorderLayout.CENTER );
		
		studentTable.addMouseListener(new MouseAdapter () {// mouse adapter is the same as mouse litenere but you can choose the method you want to implement , you don't have to implement them all 
			@Override
			public void mousePressed(MouseEvent e) {
				if ( e.getButton() == MouseEvent.BUTTON3 )  { // button 3 is the right button
					int row = studentTable.rowAtPoint(e.getPoint()); // getting the row at the mouse's point
					studentTable.getSelectionModel().setSelectionInterval(row, row); // select the row in the mouse point
					popup.show(studentTable , e.getX() ,  e.getY() ); 
				}
			} 
		});
		
		deleteRowItem.addActionListener(new ActionListener () {
			public void actionPerformed ( ActionEvent e ) {
				int row = studentTable.getSelectedRow() ; 
				studentDeletedListener.studentDeleted(row); 
				studentTableModel.fireTableRowsDeleted(row, row); // better and faster way to inform the table that you deleted rows so you don't refresh the whole table 
			}
		});
		
	}
	
	// this method is receiving the data from the mainFrame and passing it into the table model 
	public void setTableData (List<Student> database ) {
		studentTableModel.setData(database);
	}
	
	public void refresh() {
		studentTableModel.fireTableDataChanged(); // the fire methods allow the table to know that data has been added or deleted or modified 
	}
	
	public void setStudentDeletedLister ( StudentDeletedListener studentDeletedListener ) {
		this.studentDeletedListener = studentDeletedListener ;
	}
	
	
	

	
}
