package ch04_2_switch;

public class BreakOutterExample {
	public static void main(String[] args) {
		Exit:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Exit; //Exit은 내가 정한 이름
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}

}
