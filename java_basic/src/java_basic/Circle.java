package java_basic;
import java.util.Scanner;

public class Circle {

//	11/24(��) Quiz_5
// �ﰢ��, �簢��, ���� ���̸� ���ϴ� ���α׷� ���.
// ��> ���� Ŭ���� ����.
// ��> �ﰢ��=�غ�*����*0.5
// ��> �簢��=����*����
// ��> ��=������*������*3.14
	public int radius; //������
	
	
	public float getSize() { // getsize�� ��ȯ�ϴ� �Լ�.(float�� �Լ�.) 
		return radius* 2* (float)Math.PI
				; //���� ���ϴ� �Լ�
			
	}public void input() {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("������: ");
		radius=scann.nextInt();
		
		
		System.out.println("������: "+radius+getSize());
		
	}
	
}
