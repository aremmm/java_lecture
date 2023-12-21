package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.Inputable;
import com.java.ifc.Outputable;


public class SurfaceSolution {
	
	// 11/28(화)


	private Shape s;
	private int menu;

	public void input() {
		Scanner scann = new Scanner(System.in); //스캐너를 여러번 쓰려고 저장해놓은 것.
		
		System.out.println("도형을 선택하시오.");
		System.out.println("1.삼각형  2.사각형  3.원");
		menu = scann.nextInt();
		scann.nextLine();
		
		Inputable inputObject = null;
		
		switch (menu) {
		case 1: //삼각형
			inputObject = new TriangleVO();
//			TriangleVO t = (TriangleVO)s;
//			System.out.println("밑변: ");
//			t.setBaseLine(scann.nextInt());
//			scann.nextLine();
//			System.out.println("높이: ");
//			t.setHeight(scann.nextInt());
//			scann.nextLine();
			break;
		case 2: //사각형
			inputObject = new RectangularVO();
//			RectangularVO r = (RectangularVO)s;
//			System.out.println("가로: ");
//			r.setWidth(scann.nextInt());
//			scann.nextLine();
//			System.out.println("세로: ");
//			r.setHeight(scann.nextInt());
//			scann.nextLine();
			break;
		case 3: //원
			inputObject = new CircleVO();
//			CircleVO c =(CircleVO)s;
//			System.out.println("반지름: ");
//			c.setRadius(scann.nextInt());
//			scann.nextLine();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
		}
		inputObject.input();
		s=(Shape)inputObject;
		
		
	}
	protected void process() {
		switch(menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); //강제 종료.하지만 비추천!! 모든 프로세스가 다 강제종료되는거라 추천하지 않음.
		
		}
	}
	protected void output() {
		Outputable outObject = (Outputable)s;
		
		System.out.println(outObject.output()+s.surface());
//		System.out.println(s.outputMassage()+s.surface());
	
//	protected void output() { //출력
//		switch(menu) {
//		case 1:
//			System.out.println("삼각형 넓이: ");
////			System.out.println("작성자: "+triangle.copyWriter());
//			break;
//		case 2:
//			System.out.println("사각형 넓이: ");
////			System.out.println("작성자: "+rectangular.copyWriter());
//			break;
//		case 3:
//			System.out.println("원 넓이: ");
////			System.out.println("작성자: "+circle.copyWriter());
//			break;
////		default:; 
//		}
//		System.out.println(s.surface());
		
		System.out.println("종료(Q) 혹은 계속 하시려면 아무키나 누르세요.");
		String menu = new Scanner(System.in).nextLine(); //nextInt 숫자/ nextLine은 문자
		//반면, 이 스캐너는 여기서만 한번 쓰려고 해서 저장하진 않고 여기에 쓴것. 일회성 스캐너.
		if(menu.toUpperCase().contentEquals("Q")) {
			System.exit(0); //강제종료.
//			this.menu = -987654321;

	}
	

}
	public void start() {
		// TODO Auto-generated method stub
		
	}
	}
	


