package training;

public class Test2_ifElseAndSwitch {
	public static void main(String[] args) {
		
//		[switch������ �ٲ㺸�����]
		
		
//		int n = 24;
//		if(n >= 0 && n <10) {
//			System.out.println("0 �̻� 10 �̸��� ��");
//		
//		}
//		else if(n >=10 && n < 20) {
//			System.out.println("10�̻� 20�̸��� ��");
//		}
//		else if(n >=20 && n < 30) {
//			System.out.println("20�̻� 30�̸��� ��");
//		}
//		else {
//			System.out.println("���� Ȥ�� 30 �̻��� ��");
			
		int n = (int)(Math.random()*100);/*�� 100�� ������*/
		System.out.println(n);
		
		int num = n / 10;

		switch (num) {
		
		case 0:
				System.out.println("0 �̻� 10 �̸��� ��");
				break;
	
		case 1:
				System.out.println("10�̻� 20�̸��� ��");
				break;			
		case 2:
				System.out.println("20�̻� 30�̸��� ��");
				break;
		case 3:
				System.out.println("30�̻� 40�̸��� ��");
				break;
		case 4:
				System.out.println("40�̻� 50�̸��� ��");
				break;
		default:
				System.out.println("���� Ȥ�� 50 �̻��� ��");
				break;
		}
	}

}

// [����ǥ �ڵ�� Ȱ���ϱ�]

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