package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
		al.add(1);
		
		System.out.println(al.get(0));
		
		//Employee - User defined class objects
		
		Employee e1 = new Employee("Ramakrishna", 1001 , 'M',"Testing");
		Employee e2 = new Employee("RameshPraba", 1002 , 'M',"Developer");
		Employee e3 = new Employee("Angelina", 1003 , 'F',"Dev Lead");
		Employee e4 = new Employee("DanaBrooks", 1004 , 'F',"HR"); 
		
		ArrayList<Employee> emp = new ArrayList<Employee>(); //Array list 
		emp.add(e1);										// Add items in list
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		//iteration through iterator
		
		Iterator<Employee> it = emp.iterator();
		
		System.out.println("Name"+"\t\t"+"EmpID"+"\t"+"Gender"+"\t"+"Dept");
		while(it.hasNext()) {  
			Employee emp1 = it.next();
			{
			System.out.print(emp1.name+"\t");
			System.out.print(emp1.empID+"\t");
			System.out.print(emp1.gender+"\t");
			System.out.print(emp1.deptName+"\t");
			}
			System.out.println(" ");		
		}
		
		
		
		
		

	}

}
