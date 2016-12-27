package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Purchase;

public class PurchaseTableModel extends AbstractTableModel {

	private List<Purchase> purchases ; 
	private String[] colNames = { "ID" , "Type" , "Name" , "To" , "Price" , "Quantity" , "Total" , "Date" , "Importance" , "Description" } ; 
	
	@Override
	public int getColumnCount() {
		return 9;
	}

	@Override
	public int getRowCount() {
		return purchases.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Purchase p = purchases.get(row) ;
		
		switch (col) {
		case 0 :
			return p.getiD() ; 
		case 1:
			return p.getPurchaseType() ; 
		case 2 : 
			return p.getName() ; 
		case 3 : 
			return p.getTo();
		case 4 : 
			return p.getPrice() ;
		case 5 : 
			return p.getQuantity() ; 
		case 6 : 
			return p.getTotal() ; 
		case 7 : 
			return p.getDate() ; 
		case 8 : 
			return p.getImportance();
//		case 9 :
//			return p.getDescriotion() ; 
		}
		return null;
	}
	
	public void setPurchases ( List<Purchase> purchases ) {
		this.purchases = purchases ; 
	}

	@Override
	public String getColumnName(int column) {
		return colNames[column] ;
	}

}
