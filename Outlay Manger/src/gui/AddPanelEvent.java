package gui;
import java.util.EventObject;

public class AddPanelEvent extends EventObject {

	private String name ; 
	private TypeList type ;
	private String to ;
	private double price ; 
	private int quantity ;
	private double total ;
	private DateItem date ; 
	private String importance ; 
	private String description ; 
	
	public AddPanelEvent(Object source , String name , TypeList type , String to , double price , int quantity , double total , DateItem date , String importance , String description) throws Exception {
		super(source);
		
		/////////// Exceptions ///////////
		boolean isItem = type.getText().equals("Item");
		boolean isService = type.getText().equals("Service");
		boolean isAdvance = type.getText().equals("Advance");
		boolean isLost = type.getText().equals("Lost");
		boolean isOther = type.getText().equals("Other");
		
		if ( name.isEmpty() && ( isItem || isService || isOther ))
			throw new Exception ("Please , Fill The Name Field");
		if ( to.isEmpty() && isAdvance )
			throw new Exception ("Please , Fille the (to) Field");
		if (price <= 0 ) 
			throw new Exception ("The Price Can't Be Zero Or Less");
		if (quantity < 1)
			throw new Exception ("The Quantity Should Be More Than Zero");
		if ( isItem || isService || isOther ) {
			to = "X" ;
		}
		if ( isAdvance ) 
			name = "X" ; 
		if ( isLost ) {
			name = "X" ;
			to = "X" ; 
		}
		
		this.name = name ; 	
		this.type = type ; 
		this.to = to ; 
		this.price = price ; 
		this.quantity = quantity ;
		this.total = total ; 
		this.date = date ; 
		this.importance = importance ; 
		this.description = description ; 
	}
	
	public String getDescription() {
		return description;
	}
	public String getTo() {
		return to;
	}
	public String getImportance() {
		return importance;
	}
	public String getName() {
		return name;
	}
	public TypeList getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotal() {
		return total ; 
	}
	public DateItem getDateItem () {
		return date ; 
	}
}
