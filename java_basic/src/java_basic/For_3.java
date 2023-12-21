package java_basic;
import java.util.Scanner;

public class For_3 {

	public static void main(String[] args) {

//		임의의 숫자를 입력받아 솟수인지 확인하는 프로그램 출력.
//		
//		실행)
//		정수입력: 127
//		솟수입니다.
//
//		실행)
//		정수 입력: 12
//		솟수가 아닙니다.
		
		Scanner scann = new Scanner(System.in);
		
		int temp = scann.nextInt();
//		int temp=127;
		boolean isFrime = true; // 소수일경우 = 트루
		
		for (int i=2;i<temp;i++) { // 2씩 증가하고, temp 이하까지 반복.
			if(temp%1 ==0) { // temp를 1로 나눈 나머지가 0일 경우.
				isFrime = false; 
			}
		}
		
		if(isFrime) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
			
		}
		
		
		
//		int Num = 127;
//		
//		for (int i=2;i<=Num;i++) {
//			if (Num%1 ==0) {
//				
//			}
//			
//		}
//		System.out.println("정수를 입력하세요: ");

		
		
	}

}
