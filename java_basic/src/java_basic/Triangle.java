package java_basic;
import java.util.Scanner;

public class Triangle {
	
//	11/24(금) Quiz_5
// 삼각형, 사각형, 원의 넓이를 구하는 프로그램 출력.
// ㄴ> 세개 클래스 만들어서.
// ㄴ> 삼각형=밑변*높이*0.5
// ㄴ> 사각형=가로*세로
// ㄴ> 원=반지름*반지름*3.14
	public int baseLine; //밑변
	public int height; //높이
	
	public float getSize() { // getsize는 반환하는 함수.(float는 함수.) 
		return ((int)baseLine * height/2f); //넓이 구하는 함수
			
	}
	public void input() {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("밑변: ");
		baseLine=scann.nextInt();
		System.out.println("높이: ");
		height=scann.nextInt();scann.nextLine();
		
		System.out.println("밑변: "+baseLine+"\t높이: "+height+"\t넓이: "+getSize());
		
	}
}
