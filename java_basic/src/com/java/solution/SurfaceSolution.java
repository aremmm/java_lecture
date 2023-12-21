package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.Inputable;
import com.java.ifc.Outputable;


public class SurfaceSolution {
	
	// 11/28(ȭ)


	private Shape s;
	private int menu;

	public void input() {
		Scanner scann = new Scanner(System.in); //��ĳ�ʸ� ������ ������ �����س��� ��.
		
		System.out.println("������ �����Ͻÿ�.");
		System.out.println("1.�ﰢ��  2.�簢��  3.��");
		menu = scann.nextInt();
		scann.nextLine();
		
		Inputable inputObject = null;
		
		switch (menu) {
		case 1: //�ﰢ��
			inputObject = new TriangleVO();
//			TriangleVO t = (TriangleVO)s;
//			System.out.println("�غ�: ");
//			t.setBaseLine(scann.nextInt());
//			scann.nextLine();
//			System.out.println("����: ");
//			t.setHeight(scann.nextInt());
//			scann.nextLine();
			break;
		case 2: //�簢��
			inputObject = new RectangularVO();
//			RectangularVO r = (RectangularVO)s;
//			System.out.println("����: ");
//			r.setWidth(scann.nextInt());
//			scann.nextLine();
//			System.out.println("����: ");
//			r.setHeight(scann.nextInt());
//			scann.nextLine();
			break;
		case 3: //��
			inputObject = new CircleVO();
//			CircleVO c =(CircleVO)s;
//			System.out.println("������: ");
//			c.setRadius(scann.nextInt());
//			scann.nextLine();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
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
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); //���� ����.������ ����õ!! ��� ���μ����� �� ��������Ǵ°Ŷ� ��õ���� ����.
		
		}
	}
	protected void output() {
		Outputable outObject = (Outputable)s;
		
		System.out.println(outObject.output()+s.surface());
//		System.out.println(s.outputMassage()+s.surface());
	
//	protected void output() { //���
//		switch(menu) {
//		case 1:
//			System.out.println("�ﰢ�� ����: ");
////			System.out.println("�ۼ���: "+triangle.copyWriter());
//			break;
//		case 2:
//			System.out.println("�簢�� ����: ");
////			System.out.println("�ۼ���: "+rectangular.copyWriter());
//			break;
//		case 3:
//			System.out.println("�� ����: ");
////			System.out.println("�ۼ���: "+circle.copyWriter());
//			break;
////		default:; 
//		}
//		System.out.println(s.surface());
		
		System.out.println("����(Q) Ȥ�� ��� �Ͻ÷��� �ƹ�Ű�� ��������.");
		String menu = new Scanner(System.in).nextLine(); //nextInt ����/ nextLine�� ����
		//�ݸ�, �� ��ĳ�ʴ� ���⼭�� �ѹ� ������ �ؼ� �������� �ʰ� ���⿡ ����. ��ȸ�� ��ĳ��.
		if(menu.toUpperCase().contentEquals("Q")) {
			System.exit(0); //��������.
//			this.menu = -987654321;

	}
	

}
	public void start() {
		// TODO Auto-generated method stub
		
	}
	}
	


