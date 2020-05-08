package JavaBasics;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		HashMap<Integer , Employee> hm = new HashMap<Integer , Employee>();
		
		Employee e1 = new Employee("Ram",1001,'M',"QA");
		Employee e2 = new Employee("Tom",1002,'M',"DEV");
		Employee e3 = new Employee("Jack",1003,'M',"IT");
		Employee e4 = new Employee("Kim",1004,'F',"HR");
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		hm.put(4, e4);
		
		hm.remove(3);  //remove a entry from hashmap
		
		for(Entry<Integer , Employee> m : hm.entrySet()) {
			
			int k = m.getKey();
			Employee emp = m.getValue();
			
			System.out.println("Employee : "+k+" details -" );
			System.out.println("Name:"+emp.name+"\t"+"Employee ID:"+emp.empID+"\t"+"Gender:"+emp.gender+"\t"+"Dept Name:"+emp.deptName);
			System.out.println(" ");
		}
	}

}
