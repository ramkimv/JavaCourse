package JavaBasics;

public class SwapTwoIntegerValue {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
		//using temp value-
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping with temp value");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
		//without temp value - 
		
		int a1 = 10;
		int b1 = 20;
		
		b1 = b1 - a1 ;
		a1 = a1 + b1;
		
		System.out.println("After Swapping without temp value");
		System.out.println("The value of a: "+a1);
		System.out.println("The value of b: "+b1);

	}

}
