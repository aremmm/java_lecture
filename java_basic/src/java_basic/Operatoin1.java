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
		
		System.out.println("ù��° ���� �Է�: ");
		firstInt=scann.nextInt();
		System.out.println("�ι�° ���� �Է�: ");
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
		
//		System.out.println("ù��° ���� : 3");
//		System.out.println("�ι�° ���� : 5");
//		System.out.println("���ϱ�: 8");
//		System.out.println("����: -2");
//		System.out.println("���ϱ�: 15");
//		System.out.println("������: 0.6");
//		System.out.println("��: 1");
//		System.out.println("������: 2");
		
//		System.out.println("ù��° ���� : "+3);
//		System.out.println("�ι�° ���� : "+5);
//		System.out.println("���ϱ�: "+(3+5));
//		System.out.println("����: "+(3-5));
//		System.out.println("���ϱ�: "+(3*5));
//		System.out.println("������: "+(3/(float)5));
//		System.out.println("��: "+(5/3));
//		System.out.println("������: "+(5%3));
		
		System.out.println("ù��° ���� : "+firstInt);
		System.out.println("�ι�° ���� : "+secondInt);
		System.out.println("���ϱ�: "+sum);
		System.out.println("����: "+minus);
		System.out.println("���ϱ�: "+multi);
		System.out.println("������: "+divid);
		
		System.out.println("��: "+quot);
		System.out.println("������: "+remaind);
		
		
		
		
	}

}
