package java_basic;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
//		11/21(ȭ)
			
//		quiz 1)
//		������ ���� �ϳ��� �Է¹޾� Ȧ�� Ȥ�� ¦�������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���)
//		���� �ϳ��� �Է��Ͻÿ�.
//		5
//		�Է��� ���� 5�� Ȧ���Դϴ�.
//		���)
//		���� �ϳ��� �Է��Ͻÿ�.
//		4
//		�Է��� ���� 4�� ¦���Դϴ�.
		
		int inputInt =0;
		char juge = ' '; // juge:�Ǻ�, char:����Ÿ��.�� �ϳ��� ���ڸ� �����Ѵٴ� ��.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��Ͻÿ�.: ");
		inputInt = scan.nextInt();
		
		if(inputInt %2>0) {
			juge = 'Ȧ';
		}else {
			juge = '¦';
		}
		System.out.println("�Է��� ���� "+inputInt+"�� "+juge+"�� �Դϴ�.");

	
	
	}

}
