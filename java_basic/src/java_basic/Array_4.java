package java_basic;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int STUDENT_NUM;
		final int SUBJECT_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		String[] name; //�̸�
		String[] subject; //����
		int[][] score; //����
		int[] total;
		float[] avg;
		
		System.out.println("�л� ��: ");
		STUDENT_NUM = scann.nextInt();scann.nextLine();
		System.out.println("���� ��: ");
		SUBJECT_NUM = scann.nextInt();scann.nextLine();
		
		name = new String[STUDENT_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDENT_NUM][SUBJECT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		//����� �Է�
		for (int i=0; i<SUBJECT_NUM; i++) {
			System.out.println((i+1)+"/"+SUBJECT_NUM+" ��° �����: ");
			subject[i] = scann.nextLine();
		}
		
		//�̸� �Է�
		for (int i=0; i<STUDENT_NUM; i++) { 
			System.out.println((i+1)+"/"+STUDENT_NUM+" ��° �л� ���� �Է�");
			System.out.println("�̸�: ");
			name[i] = scann.nextLine();
		//���� �Է�	
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
		//���
		System.out.println("����\t�̸�");
		for (int i=0; i<SUBJECT_NUM; i++) {
			System.out.println(subject[i]+"\t");
		}
		System.out.println("����\t���");
		
		System.out.println();
		
		//�л� ����
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
