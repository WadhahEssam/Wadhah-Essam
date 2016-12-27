

public class Company {

private int [] id ; 
private String [] name ; 
private float [] salary ; 
private int current ; 


public Company ( int size ) {

this.name = new String [size] ; 
this.id = new int [size] ;
this.salary = new float [ size ] ; 
this.current = 0 ; 
}


public boolean addEmployee ( int i , String n , float s ) {

if ( current <= id.length ){ 
id[current] = i ; 
name[current]  = n ; 
salary[current] = s ; 
current++ ; 
return true ; 
}
else return false ; 
}


public int search ( int id ) { 
	
int matched = 0 ; 

while ( this.id[matched] != id  ||  ( this.current == this.id.length ) ){
matched++ ;
}

if ( this.id[matched] == id ) {
return matched ; 
}
else return -1 ; 
} 

public float findMaxSalary () {
int maxIndex = 0 ; 
for ( int i = 0 ; i != current ;  i++ ) {
if ( salary[i] > salary[maxIndex] )
maxIndex = i ; 
}
return salary[maxIndex];
}

public float findMinSalary () {
int minIndex = 0 ; 
for ( int i = 0 ; i != current ;  i++ ) {
if ( salary[i] < salary[minIndex] )
minIndex = i ; 
}
return salary[minIndex];
}


public float calculateTotalSalaries () {
float sum = 0 ; 
for ( int i = 0 ; i != current ; i++ ) 
 sum += salary[i] ;
return sum ;  
}

public float calculateAverageSalaries () {
float av = calculateTotalSalaries() / current ; 
return av ; 
}

public void printEmployeeDate ( int i ) {
int index = search(i) ;
if ( index == -1 ) 
System.out.println ( " employee isn't found  " ) ; 
else  {
System.out.println("--------------------------"); 
System.out.println("printing Employee Data"); 
System.out.println("--------------------------");
System.out.println("id: "+id[index]); 
System.out.println("name: "+name[index]); 
System.out.println("salary: "+salary[index]); 
System.out.println("--------------------------");
}
}











}
