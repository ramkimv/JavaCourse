package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String ar[] = {"car", "bike" , "bus", "truck", "train", "bus" ,"truck"};
		
		for(int i=0; i<ar.length;i++) {   //worst way of finding - O(n^n)
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i].equals(ar[j])) {
				System.out.println("Duplicate values:"+ar[i]);
			}
		}

	}
		Set<String> str = new HashSet(); ///Through hashset - time complexity - O(n)
		for(String name : ar) {
			if(str.add(name)==false) {
				System.out.println("Duplicate value by set: "+name);
			}
		}
		
		

}
}
		
