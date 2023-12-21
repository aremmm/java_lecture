package com.java.utill;

public class SrtingTest {
	
	public static void main(String[] args) {
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//string은 배열의 구조를 그대로 따라간다. 즉, string도 인덱스를 갖고 있다는 것.
		System.out.println(str);
		System.out.println(str.charAt(10));//인덱스 10번째에 해당되는 문자.(참고:인덱스는 0부터 시작.)
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(10));
		System.out.println(str.substring(0,10)); //0부터 10의 전까지 잘라낸다. 즉, 0부터 9까지.
		System.out.println(str.replace("ABC", "ㄱㄴㄷ"));
		System.out.println(str.contains("abc")); // 
		System.out.println(str.indexOf("abc")); //앞에서부터 찾아서 시작하는 인덱스
		System.out.println(str.lastIndexOf("abc")); //뒤에서부터 찾아서 시작하는 인덱스.
				
		
		String str2= "010-1234-5678";
		String[] strArray = str2.split("-"); //-으로 잘라서 세등분으로 만든다는 뜻.
		System.out.println(strArray[1]);
		System.out.println(str2.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$"));
		//^는 시작을 말한다. \\(역슬래쉬)뒤는 숫자를 나타내고, $는 끝난다는 뜻.
		// String str2= "010-1234-5678"; ("^\\d{2,3}-\\d{3,4}-\\d{4}$"));를 해석하면,
		// 시작은 숫자 2개
		System.out.println(str.equals(str2));
		System.out.println(str.toUpperCase().equalsIgnoreCase(str));
				
	}			

}
