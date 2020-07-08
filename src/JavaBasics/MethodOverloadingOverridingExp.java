package JavaBasics;

public class MethodOverloadingOverridingExp {


	public static void main(String[] args) {
		A1 a = new A1();
		a.show(3.4);
		B1 b = new B1();// Parent class reference variable we can create object of child class but child class ref variable we cannot 
		b.show(20, 34);  //create object  of parent class. Child can take parents qualities but parent can't take child qualities
		b.show();
	}
}
	class A1
	{
		public void show() { //overloading - Compile time polymorphism - Static binding , Early binding
			System.out.println("Hello from A1");
		}
		
		public void show(int i) {
			System.out.println("Hello from A1 with int"+i);
		}
		
		public void show(int i, int j) {
			System.out.println("Hello from A1 with int has 2 values "+i+" "+j);
		}
		public void show(double i) {
			System.out.println("Hello from A1 with double "+i);
		}
		
	}
	class B1 extends A1
	{
		public void show() {   //overriding - run time polymorphism - Late Binding , Dynamic binding
			System.out.println("Hello from B1");
		}
	}

