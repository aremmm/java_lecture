package java_basic;
import java.util.Scanner;

public class Operatoin1 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int firstInt=0;
		int secondInt=0;
		
		float sum=0f;
		float minus=0f;
		float multi=0f;
		float divid=0f;
		
		int quot=0;
		int remaind=0;
		
		System.out.println("첫번째 정수 입력: ");
		firstInt=scann.nextInt();
		System.out.println("두번째 정수 입력: ");
		secondInt=scann.nextInt();
		
//		int firstInt=3;
//		int secondInt=5;
//		
//		float sum;
//		float minus;
//		float multi;
//		float divid;
//		
//		int quot;
//		int remaind;
		
		sum = firstInt + secondInt;
		minus = firstInt - secondInt;
		multi = firstInt * secondInt;
		divid = firstInt / (float)secondInt;
		
		quot = secondInt / firstInt;
		remaind = secondInt % firstInt;
		
//		System.out.println("첫번째 정수 : 3");
//		System.out.println("두번째 정수 : 5");
//		System.out.println("더하기: 8");
//		System.out.println("빼기: -2");
//		System.out.println("곱하기: 15");
//		System.out.println("나누기: 0.6");
//		System.out.println("몫: 1");
//		System.out.println("나머지: 2");
		
//		System.out.println("첫번째 정수 : "+3);
//		System.out.println("두번째 정수 : "+5);
//		System.out.println("더하기: "+(3+5));
//		System.out.println("빼기: "+(3-5));
//		System.out.println("곱하기: "+(3*5));
//		System.out.println("나누기: "+(3/(float)5));
//		System.out.println("몫: "+(5/3));
//		System.out.println("나머지: "+(5%3));
		
		System.out.println("첫번째 정수 : "+firstInt);
		System.out.println("두번째 정수 : "+secondInt);
		System.out.println("더하기: "+sum);
		System.out.println("빼기: "+minus);
		System.out.println("곱하기: "+multi);
		System.out.println("나누기: "+divid);
		
		System.out.println("몫: "+quot);
		System.out.println("나머지: "+remaind);
		
		
		
		
	}

}
