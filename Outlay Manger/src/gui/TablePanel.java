package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Purchase;

public class TablePanel extends JPanel implements MouseListener , ActionListener {
	
	private JTable purchaseTable ;
	private PurchaseTableModel tableModel ; 
	private JPopupMenu popUp ;
	private JMenuItem deleteRowItem ;
	private DeletePurchaseListener deletePurchaseListener ; 

	public TablePanel () {
		//////////// Instantiation /////////////
		tableModel = new PurchaseTableModel () ;
		purchaseTable = new JTable (tableModel) ;
		popUp = new JPopupMenu ();
		
		///////////// Method Calls //////////////
		this.setPopupMenu();
		this.layoutManger();
		
		/////////// Add Listeners ///////////
		purchaseTable.addMouseListener(this);
		deleteRowItem.addActionListener(this);
	}
	
	private void layoutManger () {
		this.setLayout(new BorderLayout());
		this.add( new JScrollPane (purchaseTable), BorderLayout.CENTER );
		this.add( new JPanel () , BorderLayout.WEST  );
		this.add( new JPanel () , BorderLayout.SOUTH );
		this.add( new JPanel () , BorderLayout.NORTH );
		this.add( new JPanel () , BorderLayout.EAST  );


	}
	
	public void setPopupMenu (){
		deleteRowItem = new JMenuItem ("Delete Row") ;
		popUp.add(deleteRowItem);
	}
	
	public void setPurchases (List<Purchase> purchases){
		tableModel.setPurchases(purchases);
	}
	
	public void refresh () {
		tableModel.fireTableDataChanged();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON3){
			int row = purchaseTable.rowAtPoint(e.getPoint());
			purchaseTable.getSelectionModel().setSelectionInterval(row, row);
			popUp.show(purchaseTable, e.getX(), e.getY());
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource().equals(deleteRowItem) ){
			int row = purchaseTable.getSelectedRow();	
			deletePurchaseListener.deletePurchase(row);
		}
	}
	
	public void setDeletePurchaseListener (DeletePurchaseListener deletePurchaseListener){
		this.deletePurchaseListener = deletePurchaseListener ;
	}
	
	// I don't need all of them 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
