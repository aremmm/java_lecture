package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class TriangleVO extends Shape 
						implements Inputable,Outputable{ //TriangleVO�� �Է�, ����� �� �� �ִٴ� ��

//	11/24(��) Quiz_5
// �ﰢ��, �簢��, ���� ���̸� ���ϴ� ���α׷� ���.
// ��> ���� Ŭ���� ����.
// ��> �ﰢ��=�غ�*����*0.5
// ��> �簢��=����*����
// ��> ��=������*������*3.14
//	public int height=10; //�غ�
//	public int baseLine=100; //����
	//private�� �ɸ� �ܺο����� ������ ���� ����. Ÿ Ŭ�������� ���� �Ұ���.
	//�����ʸ��콺��ư>source>generate getters and setters>get�� set ����>generate
	
	private int height=10; //�غ�  
	private int baseLine=100; //����
	
	//���콺 ������ ��ư>source>Generate Constructor using Fields>���� üũ��>finish
	//�Ʒ��� ���� �ڵ� �ڵ� �ۼ���. 
//	public TriangleVO(int baseLine, int height) {
//		this.baseLine = baseLine;
//		this.height = height;
	
//	public TriangleVO(int baseLine, float height) {}
//	public TriangleVO(float baseLine, int height) {}
		
	{
//		int temp = (int)(Math.random()*11);
//		if(temp*2==0) { //¦��/ temp�� 2�� ���� 0�̸� ¦��.
//			height = baseLine = 0;
//		}else { //Ȧ��. 1�̸� Ȧ��.
//			height = 1;
//			baseLine = 1;
		}
	
	public TriangleVO() {
		this.baseLine = 0;
		this.height = 0;
	}
		
	
	public TriangleVO(int baseLine, int height) {
		this.baseLine = baseLine; // �����ڴ� �и�������,
		this.height = height;
	}
	public int surface() {
		return(int)(height*baseLine*0.5f); // �޼ҵ�� �Һи��ϱ⿡ ��Ȯ�ϰ� �����ֱ�.
		
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
		
		System.out.print("�غ�: ");
		this.baseLine = scann.nextInt();
		scann.nextLine();
		System.out.print("����: ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String output() {
		return "�ﰢ�� ����";
		
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
	
	
