package java_basic;

import java.util.Scanner;

public class For_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scann = new Scanner(System.in);
//		
//		int Num = scann.nextInt();
//		System.out.println("���� �Է�: ");
//		
//		for(int i=1;i<Num;i++) {
//	
//		System.out.println("*");
		
		Scanner scann = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int inputNum = scann.nextInt();
		
		String result = "";
		
		for(int i=0;i<inputNum;i++) {
			result = result+"*";
			
			System.out.println(result);
			
		
		}
		
		
		
	}

}
