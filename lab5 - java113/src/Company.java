
public class Company {

	private String name; 
    private Employee[] arrE ; 
    public int nbE ; 
    
    public Company ( String name , int size ) {
    	this.name = name ; 
    	this.arrE = new Employee[size] ;
    	this.nbE = 0 ;
    }
    
    public boolean addEmployee ( Employee e ) {
    	if ( nbE < arrE.length ) {
    		if ( e instanceof Manger ) 
    			arrE[nbE] = new Manger ( (Manger) e);
    		else if ( e instanceof Consultant ) 
    			arrE[nbE] = new Consultant ( (Consultant) e ) ;
    		else 
    			arrE[nbE] = new Employee (e) ; 
    		nbE++;
    		return true ; 
    	}
    	else 
    		return false ; 
    }
    
    public void displayAll () {
    	for ( int i = 0 ; i < nbE ; i++ ) {
    		arrE[i].display();
    	}
    }
    
    public int countConsultant () { 
    	int nbC = 0 ; 
    	for ( int i = 0 ; i < nbE ; i++) {
    		if ( arrE[i] instanceof Consultant ) {
    			nbC++;
    		}
    	}
    	return nbC ; 
    }
    
    public Employee[] getHighSalary ( double s ) {

    	Employee[] arrE = new Employee [nbE] ;
    	int count = 0 ; 
    			
    	for ( int i = 0 ; i < nbE ; i++ ) {
    		if ( this.arrE[i].calculateSalary() > s ) {
    			arrE[count] = this.arrE[i]; 
    			count++;
    		}
    	}
    	return arrE ; 
    }
    
    public Manger[] getManger ( int n ) {
    	Manger[] arrM = new Manger [ nbE ] ;
    	int count = 0 ; 
    	Manger m ; 
    	
    	for ( int i = 0 ; i < nbE ; i++ ) {
    		if ( arrE[i] instanceof Manger ){
    			m = (Manger) arrE[i] ;
    			if (m.getNbEmps() > n ) {
    				arrM[i] = m; 
    				count++;
    			}
    		}
    	}
    	
    	return arrM ;
    }
    
    
}
