package java_basic;
import java.util.Scanner;

public class consoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
		float outputFloat = 0f;
		
		System.out.println("�ݿø��� �Ǽ��� �Է��ϼ���: ");
		inputFloat=scann.nextFloat();
		
//		float inputFloat = scann.nextFloat();
//		float outputFloat = 0f;

		outputFloat = (int)((inputFloat*100+5)/10)/10f;
		
		System.out.println("�Է°�:"+inputFloat);
		System.out.println("�ݿø�:"+outputFloat);
		
		
		
//		���� �Է�: scann.nextInt()
//		�Ǽ� �Է�: scann.nextFloat()
		
//		System.out.print("������ �Է�:");
//		int inputInt = scann.nextInt();
//		System.out.print("�Ǽ��� �Է�:");
//		Float inputFloat = scann.nextFloat();
//		
//		System.out.println("�Է��� ����: "+inputInt);
//		System.out.println("�Է��� �Ǽ�: "+inputFloat);
//		
		
	}

}
