package com.java.main;

import com.java.dto.Card;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		
//		c1.height = 9;
//		c1.width = 5;
//		c2.height = 12;
//		c2.width = 8;
//		c3.height = 11;
//		c3.width = 6;
		// 각각의 인스턴스는 독립적. 이것을 "인스턴스 변수".
		
		Card.width = 100;
		Card.height = 200;

		System.out.println("c1카드 너비: "+c1.width);
		System.out.println("c1카드 높이: "+c1.height);
		System.out.println("c2카드 너비: "+c2.width);
		System.out.println("c2카드 높이: "+c2.height);
		System.out.println("c3카드 너비: "+c3.width);
		System.out.println("c3카드 높이: "+c3.height);
		System.out.println("카드 너비: "+Card.width);
		System.out.println("카드 높이: "+Card.height);
		
		
		
	}

}
