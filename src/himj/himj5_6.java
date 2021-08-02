package himj;

public class himj5_6 {
	public static void main(String[] args) {
	
		
		for (int i = 1; i < 5; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
			
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j =4; j >0; j--) {
				if (i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		(i , j) (1,4)""(2,4)""(3,4)""(4,4)* 
//				 (4,3)* ????
	
	}
}
