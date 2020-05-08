package JavaBasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstnum = 0 ; 
		int secondnum = 1 ; 
		
		System.out.println("Fibanacci series");
		for(int i = 1 ; i<=10 ; i++) {
			System.out.print(firstnum+" ");
			int sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
		}
		
	}

}
