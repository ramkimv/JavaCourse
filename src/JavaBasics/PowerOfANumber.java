package JavaBasics;

public class PowerOfANumber {

	public static void main(String[] args) {
	int num = 5;
	int power = 4 ;
	
	long result = 1;
	
	while (power != 0) {
		result *= num;
		--power;
	}
	System.out.println(result);

	}

}
