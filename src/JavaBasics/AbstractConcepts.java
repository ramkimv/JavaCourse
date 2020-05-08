package JavaBasics;

public abstract class AbstractConcepts {
	
	abstract void drawing(); //Abstract method
	
	public void fill() {
		System.out.println("fill color");
	}
	
	public AbstractConcepts() {
		
	}
	
	//Non abstract method can be created in abstract class
	//object of abstract class cannot be created in abstract class and interface
	
	

}
