package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// 231218(Mon)
		
		Set<Integer> lottoSet = new TreeSet<Integer>();
		
		while(lottoSet.size() < 6) { 
			//�ε����� 0���� �����ϴϱ� 6�� �ɶ� �����ٴ� ������ while�� �ۼ�.�ζǴ� �� 7���� ���ڰ� ��.
			int num = 1+(int)(Math.random()*45);
			
			lottoSet.add(num);
		}
		System.out.println(lottoSet);

	}

}
