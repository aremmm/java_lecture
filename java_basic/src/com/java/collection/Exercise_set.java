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
		//HashSet으로 바꾸고 학번을 똑같이 넣어 출력하면 이름이 첫번째만 나오고
//		TreeSet으로 바꾸고 학번을 똑같이 넣어 출력하면 이름이 모두 나옴.
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
		
//		System.out.println("Set 사이즈: "+set.size());
//		
//		Iterator<Integer> it = set.iterator(); //위 Set에도 제네릭을 넣었으면 아래 Iterator에도 제네릭을 넣어야.
//		while(it.hasNext()) { //다음 has가 있는지 묻는 조건식.
//			System.out.println(it.next()); //그 다음것을 꺼내오는 출력문.
		
	

