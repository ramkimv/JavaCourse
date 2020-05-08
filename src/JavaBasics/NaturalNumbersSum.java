package JavaBasics;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		
	int num = 100;
	int sum = 0;
	
	for(int i = 0; i<=num; i++) {
		sum = sum + i;
	}
	System.out.println("The sum of natural numbers from 0 to "+num+" is "+sum);
	}

}
