package OOPSconcept2;

public interface USbank {

	int minbalance = 1000;
	
	public void credit();
	
	public void debit();
	
	public void homeloan();
	
	//only method declaration
	//no method body - only method prototype
	//in interface, we can declare variables, all variables are by default static in nature
	//variable value will not be changed
	//no static method in interface
	//no main method in interface
	//we cannot create the object of interface
	//interface is abstract in nature
	//abstraction is a process of hiding the implementation details , actual method implementation/ business logic is in child class
}
