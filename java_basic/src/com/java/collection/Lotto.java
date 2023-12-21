package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// 231218(Mon)
		
		Set<Integer> lottoSet = new TreeSet<Integer>();
		
		while(lottoSet.size() < 6) { 
			//인덱스는 0부터 시작하니까 6이 될때 끝난다는 뜻으로 while문 작성.로또는 총 7개의 숫자가 들어감.
			int num = 1+(int)(Math.random()*45);
			
			lottoSet.add(num);
		}
		System.out.println(lottoSet);

	}

}
