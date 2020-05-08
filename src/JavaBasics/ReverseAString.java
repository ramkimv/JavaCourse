package JavaBasics;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "grade";  //String is immutable object so reverse() wont be available
		
		int len = s.length();
		
		String rev = "";
		for(int i = len-1; i>=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("************Using for loop Reveresed word is " +rev);
		
		boolean palindrome = rev.equalsIgnoreCase(s);
		if(palindrome == true) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
			
		}
		
//	
//		StringBuffer sf = new StringBuffer(s); //StringBuffer is mutable  object and reverse function is available
//		System.out.println("************Using String buffer "+sf.reverse());
	}
