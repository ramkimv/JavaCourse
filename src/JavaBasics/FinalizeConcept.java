package JavaBasics;

public class FinalizeConcept {

	public void finalize() { //finalize is a method 
		System.out.println("finnalize");
	}
	
	public static void main(String[] args) {
		FinalizeConcept a1 = new FinalizeConcept();
		FinalizeConcept a2 = new FinalizeConcept();
		
		a1 = null;
		a2 = null;
		
	System.gc();

	}

}
