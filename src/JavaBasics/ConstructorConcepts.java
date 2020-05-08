package JavaBasics;

public class ConstructorConcepts {
	
	public ConstructorConcepts() { //difference b/w constructor and a function is constructor does not return a value
		System.out.println("Default Constructor"); //we no need to mention a default construct ,it is called once a object is created. 
	}
	
	public ConstructorConcepts(int i) { //Constructor overloading - //constructor name will always be the class name
		System.out.println("Single params constructor");
		System.out.println(i);
	}
	
	public ConstructorConcepts(int i,String s) {
		System.out.println("Two Params constructor");
		System.out.println("Number value: "+i+"\t"+"Text value: "+s);
	}

	public static void main(String[] args) {
		ConstructorConcepts ob = new ConstructorConcepts(); //create a object the constructor will be called
		ConstructorConcepts ob1 = new ConstructorConcepts(120);
		ConstructorConcepts ob2 = new ConstructorConcepts(420,"Fraud case");

	}

}
