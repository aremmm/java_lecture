package java_basic;
import java.util.Scanner;

public class quizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Quiz_1
// 4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ���)
// ���� �Է�: 6758
// 4�ڸ� ����: 6
// 3�ڸ� ����: 7
// 2�ڸ� ����: 5
// 1�ڸ� ����: 8
				
		Scanner scann = new Scanner(System.in);
		
		int inputInt = 6485;
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		float tempNum = inputInt / 10000f;
		
		tempNum = tempNum *10;
		e3 = (int)(tempNum);
		tempNum = tempNum - e3;
		
		tempNum = tempNum *10;
		e2 = (int)(tempNum);
		tempNum = tempNum - e2;
		
		tempNum = tempNum *10;
		e1 = (int)(tempNum);
		tempNum = tempNum - e1;
		
		tempNum = tempNum *10;
		e0 = (int)(tempNum);
		tempNum = tempNum - e0;
		
		System.out.println("������ �Է��ϼ���: "+inputInt);
		
		
		System.out.println("4�ڸ� ����: "+e3);
		System.out.println("3�ڸ� ����: "+e2);
		System.out.println("2�ڸ� ����: "+e1);
		System.out.println("1�ڸ� ����: "+e0);
		
		
		
		
		
		
		
	}

}
