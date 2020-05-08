package JavaBasics;

public class NonStaticFunctions {
	
	String g1 = "Global variables"; //Global variables - non static
	int z = 10000;	//non static variable
	int y = 23000;
	static int st = 345; //Static variable

	public static void main(String[] args) {
		
		NonStaticFunctions obj = new NonStaticFunctions(); //obj is object reference new is keyword to create a object
		
		int out1 = obj.add(30, 1000);
		System.out.println(out1);
		
		obj.new1();
		
		String out2 = obj.disp();
		System.out.println(out2);
		
		System.out.println(obj.g1);
		
		obj.new1(1876, 324);
		
		int out3 = division(150, 25); //Static method can be called without the object or by classname.static method
		System.out.println(out3);
		
		int out4 = NonStaticFunctions.division(360, 6); //Static method called using classname
		System.out.println(out4);
		
		System.out.println(st); //Static global variable is called directly
		System.out.println(obj.z); 
		
		//Wrapper class  - type conversion
		String a1 = "1234";
		System.out.println(a1+20);		
		
		int i1 = Integer.parseInt(a1); //parse can be used for converting string to int , decimal, boolean
		
		System.out.println(i1+30);
		
		int a2 = 230;
		String a3 = String.valueOf(a2);
		
		System.out.println(a3+54); //int is converted to string and concatenated 
		
		//Call by value or pass by value
		int c1 = 300;
		int c2 = 400;
		
		int c3 = obj.add(c1, c2);
		System.out.println(c3);
		
		//call by reference by using Object references
		
		obj.swap(obj);
		System.out.println("Value of z ="+obj.z);
		System.out.println("Value of y ="+obj.y);
		

	}
	
	public void new1() {
		System.out.println("Printing the dummy values");
	}
	
	//We can overload main method also
	//Cannot create a method inside a method
	//duplicate methods with same method name with same number of arguments are not allowed
	
	public void new1(int i , int j) { //Method overloading -When Method name is same with different arguments or data type and Input parameters within the class 
		System.out.println("Addition of two values: "+(i+j) );
	}
	
	public int add(int x , int y) {	//parameters passing 
		System.out.println("Adding values through parameters");
		int z = x+y;	
		return z;
		
	}
	
	public static int division(int a, int b) { // Static method
		 
		System.out.println("Dividing two values");
		
		int c = a/b;
		return c;
	}
	
	public String disp() {
		
		System.out.println("Printing string values");
		String a1 = "Practicing Java programs"; //Local variables

		return a1;
		
	}
	
	public void swap(NonStaticFunctions t) { //call by reference
		
		int temp;
		temp = t.z;
		t.z = t.y;
		t.y = temp;
		
	}

}
