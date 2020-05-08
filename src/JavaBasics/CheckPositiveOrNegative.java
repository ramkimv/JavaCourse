package JavaBasics;

import java.util.Scanner;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = reader.nextInt();
		
		if(Integer.signum(number) == 1) {
			System.out.println(number+" is a positive number");
		}
		else if(Integer.signum(number) == -1){
			System.out.println(number+" is a negative number");
			
		}
		else {
			System.out.println("The number 0 and its neither positive nor negative number");
		}

	}

}
