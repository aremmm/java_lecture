package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class TriangleVO extends Shape 
						implements Inputable,Outputable{ //TriangleVO가 입력, 출력을 할 수 있다는 것

//	11/24(금) Quiz_5
// 삼각형, 사각형, 원의 넓이를 구하는 프로그램 출력.
// ㄴ> 세개 클래스 만들어서.
// ㄴ> 삼각형=밑변*높이*0.5
// ㄴ> 사각형=가로*세로
// ㄴ> 원=반지름*반지름*3.14
//	public int height=10; //밑변
//	public int baseLine=100; //높이
	//private로 걸면 외부에서는 접근을 하지 못함. 타 클래스에서 접근 불가능.
	//오른쪽마우스버튼>source>generate getters and setters>get과 set 선택>generate
	
	private int height=10; //밑변  
	private int baseLine=100; //높이
	
	//마우스 오른쪽 버튼>source>Generate Constructor using Fields>선택 체크후>finish
	//아래와 같이 자동 코드 작성됨. 
//	public TriangleVO(int baseLine, int height) {
//		this.baseLine = baseLine;
//		this.height = height;
	
//	public TriangleVO(int baseLine, float height) {}
//	public TriangleVO(float baseLine, int height) {}
		
	{
//		int temp = (int)(Math.random()*11);
//		if(temp*2==0) { //짝수/ temp를 2로 나눠 0이면 짝수.
//			height = baseLine = 0;
//		}else { //홀수. 1이면 홀수.
//			height = 1;
//			baseLine = 1;
		}
	
	public TriangleVO() {
		this.baseLine = 0;
		this.height = 0;
	}
		
	
	public TriangleVO(int baseLine, int height) {
		this.baseLine = baseLine; // 생성자는 분명하지만,
		this.height = height;
	}
	public int surface() {
		return(int)(height*baseLine*0.5f); // 메소드는 불분명하기에 정확하게 정해주기.
		
	}
//	public void setHeight(int height) { //
//		this.height = height;


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getBaseLine() {
		return baseLine;
	}


	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}
	
	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("밑변: ");
		this.baseLine = scann.nextInt();
		scann.nextLine();
		System.out.print("높이: ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String output() {
		return "삼각형 넓이";
		
	}


	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int outputMassage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	} 
	
	
