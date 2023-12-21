package com.java.main;

import com.java.solution.SurfaceSolution;


public class PolyMain {

//	private TriangleVO triangle;
//	private RectangularVO rectangular;
//	private CircleVO circle;
////	private Shape s;
////	private int menu;
//	
	public static void main(String[] args) {
		SurfaceSolution main = new SurfaceSolution();
		
		main.start();		
				
////		PolyMain main = new PolyMain();
////		
////		do {
////			main.input();
////			main.process();
////			main.output();
////		}while(true);
////	}
//
//		
//		// 11/24(금) Quiz_5
////		TriangleVO t = new TriangleVO();
////		System.out.println("baseLine: "+t.baseLine);
////		System.out.println("height: "+t.height);
//		
////		TriangleVO tt = new TriangleVO();
////		System.out.println("baseLine: "+tt.baseLine);
////	    System.out.println("height: "+tt.height);
////
////		System.out.println("t height: "+t.height);
////		System.out.println("t baseLine: "+t.baseLine);
////		System.out.println("tt height: "+tt.height);
////		System.out.println("tt baseLine: "+tt.baseLine);
////		
////		t.height =1; // 초기화 했다고 하지 않음. 이 코드는 변경했다는 코드.
////		t.baseLine=11;
//	
//	private void input() {
//		Scanner scann = new Scanner(System.in); //스캐너를 여러번 쓰려고 저장해놓은 것.
//		
//		System.out.println("도형을 선택하시오.");
//		System.out.println("1.삼각형  2.사각형  3.원");
//		int menu = scann.nextInt();scann.nextLine();
//		
//		RectangularVO s;
//		switch (menu) {
//		case 1://삼각형
//			s = new TriangleVO();
//			System.out.println("밑변: ");
//			triangle.setBaseLine(scann.nextInt());
//			scann.nextLine();
//			System.out.println("높이: ");
//			triangle.setHeight(scann.nextInt());
//			scann.nextLine();
//			break;
//		case 2://사각형
//			s = new RectangularVO();
//			System.out.println("가로: ");
//			rectangular.setWidth(scann.nextInt());
//			scann.nextLine();
//			System.out.println("세로: ");
//			rectangular.setHeight(scann.nextInt());
//			scann.nextLine();
//			break;
//		case 3://원
//			s = new CircleVO();
//			System.out.println("반지름: ");
//			circle.setRadius(scann.nextInt());
//			scann.nextLine();
//			break;
//		default:
//			System.out.println("입력이 올바르지 않습니다.");
//		}
//	}
//	private void process() {
//		int menu;
//		switch(menu) {
//		case 1:
//		case 2:
//		case 3:
//			break;
//		default:
//			System.out.println("프로그램을 종료합니다.");
////			System.exit(0);; //강제 종료.하지만 비추천!! 모든 프로세스가 다 강제종료되는거라 추천하지 않음.
//		
//		}
//	}
//	private void output() { //출력
//	
//		switch(menu) {
//		case 1:
//			System.out.println("삼각형 넓이: "+triangle.surface());
////			System.out.println("작성자: "+triangle.copyWriter());
//			break;
//		case 2:
//			System.out.println("사각형 넓이: "+rectangular.surface());
//			
//			break;
//		case 3:
//			System.out.println("원 넓이: "+circle.surface());
//			
//			break;
////		default:; 
//		}
//		System.out.println("종료(Q) 혹은 계속 하시려면 아무키나 누르세요.");
//		String menu = new Scanner(System.in).nextLine(); //nextInt 숫자/ nextLine은 문자
//		//반면, 이 스캐너는 여기서만 한번 쓰려고 해서 저장하진 않고 여기에 쓴것. 일회성 스캐너.
//		if(menu.toUpperCase().contentEquals("Q")) {
//			System.exit(0); //강제종료.
////			this.menu = -987654321;

	}
	

}
	
