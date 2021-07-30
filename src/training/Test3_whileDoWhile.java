package training;

public class Test3_whileDoWhile
{
	public static void main(String[] args) {
		

//	while
//	1~100 출력하고 거꾸로 100~1출력
	int num = 1; 
	

	while(num <= 100) {
		System.out.println(num++);
	} /*여기서 나왔을 때 왜 101*/
	
	do {
		System.out.println(--num);
	}while(num >= 1);
//		num += i;
//		i++;
//	}
//	do {
//		num -= i;
//		i--;
//	}while  {
//		(i>=100)
//		num >= 100
//	}
	}
	}

