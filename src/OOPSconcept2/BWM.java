package OOPSconcept2;

public class BWM extends Car{ //inheritance - has a relationship
	
	public void start() { //Method overriding because same method is available in parent class - car
		System.out.println("BMW engine starts");
	}
	
	public void theftSafety() {
		System.out.println("Antitheft control");
	}

}
