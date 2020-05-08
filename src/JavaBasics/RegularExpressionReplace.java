package JavaBasics;

public class RegularExpressionReplace {

	public static void main(String[] args) {
		
		String s = "@##@#@#@$$%$56454545454 dfdfdfdfdf true test DATA%&^&^*(#$#%$%";
		
		s = s.replaceAll("[^a-z A-Z 0-9]", ""); //regular expression 
		// ^ not is used to say which does not belong to these characters to be removed
		
		System.out.println(s);
		

	}

}
