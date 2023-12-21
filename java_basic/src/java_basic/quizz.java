package java_basic;
import java.util.Scanner;

public class quizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Quiz_1
// 4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오.
// 결과)
// 정수 입력: 6758
// 4자리 숫자: 6
// 3자리 숫자: 7
// 2자리 숫자: 5
// 1자리 숫자: 8
				
		Scanner scann = new Scanner(System.in);
		
		int inputInt = 6485;
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		float tempNum = inputInt / 10000f;
		
		tempNum = tempNum *10;
		e3 = (int)(tempNum);
		tempNum = tempNum - e3;
		
		tempNum = tempNum *10;
		e2 = (int)(tempNum);
		tempNum = tempNum - e2;
		
		tempNum = tempNum *10;
		e1 = (int)(tempNum);
		tempNum = tempNum - e1;
		
		tempNum = tempNum *10;
		e0 = (int)(tempNum);
		tempNum = tempNum - e0;
		
		System.out.println("정수를 입력하세요: "+inputInt);
		
		
		System.out.println("4자리 숫자: "+e3);
		System.out.println("3자리 숫자: "+e2);
		System.out.println("2자리 숫자: "+e1);
		System.out.println("1자리 숫자: "+e0);
		
		
		
		
		
		
		
	}

}
