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
		
		System.out.println("국어 점수: ");
		kor=scann.nextInt();
		System.out.println("영어 점수: ");
		eng=scann.nextInt();
		System.out.println("수학 점수: ");
		math=scann.nextInt();
		System.out.println("과학 점수: ");
		sci=scann.nextInt();
		
		
		
		
		float inputFloat = 1234.56789f;
		float outputFloat = 0f;
		
		outputFloat = (int)(inputFloat+100);
		outputFloat = (inputFloat*10);
		outputFloat = (int)(inputFloat*10+0.5f)/10f;
//		outputFloat = (int)(inputFloat*10+100/50)/10f;
		outputFloat = (int)((inputFloat*100+5)/10)/10f;
		
		System.out.println("입력값:"+inputFloat);
		System.out.println("반올림:"+outputFloat);
		
// EX_2.
// 국어, 영어, 수학, 과학 점수의 총점과 평균을 출력하시오. 단, 평균은 소수점 둘째 자리에서 반올림하시오.
// 결과) 국어, 영어, 수학, 과학, 총점, 평균
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
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor,eng,math,sci,total,avg,grade);
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,total,avg);
		
		
		
		
		
	}
	
}
		
		