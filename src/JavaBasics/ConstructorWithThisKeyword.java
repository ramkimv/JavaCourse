package JavaBasics;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name , int age) {
		
		this.name = name;  //this is referring to the current class global variables
		this.age = age;		//
		
		System.out.println("Name: "+name+"\t"+"Age: "+age);
		
	}

	public static void main(String[] args) {
	
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Rama", 30);
		
	}

}
