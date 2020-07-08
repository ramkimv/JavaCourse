package JavaBasics;

import java.util.*;

public class DuplicateValueInAString {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String s = "acccessories";
//		for(int i=0; i<s.length(); i++) {
//			for(int j=i+1; j<s.length(); j++) {
//				if(s.charAt(i) == s.charAt(j)) {
//					System.out.println(s.charAt(j)+" is repeated");
//					break;
//				}		
//			}
//		}
		char[] ch = s.toCharArray();
		Set<Character> st = new HashSet<Character>();
		for(int n=0; n<ch.length ; n++) {
			if(st.add(ch[n]) == false)  {
				System.out.println("Repeated character is "+ch[n]);
			}
		}
		
	}

}
