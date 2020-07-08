package JavaBasics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 = 153
		int num = 456;
		long actualnum = num;
		
		double result = 1;
		
		while (actualnum != 0) {
			long n = actualnum % 10;
			result = result + Math.pow(n, 3);
			
			actualnum = actualnum/10;
			
		}
		
		if(result == num) {
			System.out.println(num+" is an armstrong number");
		}else {
			System.out.println(num+" is not an armstrong number");
		}
		
		

	}

}
