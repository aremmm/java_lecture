package com.java.utill;

public class SrtingTest {
	
	public static void main(String[] args) {
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//string�� �迭�� ������ �״�� ���󰣴�. ��, string�� �ε����� ���� �ִٴ� ��.
		System.out.println(str);
		System.out.println(str.charAt(10));//�ε��� 10��°�� �ش�Ǵ� ����.(����:�ε����� 0���� ����.)
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(10));
		System.out.println(str.substring(0,10)); //0���� 10�� ������ �߶󳽴�. ��, 0���� 9����.
		System.out.println(str.replace("ABC", "������"));
		System.out.println(str.contains("abc")); // 
		System.out.println(str.indexOf("abc")); //�տ������� ã�Ƽ� �����ϴ� �ε���
		System.out.println(str.lastIndexOf("abc")); //�ڿ������� ã�Ƽ� �����ϴ� �ε���.
				
		
		String str2= "010-1234-5678";
		String[] strArray = str2.split("-"); //-���� �߶� ��������� ����ٴ� ��.
		System.out.println(strArray[1]);
		System.out.println(str2.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$"));
		//^�� ������ ���Ѵ�. \\(��������)�ڴ� ���ڸ� ��Ÿ����, $�� �����ٴ� ��.
		// String str2= "010-1234-5678"; ("^\\d{2,3}-\\d{3,4}-\\d{4}$"));�� �ؼ��ϸ�,
		// ������ ���� 2��
		System.out.println(str.equals(str2));
		System.out.println(str.toUpperCase().equalsIgnoreCase(str));
				
	}			

}
