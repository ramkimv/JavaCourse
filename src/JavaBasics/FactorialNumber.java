package JavaBasics;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num = 7;
		int facto  = 1;
		
		if(num<0) {
			System.out.println("Factorial is not defined for negative numbers");
		}
		else {
			for(int i = num; i>=1 ; i--) {
				facto = facto * i;
			}
			System.out.println("The Factorial of "+num+" is "+facto);
	}
	}
}
