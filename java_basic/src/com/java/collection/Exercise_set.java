package com.java.collection;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.java.comparator.ScoreTotalComparator;
import com.java.dto.ScoreVO;

public class Exercise_set {

	public static void main(String[] args) {
		// 1129(wed), 1218(mon)
		
		Set<ScoreVO> set = new TreeSet<ScoreVO>(); 
		//HashSet���� �ٲٰ� �й��� �Ȱ��� �־� ����ϸ� �̸��� ù��°�� ������
//		TreeSet���� �ٲٰ� �й��� �Ȱ��� �־� ����ϸ� �̸��� ��� ����.
		Set<ScoreVO> TreeSetByComparator
				=new TreeSet<ScoreVO>(new ScoreTotalComparator());

		for(int i=0; i<3; i++) {
			ScoreVO score1 = new ScoreVO();
			score1.input();
			
			set.add(score1);
			TreeSetByComparator.add(score1);
		}
		
		Iterator<ScoreVO> it = set.iterator();
		
		while(it.hasNext()) {
			it.next().printScore();
		}
		System.out.println("----------------");
	
		it = TreeSetByComparator.iterator();
		while(it.hasNext()) {
			it.next().printScore();
		}
	}
	}

		
//		set.add(1);
//		set.add(2);
//		set.add(8);
//		set.add(4);
//		set.add(3);		
//		set.add(6);
//		set.add(9);
//		set.add(7);
		
//		System.out.println("Set ������: "+set.size());
//		
//		Iterator<Integer> it = set.iterator(); //�� Set���� ���׸��� �־����� �Ʒ� Iterator���� ���׸��� �־��.
//		while(it.hasNext()) { //���� has�� �ִ��� ���� ���ǽ�.
//			System.out.println(it.next()); //�� �������� �������� ��¹�.
		
	

