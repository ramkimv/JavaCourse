package JavaBasics;

import java.util.Scanner;

public class PalindromeNumbersBetweenRange {
		

	public static boolean isPalindrome(int num) {
		
		int r = 0;
		int sum= 0;
		 
		int t = num;
		
		while(num>0) {
			r=num % 10;
			sum = (sum * 10)+r;
			
			num = num/10;	
		}
		if (sum == t) {
			return true;
		}
		else {
			return false;
		}
	}
		
		public static void getPrimeNumber(int num) {
			
			System.out.println("The Palindrome numbers from 0 to "+num+" are :");
			for(int i = 0 ; i <= num ; i++) {
				if(isPalindrome(i)) {
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
