package java_basic;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		학생 수를 입력받고, 그 학생 수만큼
//		실행)
//		학생 수: 2
//		학생1 정보입력
//		이름:이차돌
//		국어: 98
//		영어: 98
//		수학: 98
//		과학: 98
//		학생2 정보입력
//		이름: 차인태
//		국어: 78
//		영어: 78
//		수학: 78
//		과학: 78

		String[] label = { "순번", "국어", "영어", "수학", "과학" };

		Scanner scann = new Scanner(System.in);
		final int STUDENT_NUM;

		System.out.println("학생 수: ");
		STUDENT_NUM = scann.nextInt();

		String[] name = new String[STUDENT_NUM];
		int[] kor = new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] sci = new int[STUDENT_NUM];
		int[] total = new int[STUDENT_NUM];
		float[] avg = new float[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println("학생" + (i + 1) + "정보 입력");
			System.out.println("이름: "); // 이름을 출력.
			name[i] = scann.nextLine(); // nextLine은 개행을 그 다음으로 넘긴다는 것.
			System.out.println("국어: "); 
			kor[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("영어: ");
			eng[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("수학: ");
			math[i] = scann.nextInt();
			scann.nextLine();
			System.out.println("과학: ");
			sci[i] = scann.nextInt();
			scann.nextLine();

		}
		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + sci[stuNum];
			avg[stuNum] = (int) ((total[stuNum]/4f)*100+0.5f)/100f;
		}

//			total[0] = kor[0]+eng[0]+math[0]+sci[0];
//			avg[0] = (int)((total[0]/(float)(label.length-2))*100+0.5f)/1000f;
		System.out.println("정보입력을 마쳤습니다.");
		for (int i = 0; i < label.length; i++) {
			System.out.println(label[i] + "\t");
		}
		System.out.println();

		for (int stuNum = 0; stuNum < STUDENT_NUM; stuNum++) {
			System.out.println(label[stuNum] + "\t" + name[stuNum] + "\t" + kor[stuNum] + "\t" + eng[stuNum] + "\t"
					+ math[stuNum] + "\t" + sci[stuNum] + "\t" + total[stuNum] + "\t" + avg[stuNum] + "\t");
		}
	}

}
