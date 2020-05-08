package OOPSconcept2;

public class testBank {

	public static void main(String[] args) {
		System.out.println(USbank.minbalance);
		
		//dynamic Polymorphism - Child class object can be referred by parent interface reference variable
		USbank us = new HDFCbank();
		us.credit();
		us.debit();
		us.homeloan();
		
		UKbank uk = new HDFCbank();
		uk.carloan();

	}

}
