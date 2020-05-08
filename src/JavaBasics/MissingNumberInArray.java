package JavaBasics;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int arr[]= {0,1,2,3,4,6,7,8};
		
		int sum = 0;
		int sum1 = 0;
		for(int i=0;i<arr.length; i++) {   //logic to find missing number 
			 sum = sum + arr[i];
		}
		System.out.println(sum); //sum the values in the array
		
		for(int j=0;j<=8;j++) {
			 sum1 = sum1 + j;
		}
		System.out.println(sum1); //sum the complete sequence
		System.out.println("The missing number is "+(sum1-sum)); //difference between both sum is the missing number
		
	}

}
