package java_basic;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		�л� ���� �Է¹ް�, �� �л� ����ŭ
//		����)
//		�л� ��: 2
//		�л�1 �����Է�
//		�̸�:������
//		����: 98
//		����: 98
//		����: 98
//		����: 98
//		�л�2 �����Է�
//		�̸�: ������
//		����: 78
//		����: 78
//		����: 78
//		����: 78

		String[] label = { "����", "����", "����", "����", "����" };

		Scanner scann = new Scanner(System.in);
		final int STUDENT_NUM;

		System.out.println("�л� ��: ");
		STUDENT_NUM = scann.nextInt();

		String[] name = new String[STUDENT_NUM];
		int[] kor = new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] sci = new int[STUDENT_NUM];
		int[] total = new int[STUDENT_NUM];
		float[] avg = new float[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("�л�" + (i + 1) + "���� �Է�");
			System.out.println("�̸�: "); // �̸��� ���.
			name[i] = scann.nextLine(); // nextLine�� ������ �� �������� �ѱ�ٴ� ��.
			System.out.println("����: "); 
			kor[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("����: ");
			eng[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("����: ");
			math[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("����: ");
			sci[i] = scann.nextInt();
			scann.nextLine();

		}
		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + sci[stuNum];
			avg[stuNum] = (int) ((total[stuNum]/4f)*100+0.5f)/100f;
		}

//			total[0] = kor[0]+eng[0]+math[0]+sci[0];
//			avg[0] = (int)((total[0]/(float)(label.length-2))*100+0.5f)/1000f;
		System.out.println("�����Է��� ���ƽ��ϴ�.");
		for (int i = 0; i < label.length; i++) {
			System.out.println(label[i] + "\t");
		}
		System.out.println();

		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			System.out.println(label[stuNum] + "\t" + name[stuNum] + "\t" + kor[stuNum] + "\t" + eng[stuNum] + "\t"
					+ math[stuNum] + "\t" + sci[stuNum] + "\t" + total[stuNum] + "\t" + avg[stuNum] + "\t");
		}
	}

}
