package java_basic;

import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {
		
//      11/21(ȭ)
//		quiz 3)
//		���� ���� �� ���α׷��� �ۼ��Ͻÿ�.
//		����)
//		��ǻ�ʹ� �����߽��ϴ�.
//		����� ������?
//		1. ���� 2.���� 3.��
//		����: 2
//		
//		��ǻ��: ����
//		���: ����
//		�̰���ϴ�.

		String com_kwb = "";
		int com_kwb_num = 0;

		String my_kwb = "";
		int my_kwb_num = 0;

		int menu = 0;
//		int juge = 0;
		String juge = "";

		com_kwb_num = (int) (Math.random() * 3);

		System.out.println("��ǻ�ʹ� �����߽��ϴ�.\n����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		System.out.println("����: ");

		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		my_kwb_num = menu - 1;
		if (com_kwb_num == ((my_kwb_num + 1) % 3)) {
			juge = "�����ϴ�.";
		} else {
			if (com_kwb_num == my_kwb_num) {
				juge = "�����ϴ�.";
			} else {
				juge = "�̰���ϴ�.";
			}
		}
		if (my_kwb_num == 0) {
			my_kwb = "����";
		} else if (my_kwb_num == 1) {
			my_kwb = "����";
		} else {
			my_kwb = "��";
		}

		if (com_kwb_num == 0) {
			com_kwb = "����";
		} else if (com_kwb_num == 1) {
			com_kwb = "����";
		} else {
			com_kwb = "��";
		}

		System.out.println("��ǻ��: " + com_kwb);
		System.out.println("���: " + my_kwb);
		System.out.println(juge);
		
		
		System.out.println("�̰���ϴ�.");
		System.out.println("�����ϴ�.");

//		Scanner scann = new Scanner(System.in);
//
//		int comNum = (int) (Math.random()*3) + 1;
//
//		System.out.println("��ǻ�ʹ� �����߽��ϴ�.\n����� ������?");
//		System.out.println("1.����, 2.����, 3.�� ");
//		int myNum = scann.nextInt();
//		if (comNum == 1) {
//			System.out.println("1.����");
//		}
//		if (comNum == 2) {
//			System.out.println("2.����");
//		}
//		if (comNum == 3) {
//			System.out.println("3.��");
//		}
//		if (myNum == 1) {
//			System.out.println("1.����");
//		}
//		if (myNum == 2) {
//			System.out.println("2.����");
//		}
//		if (myNum == 3) {
//			System.out.println("3.��");
//		}
//		if (comNum == myNum) {
//			System.out.println("�����ϴ�.");
//		}
//		else if ((comNum ==1&& myNum ==2)) ||((comNum ==3&& myNum ==2)) ||

	}
}
