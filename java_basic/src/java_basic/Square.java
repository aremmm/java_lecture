package java_basic;

import java.util.Scanner;

public class Square {

//	11/24(��) Quiz_5
// �ﰢ��, �簢��, ���� ���̸� ���ϴ� ���α׷� ���.
// ��> ���� Ŭ���� ����.
// ��> �ﰢ��=�غ�*����*0.5
// ��> �簢��=����*����
// ��> ��=������*������*3.14
	public int width; // ����
	public int height; // ����

	public float getSize() { // getsize�� ��ȯ�ϴ� �Լ�.(float�� �Լ�.)
		return ((int) width * height); // ���� ���ϴ� �Լ�

	}

	public void input() {

		Scanner scann = new Scanner(System.in);

		System.out.println("����: ");
		width = scann.nextInt();
		System.out.println("����: ");
		height = scann.nextInt();
		scann.nextLine();

		System.out.println("����: " + width + "����: " + height + "����: " + getSize());

	}

}
