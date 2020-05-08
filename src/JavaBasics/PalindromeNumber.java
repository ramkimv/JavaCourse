package JavaBasics;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void isPalindrome(int num) {
		System.out.println("Actual number is "+num);
		int r = 0;
		int sum= 0;
		 
		int t = num;
		
		while(num>0) {
			r=num % 10;
			sum = (sum * 10)+r;
			
			num = num/10;	
		}
		
		if(sum==t) {
			System.out.println("The reverse number is "+sum);
			System.out.println("The number "+t+" is a Palindrome");
			
		}else {
			System.out.println("The reverse number is "+sum);
			System.out.println("The number "+t+" is not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		
		int number = read.nextInt();
		
		
		isPalindrome(number);
	}
}
