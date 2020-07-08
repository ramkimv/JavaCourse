package JavaBasics;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Enter a operation to perform (+ , - , * , / , % ) : ");
		char operation = scan.next().charAt(0);
		
		switch(operation) {	
		case '+':
			add(num1 , num2);
			break;
		case '-':
			subtract(num1 , num2);
			break;
		case '*':
			multiply(num1 , num2);
			break;
		case '/':
			division(num1 , num2);
			break;
		case '%':
			modulus(num1 , num2);
			break;
		default:
			System.out.println("Please select a correct operation");
		}

	}
	public static void add(double num1 , double num2) {
		System.out.println("The addition of two number :"+(num1+num2));
		
	}
	public static void subtract(double a , double b) {
		System.out.println("The subtraction of two number :"+(a-b));
	}
	public static void multiply(double a , double b) {
		System.out.println("The product of two number :"+(a*b));
		
	}
	public static void division(double a , double b) {
		System.out.println("The division of two number :"+(a/b));
	}
	public static void modulus(double a , double b) {
		System.out.println("The reminder of two number :"+(a%b));
	}
	
}
