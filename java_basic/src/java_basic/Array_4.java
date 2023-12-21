package java_basic;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int STUDENT_NUM;
		final int SUBJECT_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		String[] name; //이름
		String[] subject; //과목
		int[][] score; //점수
		int[] total;
		float[] avg;
		
		System.out.println("학생 수: ");
		STUDENT_NUM = scann.nextInt();scann.nextLine();
		System.out.println("과목 수: ");
		SUBJECT_NUM = scann.nextInt();scann.nextLine();
		
		name = new String[STUDENT_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDENT_NUM][SUBJECT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		//과목명 입력
		for (int i=0; i<SUBJECT_NUM; i++) {
			System.out.println((i+1)+"/"+SUBJECT_NUM+" 번째 과목명: ");
			subject[i] = scann.nextLine();
		}
		
		//이름 입력
		for (int i=0; i<STUDENT_NUM; i++) { 
			System.out.println((i+1)+"/"+STUDENT_NUM+" 번째 학생 정보 입력");
			System.out.println("이름: ");
			name[i] = scann.nextLine();
		//점수 입력	
			for (int j=0; j<SUBJECT_NUM; j++) {
				System.out.println(subject[j]+" : ");
				score[i][j]=scann.nextInt();scann.nextLine();
			}
			System.out.println();
			
		}
		for(int i=0; i<STUDENT_NUM; i++) {
			for(int j=0; j<SUBJECT_NUM; j++) {
				total[i] = total[i]+score[j][j];
			}
			avg[i] = (total[0]/(float)SUBJECT_NUM*100+0.5f)/100f;
		}
		//출력
		System.out.println("순번\t이름");
		for (int i=0; i<SUBJECT_NUM; i++) {
			System.out.println(subject[i]+"\t");
		}
		System.out.println("총점\t평균");
		
		System.out.println();
		
		//학생 정보
		for (int i=0; i<STUDENT_NUM; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t");
			for (int j=0; j<SUBJECT_NUM; j++) {
				System.out.println(score[i][j]+"\t");
			}
			System.out.println(total[i]+"\t"+avg[i]+"\n");
		}
		System.out.println();
	}

}
