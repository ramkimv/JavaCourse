package JavaBasics;

public class FinallyConcepts {

	public static void main(String[] args) {
		test1();
	}	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("Test");
		}catch(Exception e) {
			System.out.println("Catch exception");
		}
		finally { //finally is a block which will execute if the exception occurs or not occur
			System.out.println("Print finally block");
		}
	}

}
