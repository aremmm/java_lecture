package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;


public class RectangularVO extends Shape 
							implements Inputable, Outputable{

	// 11/24(��) Quiz_5
	
//	public int width; //����
//	public int height; //����
	private int width; //����
	private int height; //����

	public RectangularVO() {}
	
	public RectangularVO(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	public int surface() {
		return(int)(width*height);
		
}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
	
		System.out.print("����: ");
		this.width = scann.nextInt();
		scann.nextLine();
		System.out.print("����: ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String output() {
		return "�簢�� ����";
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
