package JavaBasics;

public class LargestNSmallestNumber {

	public static void main(String[] args) {
		
		int num[] = {23 , 45, -789 , 0 , -3456, -120000};
		
		int large = num[0];
		int small = num[0];
		
		for(int i = 1 ; i<num.length ; i++) {
			
			if(large<num[i]) {
				large = num[i];
			}
			else if(small>num[i]) {
				small = num[i];
			}
			
		}
		
		System.out.println("Largest number: "+large);
		System.out.println("Smallest number: "+small);
	}

}
