package OOPSconcept2;

public class testCar {

	public static void main(String[] args) {
		
		
		//static polymorphism - Compile time polymorphism
		
		BWM obj = new BWM();
		
		obj.start();
		obj.stop();
		obj.theftSafety();
		obj.refuel();
		
		System.out.println("******************************");
		
		//top -cast - Child class object can be referred by parent class reference variable - dynamic polymorphism 
		//or runtime polymorphism
		
		Car c = new BWM();
		c.start();
		c.stop();
		c.refuel();
	
		//down casting is possible but run time exception - ClassCastException
//		BWM b = (BWM) new Car();
//		b.start();
//		b.theftSafety();
		
		
		

	}

}
