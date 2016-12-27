package gui;
import java.util.EventObject;

public class MenuBarEvent extends EventObject {

	private boolean showAddPurchase ;
	
	public MenuBarEvent(Object source , boolean showAddPurchase ) {
		super(source);
		this.showAddPurchase = showAddPurchase ;
	}

	public boolean getShowAddPurchase() {
		return showAddPurchase;
	}
	
}
