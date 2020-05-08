package JavaBasics;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num = 14;
		int endnum = 12;
		System.out.println("The multiplication table of "+num);
		for(int i = 1 ; i<= endnum ; i++ ) {
			System.out.println(num+ " x "+i+" = "+(num*i));
			
		}
		
	}

}
