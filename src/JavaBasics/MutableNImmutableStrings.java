package JavaBasics;

public class MutableNImmutableStrings {

	public static void main(String[] args) {
		String str = "Rama";
		str = "Krishna"; //here the value is not getting replaced object is created as a fresh so thats y its immutable
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Rama"); //StringBuffer will make it as mutable and can perform various actions
		//We can also use StringBuilder but only drawback is its not Thread safe
		sb.append("krishna");
		System.out.println(sb);

	}

}
