package java_basic;

import java.util.Scanner;

public class Square {

//	11/24(금) Quiz_5
// 삼각형, 사각형, 원의 넓이를 구하는 프로그램 출력.
// ㄴ> 세개 클래스 만들어서.
// ㄴ> 삼각형=밑변*높이*0.5
// ㄴ> 사각형=가로*세로
// ㄴ> 원=반지름*반지름*3.14
	public int width; // 가로
	public int height; // 세로

	public float getSize() { // getsize는 반환하는 함수.(float는 함수.)
		return ((int) width * height); // 넓이 구하는 함수

	}

	public void input() {

		Scanner scann = new Scanner(System.in);

		System.out.println("가로: ");
		width = scann.nextInt();
		System.out.println("세로: ");
		height = scann.nextInt();
		scann.nextLine();

		System.out.println("가로: " + width + "세로: " + height + "넓이: " + getSize());

	}

}
