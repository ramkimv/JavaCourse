package JavaBasics;

public class B extends A{
	
	public B() {
		super(145); //super keyword should be the first statement in a constructor calling the parent constructor
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		B obj = new B();

	}

}
