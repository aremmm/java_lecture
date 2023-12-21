package java_basic;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
//		11/21(화)
			
//		quiz 1)
//		임의의 정수 하나를 입력받아 홀수 혹은 짝수인지를 판별하는 프로그램을 작성하시오.
//		결과)
//		정수 하나를 입력하시오.
//		5
//		입력한 정수 5는 홀수입니다.
//		결과)
//		정수 하나를 입력하시오.
//		4
//		입력한 정수 4는 짝수입니다.
		
		int inputInt =0;
		char juge = ' '; // juge:판별, char:문자타입.단 하나의 문자만 저장한다는 뜻.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 하나를 입력하시오.: ");
		inputInt = scan.nextInt();
		
		if(inputInt %2>0) {
			juge = '홀';
		}else {
			juge = '짝';
		}
		System.out.println("입력한 숫자 "+inputInt+"는 "+juge+"수 입니다.");

	
	
	}

}
