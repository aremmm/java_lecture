package java_basic;
import java.util.Scanner;

public class consoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
		float outputFloat = 0f;
		
		System.out.println("반올림할 실수를 입력하세요: ");
		inputFloat=scann.nextFloat();
		
//		float inputFloat = scann.nextFloat();
//		float outputFloat = 0f;

		outputFloat = (int)((inputFloat*100+5)/10)/10f;
		
		System.out.println("입력값:"+inputFloat);
		System.out.println("반올림:"+outputFloat);
		
		
		
//		정수 입력: scann.nextInt()
//		실수 입력: scann.nextFloat()
		
//		System.out.print("정수를 입력:");
//		int inputInt = scann.nextInt();
//		System.out.print("실수를 입력:");
//		Float inputFloat = scann.nextFloat();
//		
//		System.out.println("입력한 정수: "+inputInt);
//		System.out.println("입력한 실수: "+inputFloat);
//		
		
	}

}
