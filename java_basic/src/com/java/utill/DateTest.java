package com.java.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
//		1215(Fri)
		
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		//y:연도(year) m:분(min,0~59분) M:월(Month,1~12월) s:초(seconds,0~59초) H:시(0~24시) h:시(1~12시) d:일(1~31일) D:일(1~366일)
		
		String todayStr = format.format(today);
		System.out.println(todayStr);
		
		todayStr = "1994-07-12 11:03:22";
		
		
		try {
			Date theDay = format.parse(todayStr);//parse(String sourse)는 문자열을 날짜 Date인스턴스로 변환해준다.
			
			System.out.println(theDay);
			
		} catch (ParseException e) {
			e.printStackTrace();
	}

	}
}
