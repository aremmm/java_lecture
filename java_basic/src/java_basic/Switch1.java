package java_basic;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputInt= 12;
		
//		switch(inputInt%2) {
//		case 0:
//			System.out.println("¦��");
//		case 1:
//			System.out.println("Ȧ��");
			
		switch(inputInt%5) { //inoutInt�� ���� 5�� ���������� ������ �� ã��.
		case 0:case 1:;
			System.out.println("�������� 0 �Ǵ� 1 �Դϴ�.");
		break; // brake�� ������ ���ǽ��� ���޾� �����. break�� �� ���ǽĿ��� �׸� �������´ٴ� ��.
		case 2:case 3:;
			System.out.println("�������� 2 �Ǵ� 3 �Դϴ�.");
		break;
		case 4:
			System.out.println("�������� 4 �Դϴ�.");
		break;
		default:
			System.out.println("�������� 5 �Ǵ� 6 �Դϴ�.");
		}
		}
		
		
	}

