package himj;

public class himj3 {
	public static void main(String[] args) {
//		while문과 Math.random()메소드를 이용해 2개의 주사위. (눈1,눈2) 으로 출력.
//		눈의 합이 5이면 출력을 멈추는 코드(1,4)(4,1)(2,3)(3,2)
		int sum = 0;
		int 눈1 = 0;
		int 눈2 = 0;
		
		
		while (sum != 5) {
			
			눈1 = (int) (Math.random() * 6) + 1;
			눈2 = (int) (Math.random() * 6) + 1;
			sum = 눈1 + 눈2;
			System.out.println( 눈1 + "," + 눈2 );
		}
		System.out.println("눈1+눈2의 합 : 5");
	}

}
