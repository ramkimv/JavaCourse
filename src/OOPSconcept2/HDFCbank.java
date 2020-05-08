package OOPSconcept2;

public class HDFCbank implements USbank,UKbank { //Multiple inheritance - Interface concepts
	//Is a relationship

	//If a class is implementing any interface, then its mandatory to define/override all the methods of interface
	
	//Overriding from USbank
	public void credit() {
		System.out.println("HDFC -- Credit");
	}
	
	public void debit() {
		System.out.println("HDFC -- Debit");
	}
	
	public void homeloan() {
		System.out.println("HDFC -- home loan");
	}
	
	//Overriding from UKbank
	
	public void carloan() {
		System.out.println("HDFC -- Car Loan");
	}
}
