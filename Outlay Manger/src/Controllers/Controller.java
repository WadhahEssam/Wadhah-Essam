package Controllers;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.IIOException;

import gui.AddPanelEvent;
import gui.DateItem;
import gui.TypeList;
import model.Database;
import model.ImportanceCategory;
import model.Purchase;
import model.PurchaseTypeCategory;

public class Controller {
	private Database database ; 
	
	public Controller () {
		database = Database.getInstance();
	}
	
	public void addPurchase (AddPanelEvent e){
		TypeList type = e.getType() ;
		String name = e.getName() ;
		String to = e.getTo() ; 
		double price = e.getPrice() ; 
		int quantity = e.getQuantity() ; 
		double total = e.getTotal() ;
		DateItem dateItem = e.getDateItem();                // this should be change into date 
		String importance = e.getImportance() ; 
		String description = e.getDescription() ; 
		
		/////// Purchase Category ///////
		PurchaseTypeCategory purchaseTypeCategory = null ; 
		if (type.getText().equals("Item")) 
			purchaseTypeCategory = PurchaseTypeCategory.ITEM ; 
		else if (type.getText().equals("Service"))
			purchaseTypeCategory = PurchaseTypeCategory.SERVICE ; 
		else if (type.getText().equals("Advance"))
			purchaseTypeCategory = PurchaseTypeCategory.ADVANCE ; 
		else if (type.getText().equals("Lost"))
			purchaseTypeCategory = PurchaseTypeCategory.LOST ; 
		else
			purchaseTypeCategory = PurchaseTypeCategory.OTHER ; 
		
		//////// Importance Category ///////
		ImportanceCategory importanceCategory = null ;
		if (importance.equals("Important"))
			importanceCategory = ImportanceCategory.IMPORTANT ; 
		else if (importance.equals("Very Important"))
			importanceCategory = ImportanceCategory.VERY_IMPORTANT ; 
		else if (importance.equals("Less Important"))
			importanceCategory = ImportanceCategory.LESS_IMPORTANT ;
		else if (importance.equals("Not Important"))
			importanceCategory = ImportanceCategory.NOT_IMPORTANT ;
		
		//////// Date ///////
		Date date = dateItem.getDate() ;
		
		Purchase purchase = new Purchase(purchaseTypeCategory, name, to, price, quantity, total, date, importanceCategory , description) ;
		database.addPurchase(purchase);
	}
	
	public void deletePurchase (int row) {
		database.deletePurchase(row);
	}
	
	public void saveToFile (File file) throws IOException {
		database.saveToFilex(file);
	}
	public void loadFromFile (File file) throws IOException {
		database.loadFromFile(file);
	}
	
	public List<Purchase> getPurchases () {
		return database.getPurchases() ; 
	}
	
	
}
