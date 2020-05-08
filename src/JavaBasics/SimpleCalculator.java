package JavaBasics;

public class SimpleCalculator {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 10;
		
		switch(5) {	
		case 1:
			add(num1 , num2);
			break;
		case 2:
			subtract(num1 , num2);
			break;
		case 3:
			multiply(num1 , num2);
			break;
		case 4:
			division(num1 , num2);
			break;
		case 5:
			modulus(num1 , num2);
			break;
		
		}

	}
	public static void add(int a , int b) {
		System.out.println("The addition of two number :"+(a+b));
		
	}
	public static void subtract(int a , int b) {
		System.out.println("The subtraction of two number :"+(a-b));
	}
	public static void multiply(int a , int b) {
		System.out.println("The product of two number :"+(a*b));
		
	}
	public static void division(int a , int b) {
		System.out.println("The division of two number :"+(a/b));
	}
	public static void modulus(int a , int b) {
		System.out.println("The reminder of two number :"+(a%b));
	}
	
}
