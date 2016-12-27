import java.awt.Dimension;

import javax.swing.JPanel;

public class Panel extends JPanel{

	public Panel () {
		super() ; 
		Dimension d = this.getPreferredSize() ; 
		d.width = 400 ; 
		this.setPreferredSize(d);
		this.setVisible(true);
	}
}
