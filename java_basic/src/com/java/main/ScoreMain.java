package com.java.main;

import com.java.dto.ScoreVO;

public class ScoreMain {
	
	public static void main(String[] args) {

//	11/24(±Ý)
	
	ScoreVO s = new ScoreVO();
	
//	s.kor = 98;
//	s.math = 90;
//	s.eng = 87;
//	s.sci = 78;
//	
	System.out.println("ÃÑÁ¡: "+s.total());
	System.out.println("Æò±Õ: "+s.avg());
	
	
	
}

}