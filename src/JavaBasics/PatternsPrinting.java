package JavaBasics;

public class PatternsPrinting {

	public static void main(String[] args) {
		
		//Square printing
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Right angled triangle
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Hollow square
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||i==4||j==1||j==4) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
	}
		System.out.println("\n----------------------\n");
		//Print numbers
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Print numbers 1-4 in square pattern
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				int k = i+j-1;
				if(k>4) {
					System.out.print(" "+(k-4)+" ");
				}else {
					System.out.print(" "+k+" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Print 0 and 1 in right angled triangle pattern
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2 == 0) {
				System.out.print(" 1 ");
				}else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Print in right angled triangle pattern with increasing numbers
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		//Print triangle pattern
		int n = 4;
		for(int i=1;i<=n;i++) {
			for (int j=n; j>=i; j--) 
            { 
                System.out.print(" "); 
            } 
			for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
			System.out.println();
		}
}
}
