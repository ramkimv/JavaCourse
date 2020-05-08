package JavaBasics;

public class EncapsulationConcepts {
	//how to implement encapsulation
	//private data variables : so that these variables cannot be accessed outside the class
	private int aadhar;
	private String name; //declaring private in variables of this class
	private int age;
	
	public static void main(String[] args) {
		
		EncapsulationConcepts pr = new EncapsulationConcepts();
		pr.setAadhar(123456);
		pr.setName("Rama");
		pr.setAge(29);      
		
		System.out.println("Employee name : "+pr.getName());
		System.out.println("Employee age: "+pr.getAge());
		System.out.println("Aadhar: "+pr.getAadhar());

	}

	//getter and setter - created - to set and get the values from the fields
	
	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
