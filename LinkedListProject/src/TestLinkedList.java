

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedListOfMeals meals = new LinkedListOfMeals () ;
		
		Meal m1 = new Meal ("����" , 40);
		Meal m2 = new Meal ("���" , 30);
		Meal m3 = new Meal ("���" , 60);
		Meal m4 = new Meal ("����" , 10);
		
		
		meals.addSorted(m1);
		meals.addSorted(m2);
		meals.addSorted(m3);
		meals.addSorted(m4); 
		
		meals .display();
		
		System.out.println();
		
		meals.delete(m1); 
		
		meals .display();

		
	}
	

}

