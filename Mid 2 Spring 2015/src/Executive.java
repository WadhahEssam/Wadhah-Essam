
public class Executive extends Ministry {
	
	private double expenses ;

	public Executive(String name, int nbEmp, double expenses) {
		super(name, nbEmp);
		this.expenses = expenses;
	}
	
	public Executive (Executive e ) {
		super(e) ; 
		this.expenses = e.expenses ; 
	}

	public double getExpenses() {
		return expenses;
	} 
	
	public double calculateBudget () {
		return this.expenses + super.getNbEmployee() * 1.5 ; 
	}
	
	public void display () {
		super.display();
		System.out.println("Expenses : " + this.expenses );
	}
}
