package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		ll.add("Ramakrishna");
		ll.add("Dinesh");
		ll.add("Velu");
		ll.add("Rohit");
		ll.add("Yeshu");
		
		System.out.println("Contents of list: "+ll);
		ll.addFirst("Anand");
		System.out.println("Contents of list: "+ll);
		ll.addLast("Zenab");
		System.out.println("Contents of list: "+ll);
		
		ll.removeFirst();
		System.out.println("Contents of list: "+ll);
		
		//Looping
		System.out.println("*******Using For Loop");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//foreach - advanced for loop
		System.out.println("*******Using Advanced For Loop");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//Iterator
		System.out.println("*******Using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//While loop
		System.out.println("*******Using while loop");
		int n =0;
		while(n<ll.size()) {
			System.out.println(ll.get(n));
			n++;
		}
		
		
		
	}

}
