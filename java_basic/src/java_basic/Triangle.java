package java_basic;
import java.util.Scanner;

public class Triangle {
	
//	11/24(��) Quiz_5
// �ﰢ��, �簢��, ���� ���̸� ���ϴ� ���α׷� ���.
// ��> ���� Ŭ���� ����.
// ��> �ﰢ��=�غ�*����*0.5
// ��> �簢��=����*����
// ��> ��=������*������*3.14
	public int baseLine; //�غ�
	public int height; //����
	
	public float getSize() { // getsize�� ��ȯ�ϴ� �Լ�.(float�� �Լ�.) 
		return ((int)baseLine * height/2f); //���� ���ϴ� �Լ�
			
	}
	public void input() {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("�غ�: ");
		baseLine=scann.nextInt();
		System.out.println("����: ");
		height=scann.nextInt();scann.nextLine();
		
		System.out.println("�غ�: "+baseLine+"\t����: "+height+"\t����: "+getSize());
		
	}
}
