package JavaBasics;

import java.util.Scanner;

public class CheckCharIsAlphabetOrNot {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		
		char ch = reader.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>= 'A' && ch<='Z') {
			System.out.println("Entered Character "+ch+" is a Alphabet");
		}
		else {
			System.out.println(ch+" is not a Alphabet");
		}
		
	}

}
