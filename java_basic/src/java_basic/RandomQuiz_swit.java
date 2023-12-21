package java_basic;

import java.util.Scanner;

public class RandomQuiz_swit {

	public static void main(String[] args) {
//   11/21(화)
		String com_kwb = "";
		int com_kwb_num = 0;

		String my_kwb = "";
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";
		
		String quit = "";
		
		while (!quit.toUpperCase().equals("Q")) {
			
			com_kwb_num = (int) (Math.random() * 3);

		System.out.println("컴퓨터는 결정했습니다.\n당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		System.out.println("선택: ");

		Scanner scann = new Scanner(System.in);
		while(true) {
			System.out.println("1.가위 2.바위 3.보");
			menu = scann.nextInt();scann.nextLine();
		
			if(menu<1 || menu>3) {
				System.out.println("입력이 올바르지 않습니다.");
			}else {
				break;
			}
		}
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
		switch (my_kwb_num) {
		case 0:
			my_kwb = "가위";
			break;
		case 1:
			my_kwb = "바위";
			break;
		case 2:
			my_kwb = "보";
		}

		switch (com_kwb_num) {
		case 0:
			com_kwb = "가위";
			break;
		case 1:
			com_kwb = "바위";
			break;
		case 2:
			com_kwb = "보";
		}

		System.out.println("컴퓨터: " + com_kwb);
		System.out.println("당신: " + my_kwb);
		System.out.println(juge);
		
		
//		System.out.println("이겼습니다.");
//		System.out.println("졌습니다.");
		
		System.out.println("더 하시겠습니까?(그만: q");
		System.out.println("계속 하시겠으면 아무키나 누르세요.");
		quit = scann.nextLine();
		
	}


	}
}

