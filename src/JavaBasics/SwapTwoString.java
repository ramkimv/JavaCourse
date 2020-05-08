package JavaBasics;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String a = "Java";
		String b = "Practice";
		
		System.out.println("Before Swapping");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		System.out.println("After Swapping");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
	}

}
