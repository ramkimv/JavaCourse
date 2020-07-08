package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013,1458, 2165, 1254, 1472, 2365,1456, 2165, 1457, 2456};
		Set<Integer> arr = new HashSet<Integer>();
		for(int n : my_array1) {
			if(arr.add(n)==false) {
				System.out.println("duplicate value "+n);
			}
			
		}
		
	}

}
