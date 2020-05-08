package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		//single dimension array
		
		int i[] = new int[3];
		
		i[0] = 20;
		i[1] = 30;
		i[2] = 50;
		
		System.out.println(i[0]+i[2]);
		
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		
		//object array
		
		Object obj[] = new Object[6];
		
		obj[0] = "Ramakrishna";
		obj[1] = 'M';
		obj[2] = "07/12/1989";
		obj[3] = 730;
		obj[4] = 7.04;
		obj[5] = "Pass";
		
		System.out.println("Name    	Gender   DOB     Marks/1000   	CGPA  	Result");
		
		for(int j=0;j<obj.length;j++) {
			
			System.out.print(obj[j]+"\t"); 
			
		}
		
		String x[][] = new String [3][5];
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(" ");
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+"\t");
			}
			System.out.println(" ");
		}
		
	}

}
