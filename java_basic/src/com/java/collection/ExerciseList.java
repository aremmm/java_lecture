package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseList {

	public static void main(String[] args) {
		// 1129(수),1215(금)
		
		List<Integer> list = new ArrayList<Integer>();
//      ㄴ>List는 부모클래스. ArrayList는 자식 클래스. List는 고정이 되고, ArrayList의 자리에 다른 List들로 변경 가능.
//		=> 왼쪽은 실제로 있는 것. 오른쪽은 리스트.
		
		list.add(3);
		list.add(1);
		list.add(2);
//		list.add(0,5);
		list.set(0, 5); //순서가 바뀐다.add(3)의 값이 5가 되는 것.
		list.add(6);
		list.add(4);

//		list.add('a');
//		list.add("a");
//		list.add(false);		
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
	
		//정렬해주기.
//		Collections.sort(list,Collections.reverseOrder());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(i+"번지 값: "+list.get(i));
		}
		


	}

}
