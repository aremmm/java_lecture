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
		// ������ �ν��Ͻ��� ������. �̰��� "�ν��Ͻ� ����".
		
		Card.width = 100;
		Card.height = 200;

		System.out.println("c1ī�� �ʺ�: "+c1.width);
		System.out.println("c1ī�� ����: "+c1.height);
		System.out.println("c2ī�� �ʺ�: "+c2.width);
		System.out.println("c2ī�� ����: "+c2.height);
		System.out.println("c3ī�� �ʺ�: "+c3.width);
		System.out.println("c3ī�� ����: "+c3.height);
		System.out.println("ī�� �ʺ�: "+Card.width);
		System.out.println("ī�� ����: "+Card.height);
		
		
		
	}

}
