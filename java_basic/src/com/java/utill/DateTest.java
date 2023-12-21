package com.java.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
//		1215(Fri)
		
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		//y:����(year) m:��(min,0~59��) M:��(Month,1~12��) s:��(seconds,0~59��) H:��(0~24��) h:��(1~12��) d:��(1~31��) D:��(1~366��)
		
		String todayStr = format.format(today);
		System.out.println(todayStr);
		
		todayStr = "1994-07-12 11:03:22";
		
		
		try {
			Date theDay = format.parse(todayStr);//parse(String sourse)�� ���ڿ��� ��¥ Date�ν��Ͻ��� ��ȯ���ش�.
			
			System.out.println(theDay);
			
		} catch (ParseException e) {
			e.printStackTrace();
	}

	}
}
