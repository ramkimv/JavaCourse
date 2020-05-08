package JavaBasics;

public class Car {
	
	String model;
	int mfg;
	int wheels;

	public static void main(String[] args) {
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = "BMW";
		a.mfg = 2014;
		a.wheels = 4;
		
		b.model = "Merc Benz";
		b.mfg = 2019;
		b.wheels = 4;

		c.model = "Volvo";
		c.mfg = 2020;
		c.wheels = 6;

		System.out.println("Model"+"\t"+ "Manufactured Year" +"\t"+ "Wheels");
		
	}

}
