package JavaBasics;

import java.util.Scanner;

public class PrimeNumberOrComposite {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		
		System.out.println("The Prime numbers from 0 to "+num+" are :");
		for(int i = 2 ; i <= num ; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + ",");
			}
			}
		
	}

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = reader.nextInt();
		
		getPrimeNumber(number);

	}

}
