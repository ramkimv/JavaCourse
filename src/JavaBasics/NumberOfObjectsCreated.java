package JavaBasics;

public class NumberOfObjectsCreated {
	
	 static class A{
		
		static int a;
		public A() {
			a++;
		}
	
	
	public void counter() {
		System.out.println(a);
	}
	}
	public static void main(String[] args) {
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		
		obj1.counter();
		

	}
}
