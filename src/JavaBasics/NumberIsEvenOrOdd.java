package JavaBasics;

import java.util.Scanner;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = reader.nextInt();
		
		if((number % 2) == 0) {
			System.out.println("The number is a Even number");
		}
		else {
			System.out.println("The number is an Odd number");
		}
		
	}

}
