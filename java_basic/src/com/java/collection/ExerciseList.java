package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseList {

	public static void main(String[] args) {
		// 1129(��),1215(��)
		
		List<Integer> list = new ArrayList<Integer>();
//      ��>List�� �θ�Ŭ����. ArrayList�� �ڽ� Ŭ����. List�� ������ �ǰ�, ArrayList�� �ڸ��� �ٸ� List��� ���� ����.
//		=> ������ ������ �ִ� ��. �������� ����Ʈ.
		
		list.add(3);
		list.add(1);
		list.add(2);
//		list.add(0,5);
		list.set(0, 5); //������ �ٲ��.add(3)�� ���� 5�� �Ǵ� ��.
		list.add(6);
		list.add(4);

//		list.add('a');
//		list.add("a");
//		list.add(false);		
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
	
		//�������ֱ�.
//		Collections.sort(list,Collections.reverseOrder());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(i+"���� ��: "+list.get(i));
		}
		


	}

}
