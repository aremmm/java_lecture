package java_basic;

import java.util.Scanner;

public class RandomQuiz_swit {

	public static void main(String[] args) {
//   11/21(ȭ)
		String com_kwb = "";
		int com_kwb_num = 0;

		String my_kwb = "";
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";
		
		String quit = "";
		
		while (!quit.toUpperCase().equals("Q")) {
			
			com_kwb_num = (int) (Math.random() * 3);

		System.out.println("��ǻ�ʹ� �����߽��ϴ�.\n����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		System.out.println("����: ");

		Scanner scann = new Scanner(System.in);
		while(true) {
			System.out.println("1.���� 2.���� 3.��");
			menu = scann.nextInt();scann.nextLine();
		
			if(menu<1 || menu>3) {
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			}else {
				break;
			}
		}
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
		switch (my_kwb_num) {
		case 0:
			my_kwb = "����";
			break;
		case 1:
			my_kwb = "����";
			break;
		case 2:
			my_kwb = "��";
		}

		switch (com_kwb_num) {
		case 0:
			com_kwb = "����";
			break;
		case 1:
			com_kwb = "����";
			break;
		case 2:
			com_kwb = "��";
		}

		System.out.println("��ǻ��: " + com_kwb);
		System.out.println("���: " + my_kwb);
		System.out.println(juge);
		
		
//		System.out.println("�̰���ϴ�.");
//		System.out.println("�����ϴ�.");
		
		System.out.println("�� �Ͻðڽ��ϱ�?(�׸�: q");
		System.out.println("��� �Ͻð����� �ƹ�Ű�� ��������.");
		quit = scann.nextLine();
		
	}


	}
}

