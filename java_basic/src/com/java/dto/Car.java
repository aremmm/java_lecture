package com.java.dto;

public class Car {

	protected int wheel=4;  //protected: default + 같은 상속관계까지 쓸 수 있다.
	protected int breakk=4;
	protected int axel=4;
	
	public void speedUp() {
		System.out.println("부모: 속도업");
		
	};
	public void speedDown() {
		System.out.println("부모: 속도다운");
		
	};
	
	
	
}
