package java_basic;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		int total = 0;
		float avg =0f;
		char grade ='F';
		
		System.out.println("���� ����: ");
		kor=scann.nextInt();
		System.out.println("���� ����: ");
		eng=scann.nextInt();
		System.out.println("���� ����: ");
		math=scann.nextInt();
		System.out.println("���� ����: ");
		sci=scann.nextInt();
		
		
		
		
		float inputFloat = 1234.56789f;
		float outputFloat = 0f;
		
		outputFloat = (int)(inputFloat+100);
		outputFloat = (inputFloat*10);
		outputFloat = (int)(inputFloat*10+0.5f)/10f;
//		outputFloat = (int)(inputFloat*10+100/50)/10f;
		outputFloat = (int)((inputFloat*100+5)/10)/10f;
		
		System.out.println("�Է°�:"+inputFloat);
		System.out.println("�ݿø�:"+outputFloat);
		
// EX_2.
// ����, ����, ����, ���� ������ ������ ����� ����Ͻÿ�. ��, ����� �Ҽ��� ��° �ڸ����� �ݿø��Ͻÿ�.
// ���) ����, ����, ����, ����, ����, ���
//		 76    80    90    67    313   78.30
		
//		int kor = 76;
//		int eng = 80;
//		int math = 90;
//		int sci = 67;
////		int total;
////		float avg;
//		int total = 0;
//		float avg =0f;
		
		total = kor+eng+math+sci;
		avg = total/4f;
		avg = (int)((total*100+5)/10)/10f;
		
		if(avg<60) {grade='F';}
		if(avg>=60) {grade='d';}
		if(avg>=70) {grade='C';}
		if(avg>=80) {grade='B';}
		if(avg>=90) {grade='A';}
		
		
		
//		System.out.println(total)
//		System.out.println(avg)
		
		System.out.println("����\t����\t����\t����\t����\t���\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor,eng,math,sci,total,avg,grade);
		
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,total,avg);
		
		
		
		
		
	}
	
}
		
		