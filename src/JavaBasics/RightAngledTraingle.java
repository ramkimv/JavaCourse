package JavaBasics;

public class RightAngledTraingle {

	public static void main(String[] args) {
		
		Object a[][] = new Object[5][5];
		
		a[0][0] = 1;
		a[0][1] = "";
		a[0][2] = "";
		a[0][3] = "";
		a[0][4] = "";
		a[1][0] = 1;
		a[1][1] = 2;
		a[1][2] = "";
		a[1][3] = "";
		a[1][4] = "";
		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 3;
		a[2][3] = "";
		a[2][4] = "";
		a[3][0] = 1;
		a[3][1] = 2;
		a[3][2] = 3;
		a[3][3] = 4;
		a[3][4] = "";
		a[4][0] = 1;
		a[4][1] = 2;
		a[4][2] = 3;
		a[4][3] = 4;
		a[4][4] = "";
		for(int row = 0; row<a.length;row++) {
			for(int col = 0; col<a[row].length;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println(" ");
		}

	}

}
