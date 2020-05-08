package JavaBasics;

public class EncapsulationProtect {
	
	protected String name; //Protected variables can be accessed only if the class is in same package or inherited class in different 
	protected int aadhar;	//package
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected void new1() {
		System.out.println("new method is accessed");
	}

}
