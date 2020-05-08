package JavaBasics;

public class ReverseAInteger {

	public static void main(String[] args) {
		
		long num = 855321267;
		
		long rev = 0;
		
		while(num != 0) {
			rev = rev * 10 + num % 10 ; //to reverse a integer logic
			num = num / 10;
		}
		
		System.out.println("*****Using logic integer is reversed: "+rev);		
		
		//String buffer is used to convert the long value to string or int value to string and then reverse
		
		long num1 = 855321267;
		System.out.println("*****Using String buffer reversed: "+new StringBuffer(String.valueOf(num1)).reverse());

	}

}
