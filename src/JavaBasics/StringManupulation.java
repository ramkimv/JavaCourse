package JavaBasics;

public class StringManupulation {

	public static void main(String[] args) {
		
		String s = "The Quick Fox Jumps over the Fence";
		String s1 = "The Quick Fox Jumps Over the Fence";
		
		System.out.println(s.length()); //gives total length of string
		System.out.println(s.charAt(14)); // character at the index provided
		
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf('o', s.indexOf('o')+1)); //2nd occurence
		
		System.out.println(s.indexOf("the"));
		System.out.println(s.equals(s1)); //will compare with case sensitive
		System.out.println(s.equalsIgnoreCase(s1)); //ignore the case sensitive
		
		System.out.println(s.substring(10, 20)); //start index and end index mentioned to show the sub string
		
		String s2 = "     Dangerous $%DAve   ";
		//System.out.println(s2.trim());
		
		System.out.println(s2.replace(" ", ""));
		System.out.println(s2.replace(" ", "-"));
				
		
		
	}

}
