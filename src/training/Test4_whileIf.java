package training;

public class Test4_whileIf {
	public static void main(String[] args) {
//		[1000���� �ڿ��� (�ڿ����� 0 ������) �߿��� 2�� ������� 7�� ����� ���� ����ϰ�
// 		�� ������ ������ ���...]
//		(while�� �̿�)
		
		int num = 1;
		int sum = 0; /*���� ���ϴ� �Ŀ��� ��Ż�� �ʱ�ȭ�ϱ�*/
		
		while (num<=1000) {
			
			if  ((num % 2)== 0 && (num % 7) == 0);
			System.out.println(num);
			sum +=num;
					}
		num++;
	}
		
		System.out.println("����: " + sum);
	
	}
		
		


