package java_basic;
import java.util.Scanner;

public class For_3 {

	public static void main(String[] args) {

//		������ ���ڸ� �Է¹޾� �ڼ����� Ȯ���ϴ� ���α׷� ���.
//		
//		����)
//		�����Է�: 127
//		�ڼ��Դϴ�.
//
//		����)
//		���� �Է�: 12
//		�ڼ��� �ƴմϴ�.
		
		Scanner scann = new Scanner(System.in);
		
		int temp = scann.nextInt();
//		int temp=127;
		boolean isFrime = true; // �Ҽ��ϰ�� = Ʈ��
		
		for (int i=2;i<temp;i++) { // 2�� �����ϰ�, temp ���ϱ��� �ݺ�.
			if(temp%1 ==0) { // temp�� 1�� ���� �������� 0�� ���.
				isFrime = false; 
			}
		}
		
		if(isFrime) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			
		}
		
		
		
//		int Num = 127;
//		
//		for (int i=2;i<=Num;i++) {
//			if (Num%1 ==0) {
//				
//			}
//			
//		}
//		System.out.println("������ �Է��ϼ���: ");

		
		
	}

}
