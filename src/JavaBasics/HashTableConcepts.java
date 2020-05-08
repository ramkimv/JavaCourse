package JavaBasics;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
	
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		
		ht.put(1,1001);
		ht.put(2,1002);
		ht.put(3,1003);
		
		System.out.println(ht.get(3));
		
	}

}
