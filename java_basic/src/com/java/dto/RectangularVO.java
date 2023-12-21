package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;


public class RectangularVO extends Shape 
							implements Inputable, Outputable{

	// 11/24(금) Quiz_5
	
//	public int width; //가로
//	public int height; //세로
	private int width; //가로
	private int height; //세로

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
	
		System.out.print("가로: ");
		this.width = scann.nextInt();
		scann.nextLine();
		System.out.print("세로: ");
		this.height = scann.nextInt();
		scann.nextLine();
		
	}

	@Override
	public String output() {
		return "사각형 면적";
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
