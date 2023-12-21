package java_basic;

import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {
		
//      11/21(화)
//		quiz 3)
//		가위 바위 보 프로그램을 작성하시오.
//		실행)
//		컴퓨터는 결정했습니다.
//		당신의 선택은?
//		1. 가위 2.바위 3.보
//		선택: 2
//		
//		컴퓨터: 가위
//		당신: 바위
//		이겼습니다.

		String com_kwb = "";
		int com_kwb_num = 0;

		String my_kwb = "";
		int my_kwb_num = 0;

		int menu = 0;
//		int juge = 0;
		String juge = "";

		com_kwb_num = (int) (Math.random() * 3);

		System.out.println("컴퓨터는 결정했습니다.\n당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		System.out.println("선택: ");

		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		my_kwb_num = menu - 1;
		if (com_kwb_num == ((my_kwb_num + 1) % 3)) {
			juge = "졌습니다.";
		} else {
			if (com_kwb_num == my_kwb_num) {
				juge = "비겼습니다.";
			} else {
				juge = "이겼습니다.";
			}
		}
		if (my_kwb_num == 0) {
			my_kwb = "가위";
		} else if (my_kwb_num == 1) {
			my_kwb = "바위";
		} else {
			my_kwb = "보";
		}

		if (com_kwb_num == 0) {
			com_kwb = "가위";
		} else if (com_kwb_num == 1) {
			com_kwb = "바위";
		} else {
			com_kwb = "보";
		}

		System.out.println("컴퓨터: " + com_kwb);
		System.out.println("당신: " + my_kwb);
		System.out.println(juge);
		
		
		System.out.println("이겼습니다.");
		System.out.println("졌습니다.");

//		Scanner scann = new Scanner(System.in);
//
//		int comNum = (int) (Math.random()*3) + 1;
//
//		System.out.println("컴퓨터는 결정했습니다.\n당신의 선택은?");
//		System.out.println("1.가위, 2.바위, 3.보 ");
//		int myNum = scann.nextInt();
//		if (comNum == 1) {
//			System.out.println("1.가위");
//		}
//		if (comNum == 2) {
//			System.out.println("2.바위");
//		}
//		if (comNum == 3) {
//			System.out.println("3.보");
//		}
//		if (myNum == 1) {
//			System.out.println("1.가위");
//		}
//		if (myNum == 2) {
//			System.out.println("2.바위");
//		}
//		if (myNum == 3) {
//			System.out.println("3.보");
//		}
//		if (comNum == myNum) {
//			System.out.println("비겼습니다.");
//		}
//		else if ((comNum ==1&& myNum ==2)) ||((comNum ==3&& myNum ==2)) ||

	}
}
