package model;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static int count = 0 ; 
	private int iD ; 
	private PurchaseTypeCategory purchaseType ; 
	private String name ;
	private String to ; 
	private double price ; 
	private int quantity ; 
	private double total ; 
	private Date date ; 
	private ImportanceCategory importance ; 
	private String description ;
	
	public Purchase(PurchaseTypeCategory purchaseType, String name, String to, double price, int quantity, double total, Date date, ImportanceCategory importance, String descriotion) {
		this.purchaseType = purchaseType;
		this.name = name;
		this.to = to;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.date = date;
		this.importance = importance;
		this.description = descriotion;
		// setting the count and the ID 
		this.iD = count ; 
		count++ ;
	}
	
	public void display () {
		System.out.println("Adding Item > \nName : " + name
						+ "\nType : " + purchaseType
						+ "\nPrice : " + price 
						+ "\nQuantity :" + quantity + "\nTotal :" + total 
						+ "\nDate : " + date
						+ "\nImportance : " + importance 
						+ "\nItem has been added ...\n\n");
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Purchase.count = count;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public PurchaseTypeCategory getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(PurchaseTypeCategory purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ImportanceCategory getImportance() {
		return importance;
	}
	public void setImportance(ImportanceCategory importance) {
		this.importance = importance;
	}
	public String getDescriotion() {
		return description;
	}
	public void setDescriotion(String descriotion) {
		this.description = descriotion;
	} 
	
	
	
	
}
