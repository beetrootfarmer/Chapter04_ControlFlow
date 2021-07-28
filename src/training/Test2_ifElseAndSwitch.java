package training;

public class Test2_ifElseAndSwitch {
	public static void main(String[] args) {
		
//		[switch문으로 바꿔보세요오]
		
		
//		int n = 24;
//		if(n >= 0 && n <10) {
//			System.out.println("0 이상 10 미만의 수");
//		
//		}
//		else if(n >=10 && n < 20) {
//			System.out.println("10이상 20미만의 수");
//		}
//		else if(n >=20 && n < 30) {
//			System.out.println("20이상 30미만의 수");
//		}
//		else {
//			System.out.println("음수 혹은 30 이상의 수");
			
		int n = (int)(Math.random()*100);/*왜 100을 곱하죠*/
		System.out.println(n);
		
		int num = n / 10;

		switch (num) {
		
		case 0:
				System.out.println("0 이상 10 미만의 수");
				break;
	
		case 1:
				System.out.println("10이상 20미만의 수");
				break;			
		case 2:
				System.out.println("20이상 30미만의 수");
				break;
		case 3:
				System.out.println("30이상 40미만의 수");
				break;
		case 4:
				System.out.println("40이상 50미만의 수");
				break;
		default:
				System.out.println("음수 혹은 50 이상의 수");
				break;
		}
	}

}

// [성적표 코드로 활용하기]

//int n = (int)(Math.random()*100);
//System.out.println(n);
//
//int num = n / 10;
//
//switch (num) {
//
//case 10:
//		System.out.println("A+");
//		break;
//
//case 9:
//		System.out.println("A");
//		break;			
//case 8:
//		System.out.println("B");
//		break;
//case 7:
//		System.out.println("C");
//		break;
//case 6:
//		System.out.println("D");
//		break;
//default:
//		System.out.println("F");
//		break;
//}}}